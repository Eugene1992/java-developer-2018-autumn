package java_professional.multithread;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
В файле .pom нужно добавить блок
	<dependencies>
        <dependency>
            <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.11.3</version>
        </dependency>
    </dependencies>
 */

public class MainMultithreadCheck {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("http://flangex.herokuapp.com/io/load").get();
			Elements elements = doc.select("a[href]");
//			for (int i = 0; i < elements.size(); i++) {
//				String fileUrl = "http://flangex.herokuapp.com"+elements.get(i).attr("href");
//				String filename = fileUrl.substring(fileUrl.lastIndexOf('/') + 1);
//				new NewTread(fileUrl,"D:\\Java\\"+filename).start();
//			}
            elements.stream()
                    .forEach(element -> new NewTread("http://flangex.herokuapp.com" + element.attr("href"),
                            "D:\\Java\\" + (element.attr("href").substring(element.attr("href")
                                    .lastIndexOf('/') + 1))).start());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
