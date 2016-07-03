package com.study.WEB.service;

import javax.annotation.Resource;

public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;
    public void testSelectByPrimaryKey(){
        System.out.println("success");
    }
}
