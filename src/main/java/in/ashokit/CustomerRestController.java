package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	   @GetMapping("/")
		public Customer getCustomer() {
			
			Customer c =new Customer();
			c.setId(101);
			c.setName("chan");
			c.setEmail("cshu383@gmail.com");
			c.setPhno(761920);
			
			return c;
		}
	   
}


