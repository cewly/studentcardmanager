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

    @RequestMapping("/select")
    public String select() {
        return "select.html";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete.html";
    }

    @RequestMapping("/update")
    public String update() {
        return "update.html";
    }

    @RequestMapping("/add")
    public String add() {
        return "add.html";
    }

    @RequestMapping("/statistics")
    public String statistics() {
        return "statistics.html";
    }
}
