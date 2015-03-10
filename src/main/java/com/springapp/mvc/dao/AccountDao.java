package com.springapp.mvc.dao;

import com.springapp.mvc.domain.Account;

/**
 * Created by xingzhou on 3/10/15.
 */
public interface AccountDao {
  /*
    读取用户信息
   */
  Account read(String username);
}
