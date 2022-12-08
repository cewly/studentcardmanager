package com.student.DAO;

import com.student.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface InfoDAO {
    //根据学号删除学生
    int delete(String sno);
    //修改学生证信息
    int update(String name,String gender,String sno,String college,String classs,String idcard,String nativeplace,String birthday);
    //根据学号查询学生证信息
    Student selectBySno(String sno);
    //根据班级查询成绩
    List<Student> selectByClasss(String classs);
    //查询所有学生信息
    List<Student> selectAll();

}
