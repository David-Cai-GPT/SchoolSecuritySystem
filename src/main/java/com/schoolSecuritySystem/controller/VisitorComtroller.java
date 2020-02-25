package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.VisitorController.ApplyVisitorInfoReq;
import com.schoolSecuritySystem.pojo.Visitorapply;
import com.schoolSecuritySystem.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Visitor")
public class VisitorComtroller {
    @Autowired
    private VisitorService visitorService;
    @ResponseBody
    @PostMapping("/visitorApply")
    public boolean ActivityApply(@RequestBody ApplyVisitorInfoReq dto) { return visitorService.applyVisitor(dto); }

    @ResponseBody
    @PostMapping("/allVisitorInfo")
    public List<Visitorapply> GetAllVisitorInfo() { return visitorService.getAllVisitorInfo(); }
}
