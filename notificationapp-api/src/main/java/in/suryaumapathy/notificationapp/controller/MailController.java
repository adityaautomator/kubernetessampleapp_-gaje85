package in.suryaumapathy.notificationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.notificationapp.dto.MailDTO;
import in.suryaumapathy.notificationapp.service.UserService;

@RestController
@RequestMapping("/api/v1/mails")
public class MailController {

	@Autowired
	UserService userService;

	@PostMapping("send")
	public String sendMail(@RequestBody MailDTO body) {
		return "Mail Sent to " + body.getMailID();
	}

	@GetMapping()
	public String testMail(){
		return "Test mail api";
	}

}
