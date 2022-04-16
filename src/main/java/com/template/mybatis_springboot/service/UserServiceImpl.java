package com.template.mybatis_springboot.service;

import com.template.mybatis_springboot.mapper.UserMapper;
import com.template.mybatis_springboot.model.User;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
  private final UserMapper userMapper;

  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public User getUserById(int userId) {
    return userMapper.getUserById(userId);
  }

  @Override
  public List<User> getUsersByBirthday(String birthdayStr) {
    LocalDateTime birthday = LocalDateTime.parse(birthdayStr, DATE_TIME_FORMATTER);
    return userMapper.getUsersByBirthday(birthday);
  }
}
