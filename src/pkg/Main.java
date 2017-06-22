package pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentImplement;

public class Main {
	public static void main(String[] args) {
		//Always get the context first; always use AbstractApplicationContext so that you can directly destroy it 
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");
		//Get the DAO implemetation class
		StudentImplement so=(StudentImplement) context.getBean("so");
		
		//insert a new student called Kenny whose grade is 95. Well done Kenny!
		try {
			so.insert("Kenny", "95");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
