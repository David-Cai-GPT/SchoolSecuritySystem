package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class DisplayAllStudent {
    @Autowired
    private StudentServiceImpl studentServiceimpl;
    @ResponseBody
    @RequestMapping("/allStudentList")
    public List<StudentInfo> list(){
        List<StudentInfo> studentlist = studentServiceimpl.getStudentList();
        return studentlist;
    }
}
