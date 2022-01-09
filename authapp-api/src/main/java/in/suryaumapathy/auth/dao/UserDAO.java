package in.suryaumapathy.auth.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.suryaumapathy.auth.model.User;

@Repository
public class UserDAO {

    private static List<User> users = new ArrayList<>();

    public void UserDAO() {
        User user1 = new User(1, "surya", "surya@gmail.com", "pass123");
        User user2 = new User(2, "naresh", "naresh@gmail.com", "pass123");
        users.add(user1);
        users.add(user2);
    }

    public User login(String email, String password) {
        User result = null;
        for (User user : users) {
            System.out.println(user);
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                result = user;
            }
        }
        return result;
    }

    public void register(User user) {
        System.out.println(user);
        user.setId(users.size() + 1);
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

}
