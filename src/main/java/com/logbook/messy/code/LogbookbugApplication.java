package com.logbook.messy.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class LogbookbugApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbookbugApplication.class, args);
	}
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
      return "logbook";
    }
}
