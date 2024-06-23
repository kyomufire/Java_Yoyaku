package com.yoyaku.yoyaku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
  @RequestMapping("/index")
  public String test() {
    return ("/Users/kyomufire/Library/Main_Java/Java_Yoyaku-2/yoyaku/src/main/resources/index.html");
  }
}
