package com.student.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    //路由设计定义
    @RequestMapping({"/", "/index"})
    public String index() {
        return "index.html";
    }

    @RequestMapping("/class")
    public String select() {
        return "class.html";
    }

}
