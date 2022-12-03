package com.student.service;

import com.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InfoService {
    int update(String sno, double score, int no);
    List<Student> selectAll();
    Student selectBySno(String sno);
    List<Student> selectByClazz(String clazz);
    int delete(String sno);
}
