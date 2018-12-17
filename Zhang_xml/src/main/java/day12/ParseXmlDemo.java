package day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��dom����xml�ĵ�
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		/*
		 * ����empxml�ĵ���������Ա����Ϣ����������ת�����ɸ�empʵ��������һ��list������
		 */

		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new FileInputStream("emplist.xml"));
			/*
			 * ÿ��element��ʾһ��Ԫ�أ�һ�Ա�ǩ��
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
