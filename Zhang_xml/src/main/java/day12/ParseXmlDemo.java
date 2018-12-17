package day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用dom解析xml文档
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		/*
		 * 解析empxml文档，将所有员工信息解析出来，转换若干个emp实例，存入一个list集合中
		 */

		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new FileInputStream("emplist.xml"));
			/*
			 * 每个element表示一个元素（一对标签）
			 */
			Element root = document.getRootElement();

			List<Emp> empList = new ArrayList<Emp>();
			List<Element> elements = root.elements();
			for (Element e : elements) {
				Emp emp = new Emp();
				Element name = e.element("name");
				emp.setName(name.getText());

				Element age = e.element("age");
				emp.setAge(Integer.parseInt(age.getText()));

				Element gender = e.element("gender");
				emp.setGender(gender.getText());

				Element salary = e.element("salary");
				emp.setSalary(Integer.parseInt(salary.getText()));

				Attribute attr = e.attribute("id");
				emp.setId(Integer.parseInt(attr.getValue()));

				empList.add(emp);
			}
			System.out.println(empList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
