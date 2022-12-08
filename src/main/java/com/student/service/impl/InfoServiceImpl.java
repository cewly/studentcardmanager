package com.student.service.impl;

import com.student.DAO.InfoDAO;
import com.student.model.Student;
import com.student.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoDAO infoDAO;

    @Override
    public int update(String name,String gender,String sno,String college,String classs,String idcard,String nativeplace,String birthday) {
        infoDAO.update(name,gender,sno,college,classs,idcard,nativeplace,birthday);
        return 1;
    }

    @Override
    public List<Student> selectAll() {
        List<Student> students = infoDAO.selectAll();
        return students;
    }

    @Override
    public Student selectBySno(String sno) {
        Student student = infoDAO.selectBySno(sno);
        return student;
    }

    @Override
    public List<Student> selectByClasss(String classs) {
        List<Student> students = infoDAO.selectByClasss(classs);
        return students;
    }

    @Override
    public int delete(String sno) {
        return infoDAO.delete(sno);
    }


}
