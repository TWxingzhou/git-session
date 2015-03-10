package com.springapp.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springapp.mvc.service.AccountService;

/**
 * Created by xingzhou on 3/9/15.
 */

@Controller
@RequestMapping("/account.do")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @RequestMapping(method = RequestMethod.GET)
  public void hello(HttpServletRequest request, HttpServletResponse response) throws Exception {
    String username = ServletRequestUtils.getRequiredStringParameter(request, "username");
    String password = ServletRequestUtils.getRequiredStringParameter(request, "password");
    System.out.println(accountService.verify(username, password));
  }


}
