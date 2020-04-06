package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.dto.TeacherController.addNewTeacherReq;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.TeacherInfo;
import com.schoolSecuritySystem.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Teacher")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    /**
     *得到所有教师数量
     */
    @ResponseBody
    @PostMapping("/getAllTeacherNum")
    public int GetAllStudentNum() { return teacherService.getTeacherNum(); }

    /**
     *得到所有教师信息
     */
    @ResponseBody
    @PostMapping("/getAllTeacherInfo")
    public List<TeacherInfo> GetAllStudentInfo() { return teacherService.getAllTeacherInfo(); }

    /**
     *管理新的教师信息
     */
    @ResponseBody
    @PostMapping("/addNewTeacher")
    public boolean AddNewStudent(@RequestBody addNewTeacherReq dto) { return teacherService.addNewTeacher(dto); }

    /**
     * 修改教师信息
     */
    @ResponseBody
    @PostMapping("/editTeacherInfo")
    public Boolean EditTeacherInfo(@RequestBody addNewTeacherReq dto) {return teacherService.editTeacherInfo(dto); }
}
