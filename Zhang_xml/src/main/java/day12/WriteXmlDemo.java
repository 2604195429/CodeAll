package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * ʹ��MOD����xml�ĵ�
 * 
 * @author ���»�
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "zhang", 123, "��", 3223));
		empList.add(new Emp(2, "huang", 223, "��", 3223));
		empList.add(new Emp(3, "xin", 323, "��", 3223));
		empList.add(new Emp(4, "hua", 423, "��", 3223));
		empList.add(new Emp(5, "cao", 523, "��", 3223));
		empList.add(new Emp(6, "afa", 623, "��", 3223));
		empList.add(new Emp(7, "fa", 723, "��", 3223));
		/*
		 * ��empList �����е�Ա����Ϣ���浽myemp.xml��
		 * 
		 */
		XMLWriter writer = null;
		try {
			Document document = DocumentHelper.createDocument();

			Element root = document.addElement("list");

			for (Emp emp : empList) {
				Element empElement = root.addElement("emp");
				empElement.addAttribute("id", emp.getId() + "");
				Element name = empElement.addElement("name");
				name.addText(emp.getName());
				Element age = empElement.addElement("age");
				age.addText(emp.getAge() + "");
				Element salary = empElement.addElement("salary");
				salary.addText(emp.getSalary() + "");
				Element gender = empElement.addElement("gender");
				gender.addText(emp.getGender());
			}
			writer = new XMLWriter(new FileOutputStream("myemp.xml"), OutputFormat.createPrettyPrint());
			writer.write(document);
			System.out.println("д�����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
