/*
 * 다음 뉴스 1건에서 제목과 본문을 수집 
 */

package webcrawl.daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class OneNews {
	public static void main(String[] args) throws IOException{
		
		// 데이터를 수집 할 사이트 주소 
		String url = "https://entertain.v.daum.net/v/20200205143853187";
		// URL 문서에 전체 태크를 Select 함 
		Document doc = Jsoup.connect(url).get();
		
		// 전체 태그에서 원하는 항목만 select 함 
		Elements title = doc.select("h3.tit_view");
		Elements content = doc.select("div#harmonyContainer");// 본문
		
		//.text() >>> 태그 및 속성은 지우고 content 내용만 추출 
		System.out.println(title.text()); 
		System.out.println(content.text()); 
	}
}
