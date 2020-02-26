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
    @ResponseBody
    @PostMapping("/visitorApply")
    public boolean ActivityApply(@RequestBody ApplyVisitorInfoReq dto) { return visitorService.applyVisitor(dto); }

    @ResponseBody
    @PostMapping("/allVisitorInfo")
    public List<Visitorapply> GetAllVisitorInfo() { return visitorService.getAllVisitorInfo(); }

    @ResponseBody
    @PostMapping("/visitorSignIn")
    public boolean VisitorSignIn(@RequestBody ApplyVisitorInfoReq dto){ return visitorService.visitorSignIn(dto); }

    @ResponseBody
    @PostMapping("/visitorSignOut")
    public boolean VisitorSignOut(@RequestBody ApplyVisitorInfoReq dto){ return visitorService.visitorSignOut(dto); }
}
