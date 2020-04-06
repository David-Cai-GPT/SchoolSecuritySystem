package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.VisitorController.ApplyVisitorInfoReq;
import com.schoolSecuritySystem.pojo.Visitorapply;
import com.schoolSecuritySystem.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/Visitor")
public class VisitorController {
    @Autowired
    private VisitorService visitorService;

    /**
     *访客预约
     */
    @ResponseBody
    @PostMapping("/visitorApply")
    public boolean ActivityApply(@RequestBody ApplyVisitorInfoReq dto) { return visitorService.applyVisitor(dto); }

    /**
     *所有访客信息
     */
    @ResponseBody
    @PostMapping("/allVisitorInfo")
    public List<Visitorapply> GetAllVisitorInfo() { return visitorService.getAllVisitorInfo(); }

    /**
     *访客签到
     */
    @ResponseBody
    @PostMapping("/visitorSignIn")
    public boolean VisitorSignIn(@RequestBody ApplyVisitorInfoReq dto){ return visitorService.visitorSignIn(dto); }

    /**
     *访客签退
     */
    @ResponseBody
    @PostMapping("/visitorSignOut")
    public boolean VisitorSignOut(@RequestBody ApplyVisitorInfoReq dto){ return visitorService.visitorSignOut(dto); }
}
