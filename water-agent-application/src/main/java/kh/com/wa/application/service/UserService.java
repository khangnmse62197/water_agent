package kh.com.wa.application.service;

import kh.com.wa.data.jpa.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserById(Integer id);
    User createUser(User user);
}
