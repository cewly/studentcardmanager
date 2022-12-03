package com.student.DAO;

import com.student.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface InfoDAO {
    //根据学号删除学生
    int delete(String sno);
    //修改学生某次成绩
    int update1(String sno, double score);
    int update2(String sno, double score);
    int update3(String sno, double score);
    int update4(String sno, double score);
    int update5(String sno, double score);
    int update6(String sno, double score);
    int update7(String sno, double score);
    int update8(String sno, double score);
    int update9(String sno, double score);
    int update10(String sno, double score);
    //根据学号查询成绩
    Student selectBySno(String sno);
    //根据班级查询成绩
    List<Student> selectByClazz(String clazz);
    //查询所有学生信息
    List<Student> selectAll();

}
