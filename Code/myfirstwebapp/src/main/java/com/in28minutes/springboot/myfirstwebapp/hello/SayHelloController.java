package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping(value = {"/say-hello", "/sayhello"})
    @ResponseBody
    public String sayHello() {
        return "Hello! what are you learning today?";
    }

    @RequestMapping(value = {"/say-hello-html", "/sayhellohtml"})
    @ResponseBody
    public String sayHelloHtml(@RequestParam("name") String name) {
        name = name == null || name.isEmpty() ? "Stranger" : name.trim();
        var res = new StringBuffer();
        res.append("""
                <html><head><title>My first Html Page</title></head>
                <body><h1>Hello&nbsp;""");
        res.append(name);
        res.append("!</h1></body></html>");
        return res.toString();
    }

    @RequestMapping(value={"/say-hello-jsp", "/sayhellojsp"})
    // \src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
    // You can keep the Prefix.Suffix format in application.properties file
    // prefix=/WEB-INF/jsp
    // suffix=.jsp
    public String sayHelloJsp() {
        return "sayHello";
    }
}
