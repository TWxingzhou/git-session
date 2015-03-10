package com.springapp.mvc.dao.impl;

import org.springframework.stereotype.Repository;
import com.springapp.mvc.dao.AccountDao;
import com.springapp.mvc.domain.Account;

/**
 * Created by xingzhou on 3/10/15.
 */
@Repository
public class AccountDaoImpl implements AccountDao {
  @Override
  public Account read(String username) {
    return new Account(username, "wolf");
  }
}
