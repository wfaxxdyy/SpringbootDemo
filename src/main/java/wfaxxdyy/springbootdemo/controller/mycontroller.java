package wfaxxdyy.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class mycontroller {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "hello";
    }

}
