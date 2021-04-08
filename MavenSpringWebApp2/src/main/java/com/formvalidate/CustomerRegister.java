package com.formvalidate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class CustomerRegister {

	
	@RequestMapping("/customer")
	public ModelAndView customerRegister(Model model) {		
		return new ModelAndView("customerRegistraionForm","customer",new Customer());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
