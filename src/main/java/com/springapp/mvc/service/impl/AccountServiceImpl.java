package com.springapp.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springapp.mvc.dao.AccountDao;
import com.springapp.mvc.domain.Account;
import com.springapp.mvc.service.AccountService;

/**
 * Created by xingzhou on 3/10/15.
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountDao accountDao;

  @Override
  public boolean verify(String username, String password) {
    Account account = accountDao.read(username);

    if (password.equals(account.getPassword())) {
      return true;
    } else {
      return false;
    }
  }

}
