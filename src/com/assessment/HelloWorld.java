package com.assessment;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 

 
@Controller
public class HelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld1() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Welcome!</h3>Thank you for visiting</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	@RequestMapping("/purchase")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Purchase Receipt</h3>Order#44672</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
