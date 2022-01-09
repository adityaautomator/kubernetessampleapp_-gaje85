package in.suryaumapathy.netlifytracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.suryaumapathy.netlifytracker.dto.LoginDTO;
import in.suryaumapathy.netlifytracker.model.User;
import in.suryaumapathy.netlifytracker.service.UserService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

// @RestController
// @RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public void login(@RequestBody LoginDTO loginDTO) {
        userService.login(loginDTO.getUsername(), loginDTO.getPassword());
    }

    @PostMapping
    public void registration(User user) {
        userService.register(user);
    }

}
