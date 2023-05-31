package kh.com.wa.application.implement;

import kh.com.wa.application.service.UserService;
import kh.com.wa.data.jpa.entity.User;
import kh.com.wa.data.jpa.repository.UserReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserReppository userReppository;

    @Override
    public Optional<User> findUserById(Integer id) {
        return userReppository.findById(id);
    }

    @Override
    public User createUser(User user) {
        return userReppository.save(user);
    }
}
