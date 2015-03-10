package com.springapp.mvc.service;

/**
 * Created by xingzhou on 3/9/15.
 */
public interface AccountService {
  /*
   *   验证用户身份
   */
  boolean verify(String username, String password);
}