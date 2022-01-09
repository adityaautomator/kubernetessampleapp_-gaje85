package in.suryaumapathy.notificationapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.suryaumapathy.notificationapp.dao.UserDAO;
import in.suryaumapathy.notificationapp.model.User;


@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	

    public User login(String username, String password) {
        return userDAO.login(username, password);
    }

    public void register(User user) {
        userDAO.register(user);
    }
	
}
