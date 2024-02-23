package com.example.springboot.myfristwebapp.com.example.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! How are you today!";
    }


    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML Page </title>");
        sb.append("</head>");
        sb.append("<body><h1> my page!</h1>");
        sb.append("</body>");

        return sb.toString();
    }

    //src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }


}
