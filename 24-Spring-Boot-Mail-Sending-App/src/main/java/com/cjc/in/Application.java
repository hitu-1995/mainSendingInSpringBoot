package com.cjc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.in.service.MailService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MailService service = context.getBean(MailService.class);
		service.sendEmail("chaudhari.ritesh17@gmail.com", 
				            "Subject To Market Risk",
				            "Hello Ritesh You Are in Big Problem");
		
		System.out.println("App Running....");
	}

}
