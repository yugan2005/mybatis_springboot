package com.template.mybatis_springboot.service;

import com.template.mybatis_springboot.model.User;
import java.util.List;


public interface UserService {
  User getUserById(int userId);
  List<User> getUsersByBirthday(String birthDayStr);
}
