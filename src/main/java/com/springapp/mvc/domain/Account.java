package com.springapp.mvc.domain;

import java.io.Serializable;

/**
 * Created by xingzhou on 3/9/15.
 */
public class Account implements Serializable {
  private static final long serialVersionUID = -533698031946372178L;

  private String username;
  private String password;

  /**
   * @param username
   * @param password
   */

  public Account(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

// 通常，在构建域对象时，需要考虑该对象可能需要进行网络传输，本地缓存，因此建议实现序列化接口Serializable
