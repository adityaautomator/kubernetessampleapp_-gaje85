package in.suryaumapathy.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.auth.dto.LoginDTO;
import in.suryaumapathy.auth.model.User;
import in.suryaumapathy.auth.service.UserService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

	@Autowired
	UserService userService;

	@PostMapping("login")
	public User login(@RequestBody LoginDTO loginDTO) {
		return userService.login(loginDTO.getUsername(), loginDTO.getPassword());
	}

	@PostMapping("register")
	public void registration(@RequestBody User user) {
		userService.register(user);
	}

}
