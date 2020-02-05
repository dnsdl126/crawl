package webcrawl.daum;

import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class OneMovie {
	public static void main(String[] args) throws IOException{
		String url = "https://movie.daum.net/moviedb/grade?movieId=134091";
		
		//평점
		//내용
		//작성일자
		
		Document doc = Jsoup.connect(url).get();
		 
		
		Elements urls = doc.select("li.list_review list_netizen > div.review_info ");
		int count = 0;
		 for(Element element : urls) {
			 count++;
			 
			 String li = element.attr("li.fst");
			 
			 Document docNews = Jsoup.connect(li ).get();
			 
		
			
		Elements title = docNews.select("em.link_profile");
		Elements star = docNews.select("em.emph_grade");
		Elements write =docNews.select("p.desc_review");
		Elements day = docNews.select("span.info_append");
		
		
		System.out.println("닉네임 :" + title.text()); 
		System.out.println("평점 :" + star.text()); 
		System.out.println("댓글 :" + write.text()); 
		System.out.println("날짜 :" + day.text()); 
		}
	}
}

