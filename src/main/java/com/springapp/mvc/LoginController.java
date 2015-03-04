package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
  @RequestMapping("login.do")
  public String testLogin(@RequestParam(value="username") String username, @RequestParam(value="password")String password, HttpServletRequest request) {
    // @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
    // @RequestParam可简写为：@RequestParam("username")

    if (!"admin".equals(username) || !"admin".equals(password)) {
      System.out.println(username);
      System.out.println(password);
      return "loginError";
    }
    return "loginSuccess";
  }

  @RequestMapping("test/login2.do")
  public ModelAndView testLogin2(String username, String password, int age) {
    if (!"admin".equals(username) || !"admin".equals(password)) {
      return new ModelAndView("loginError");
      // 手动实例化ModelAndView完成跳转页面（转发），效果等同于上面的方法返回字符串
    }
    return new ModelAndView("loginSuccess");
    // 重定向还有一种简单写法
    // return new ModelAndView("redirect:../index.jsp");
  }

  /*
  @RequestMapping("test/login3.do")
  public ModelAndView testLogin3(User user) {
    // 同样支持参数为表单对象，类似于Struts的ActionForm，User不需要任何配置，直接写即可
    String username = user.getUsername();
    String password = user.getPassword();

    if (!"admin".equals(username) || !"admin".equals(password)) {
      return new ModelAndView("loginError");
    }
    return new ModelAndView("loginSuccess");
  }
  */
}
