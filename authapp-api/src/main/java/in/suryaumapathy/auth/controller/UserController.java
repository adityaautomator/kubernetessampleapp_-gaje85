package in.suryaumapathy.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.auth.model.User;
import in.suryaumapathy.auth.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    
	@Autowired
	UserService userService;

	@GetMapping
	public List<User> list(){
		return userService.list();
	}


}
