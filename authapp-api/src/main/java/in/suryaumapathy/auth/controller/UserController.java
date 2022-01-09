package in.suryaumapathy.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.auth.dto.LoginDTO;
import in.suryaumapathy.auth.model.User;
import in.suryaumapathy.auth.service.UserService;

// @RestController
// @RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
	UserService userService;

	@PostMapping("login")
	public void login(@RequestBody LoginDTO loginDTO) {
		userService.login(loginDTO.getUsername(), loginDTO.getPassword());
	}

	@PostMapping("registration")
	public void registration(User user) {
		userService.register(user);
	}


}
