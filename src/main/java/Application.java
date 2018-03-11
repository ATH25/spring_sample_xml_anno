import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thomas.service.CustomerService;
import com.thomas.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

//		CustomerService customerService = new CustomerServiceImpl();

		//System.out.println(customerService.findAll().get(0).getFirstName());
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
