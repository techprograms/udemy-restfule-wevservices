package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		//returning a String
		//xyz
		//abc
		return "Hello World Controller";
	}
	
<<<<<<< HEAD
	public String sayHello() {
		return "Hello Sir";
	}
=======
 public String getMessage() {
 	return "Hi";
 }
>>>>>>> 9a096d0b7b9141e1288e4cb878adcbbc8d8b7f8d
}
