package kh.com.wa.rest.controller;

import kh.com.wa.application.service.UserService;
import kh.com.wa.data.jpa.entity.User;
import kh.com.wa.rest.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        //TODO should return userDTO - use mapstruct to map from user to userDTO
        return userService.findUserById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        //TODO mapstruct instead
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());
        user.setPermission(userDTO.getPermission());
        user.setRole(userDTO.getRole());
        return ResponseEntity.ok(userService.createUser(user));

    }
}
