package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	  @Autowired
	  private JavaMailSender sender;
	
	public void sendEmail(
			 String to,
			 String sub,
			 String msg
			  // UserMail mail
			) {
		 
	SimpleMailMessage sm = new SimpleMailMessage();
	
	  sm.setFrom("hiteshwankhede11@gmail.com");
	  sm.setTo(to);  
	  sm.setSubject(sub);
	  sm.setText(msg);

	  sender.send(sm);
	  
		 System.out.println("Mail Send Succesfull");
	}
}
