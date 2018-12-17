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
 * 使用MOD生成xml文档
 * 
 * @author 张新华
 *
 */
public class WriteXmlDemo {
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "zhang", 123, "男", 3223));
		empList.add(new Emp(2, "huang", 223, "男", 3223));
		empList.add(new Emp(3, "xin", 323, "男", 3223));
		empList.add(new Emp(4, "hua", 423, "男", 3223));
		empList.add(new Emp(5, "cao", 523, "男", 3223));
		empList.add(new Emp(6, "afa", 623, "男", 3223));
		empList.add(new Emp(7, "fa", 723, "男", 3223));
		/*
		 * 将empList 集合中的员工信息保存到myemp.xml中
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
			System.out.println("写出完毕");
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
