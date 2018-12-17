package day12;

import java.io.FileInputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 
 * @author ÕÅÐÂ»ª
 *
 */
public class XPathDemo {
	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new FileInputStream("myemp.xml"));
			List<Element> list = doc.selectNodes("/list/emp/name");
			for (Element e : list) {
				System.out.println(e.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
