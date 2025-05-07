package pkg1Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class MailService {
	@Autowired 
	JavaMailSender JMS;
	
	@Autowired 
	@Value("${spring.mail.username}")
	private String from;
	
	
	@PostMapping
	
	public void sendMail(String email, String name) {
	    String subject = "Happy Birthday!";
	    String body = "Dear " + name + ",\n\nWishing you a very Happy Birthday!\n\nBest regards,\nYour Company";

	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setFrom(from);
	    message.setTo(email);
	    message.setSubject(subject);
	    message.setText(body);

	    JMS.send(message);
	}


}
