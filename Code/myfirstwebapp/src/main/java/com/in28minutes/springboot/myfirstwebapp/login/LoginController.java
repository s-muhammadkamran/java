package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authSvc;

    private final Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = {"/logindemo", "/login-demo"}, method = RequestMethod.GET)
    public String logindemo(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.info("Request Param is {}", name);
        return "loginDemo";
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String welcome(@RequestParam String userName, @RequestParam String password, ModelMap model) {
        if(authSvc.authenticate(userName, password)) {
            model.put("userName", userName);
            return "welcome";
        }
        else {
            return "login";
        }
    }
}