package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Teacher")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    @ResponseBody
    @PostMapping("/getAllTeacherNum")
    public int GetAllStudentNum() { return teacherService.getTeacherNum(); }
}
