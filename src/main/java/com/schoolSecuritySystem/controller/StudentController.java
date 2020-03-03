package com.schoolSecuritySystem.controller;


import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(value = "/Student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @ResponseBody
    @PostMapping("/getAllStudentInfo")
    public List<StudentInfo> GetAllStudentInfo() { return studentService.getStudentList(); }

    @ResponseBody
    @PostMapping("/getAllStudentNum")
    public int GetAllStudentNum() { return studentService.getStudentNum(); }

    @ResponseBody
    @PostMapping("/addNewStudent")
    public boolean AddNewStudent(addNewStudentReq dto) { return studentService.addNewStudent(dto); }

}
