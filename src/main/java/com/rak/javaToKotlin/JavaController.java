package com.rak.javaToKotlin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @GetMapping
	public String healthCheck() {
	    return "Java Health";
    }

}
