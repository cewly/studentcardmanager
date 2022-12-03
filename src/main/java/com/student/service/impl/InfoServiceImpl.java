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
    public int update(String sno, double score, int no) {
        switch (no) {
            case 1:
                infoDAO.update1(sno, score);
                break;
            case 2:
                infoDAO.update2(sno, score);
                break;
            case 3:
                infoDAO.update3(sno, score);
                break;
            case 4:
                infoDAO.update4(sno, score);
                break;
            case 5:
                infoDAO.update5(sno, score);
                break;
            case 6:
                infoDAO.update6(sno, score);
                break;
            case 7:
                infoDAO.update7(sno, score);
                break;
            case 8:
                infoDAO.update8(sno, score);
                break;
            case 9:
                infoDAO.update9(sno, score);
                break;
            case 10:
                infoDAO.update10(sno, score);
                break;
        }
        return 1;
    }

    @Override
    public List<Student> selectAll() {
        List<Student> students = infoDAO.selectAll();
        for (Student student : students) {
            calTotal(student);
        }
        return students;
    }

    @Override
    public Student selectBySno(String sno) {
        Student student = infoDAO.selectBySno(sno);
        calTotal(student);
        return student;
    }

    @Override
    public List<Student> selectByClazz(String clazz) {
        List<Student> students = infoDAO.selectByClazz(clazz);
        for (Student student : students) {
            calTotal(student);
        }
        return students;
    }

    @Override
    public int delete(String sno) {
        return infoDAO.delete(sno);
    }

    private void calTotal(Student s) {
        s.setTotal(s.getS1()+s.getS2()+s.getS3()+s.getS4()+s.getS5()+s.getS6()+s.getS7()+s.getS8()+s.getS9()+s.getS10());
    }
}
