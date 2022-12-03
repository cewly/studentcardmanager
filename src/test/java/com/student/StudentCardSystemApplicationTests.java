package com.student;

import com.student.DAO.InfoDAO;
import com.student.service.InfoService;
import com.student.service.impl.InfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentCardSystemApplicationTests {

    @Autowired
    private InfoService infoService;

    @Test
    void contextLoads() {
        System.out.println(infoService.delete("3200604026"));
    }

}
