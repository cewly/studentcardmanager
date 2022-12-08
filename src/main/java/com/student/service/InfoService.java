package com.student.service;

import com.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InfoService {
    int update(String sno,String gender,String studentid,String college,String classs,String idcard,String nativeplace,String birthday);
    List<Student> selectAll();
    Student selectBySno(String sno);
    List<Student> selectByClasss(String classs);
    int delete(String sno);
}
