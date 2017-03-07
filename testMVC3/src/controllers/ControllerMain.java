package controllers;


import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerMain {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld(ModelMap model) {
		System.out.println("in helloWorld");
		model.addAttribute("message", "Hello World aaaaa!");
		return "hello";
	}

}

