package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World Controller";
	}
	
<<<<<<< HEAD
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

=======
	public String sayHello() {
		return "Hello Sir";
	}
 public String getMessage() {
 	return "Hi";
 }
>>>>>>> e5c24e2c2c64c6939610d2c7e04524496a92dc43
}
