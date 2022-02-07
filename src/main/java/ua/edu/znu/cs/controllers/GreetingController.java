package ua.edu.znu.cs.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.znu.cs.controllers.Greeting;

@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    
    /**
     * GET http://localhost:8080/greeting?name=123
     * GET http://localhost:8080/greeting
     */
    @GetMapping("/greeting")
    Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
