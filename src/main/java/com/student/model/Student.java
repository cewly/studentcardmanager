package com.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    //学号
    private String studentid;
    //学生姓名
    private String sname;
    //学生班级
    private String classs;
    //性别
    private String gender;
    //生日
    private String birthday;
    //身份证
    private String idcard;
    //籍贯
    private String nativeplace;
    //学院
    private String college;
}
