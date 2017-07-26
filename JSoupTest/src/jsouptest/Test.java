package jsouptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {

	public static void main(String[] args) throws IOException {
		URL example = new URL("http://example.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(example.openStream()));

		StringBuilder websiteSource = new StringBuilder();
		String tmpString = null;
		while ((tmpString = in.readLine()) != null) {
			websiteSource.append(tmpString);
		}
		in.close();
//		System.out.println(websiteSource.toString());
		Document doc = Jsoup.parse(websiteSource.toString());
		Elements h1Elements = doc.getElementsByTag("h1");

		for (Element element : h1Elements) {
			System.out.println(element.text());
		}
	}

}
