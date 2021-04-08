package com.formvalidate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validate")
public class CustomerValidation {

	@RequestMapping("/validateForm")
	public String ValidateForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "customerRegistraionForm";

		} else {

			System.out.println("|"+customer.getFirstName()+"|");
			System.out.println("|"+customer.getLastName()+"|");
			System.out.println("|"+customer.getEmail()+"|");
			System.out.println("|"+customer.getDateOfBirth()+"|");
			return "validateCustomerRegistration";
			
		}
	}

}
