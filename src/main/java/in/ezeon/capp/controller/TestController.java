package in.ezeon.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test/hello")
	public String helloWorld(){
		System.out.println("helloo hellooo hellooooo");
		return "hello";
		//here hello is a view name and prefix and suffix we will get that from config internal
		//viewresolver bata
	}
}
