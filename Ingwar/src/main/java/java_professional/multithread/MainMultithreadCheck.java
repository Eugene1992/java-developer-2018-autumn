package java_professional.multithread;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class MainMultithreadCheck {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("http://flangex.herokuapp.com/io/load").get();
			Elements elements = doc.select("a[href]");
			String[] prices = new String[elements.size()];
			for (int i = 0; i < elements.size(); i++) {
//			    prices[i] = elements.get(i).text();
//			    System.out.println(elements.get(i).attr("href"));
				new NewTread(elements.get(i).attr("href"),"D:\\Java").start();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
