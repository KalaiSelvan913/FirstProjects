package ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringCollections.xml");
		Customer cus = (Customer)context.getBean("CustomerBean");
		System.out.println(cus);
	}

}
