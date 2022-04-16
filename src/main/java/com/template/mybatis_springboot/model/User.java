package com.template.mybatis_springboot.model;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class User {
  private Integer id;
  private String firstName;
  private String lastName;
  private LocalDateTime birthday;
}
