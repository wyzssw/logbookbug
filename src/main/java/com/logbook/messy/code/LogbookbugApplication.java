package com.logbook.messy.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogbookbugApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbookbugApplication.class, args);
	}
	
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public User test(  User user){
      User user1 = new User();
        user1.setAge(5);
        user1.setName("hello");
        user1.setNick("xiaoming");
        return user1;
    }
}
