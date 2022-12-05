package com.student.control;

import com.alibaba.fastjson.JSONObject;
import com.student.model.Student;
import com.student.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/all")
    @ResponseBody
    public String all() {
        List<Student> students = infoService.selectAll();
        String s = JSONObject.toJSONString(students);
        String builder = "{\"code\":0, \"data\":" +
                s + "}";
        return builder;
    }

    @RequestMapping("/bySno")
    @ResponseBody
    public String bySno(@RequestParam String sno) {
        Student student = infoService.selectBySno(sno);
        String s = JSONObject.toJSONString(student);
        String builder = "{\"code\":0, \"data\":" +
                s + "}";
        return builder;
    }

    @RequestMapping("/byClazz")
    @ResponseBody
    public String byClazz(@RequestParam String clazz) {
        List<Student> students = infoService.selectByClazz(clazz);
        String s = JSONObject.toJSONString(students);
        String builder = "{\"code\":0, \"data\":" +
                s + "}";
        return builder;
    }

    @RequestMapping("/updateInfo")
    @ResponseBody
    public String updateInfo(@RequestParam String name, @RequestParam String gender, @RequestParam String sno,@RequestParam String college,@RequestParam String classs,@RequestParam String idcard,@RequestParam String nativeplace, @RequestParam String birthday) {
        int update = infoService.update(name,gender,sno,college,classs,idcard,nativeplace,birthday);
        if (update == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/deleteInfo")
    @ResponseBody
    public String deleteInfo(@RequestParam String sno) {
        int delete = infoService.delete(sno);
        if (delete == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

}
