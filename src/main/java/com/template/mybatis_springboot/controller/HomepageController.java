package com.template.mybatis_springboot.controller;

import com.template.mybatis_springboot.model.User;
import com.template.mybatis_springboot.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomepageController {
  private final UserService userService;

  public HomepageController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user/id/{userId}")
  public User getUser(@PathVariable int userId) {
    return userService.getUserById(userId);
  }

  @GetMapping("/user/birthday/{birthdayStr}")
  public List<User> getUsersByBirthDay(@PathVariable String birthdayStr) {
    return userService.getUsersByBirthday(birthdayStr);
  }
}
