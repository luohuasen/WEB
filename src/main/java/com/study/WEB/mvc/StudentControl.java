package com.study.WEB.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.WEB.model.Student;
import com.study.WEB.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentControl {
    @Resource
    private StudentService studentService;
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView model = new ModelAndView("list");
        List<Student> students = getStudents();
        Student stu = studentService.selectByPrimaryKey(1);
        students.add(stu);
        model.addObject("stulist", students);
        return model;
    }
    @RequestMapping("/remove")
    public String remove(Model model){
        return "list";
    }
    @RequestMapping("/edit")
    public String edit(Model model){
        return "edit";
    }
    @RequestMapping("/add")
    public String add(Model model){
        return "edit";
    }
    
    public List<Student> getStudents(){
        List<Student> list = new ArrayList<Student>();
        Student stu = null;
        for(int i = 1 ; i < 6;i++){
            stu = new Student();
            stu.setId(i);
            stu.setName("Ñ§Éú"+i);
            stu.setAge("24");
            stu.setSex("ÄÐ");
            list.add(stu);
        }
        return list; 
    }
}
