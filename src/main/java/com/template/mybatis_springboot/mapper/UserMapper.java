package com.template.mybatis_springboot.mapper;

import com.template.mybatis_springboot.model.User;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
  @Select("select * from user u where #{userId} = u.id")
  User getUserById(int userId);

  List<User> getUsersByBirthday(LocalDateTime birthday);
}
