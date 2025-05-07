package pkg1Mailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MailController {
	@Autowired 
	MailService msr1;
	
	@PostMapping("/sendmail")
    public String addToMail(@RequestBody MailModel mm) {
        msr1.sendMail(mm.getToMail(),mm.getBody());
        return "Success";

	}
	
	@GetMapping("/gethello")
	public String getMethodName() {
		return "hellow";
	}
	
}