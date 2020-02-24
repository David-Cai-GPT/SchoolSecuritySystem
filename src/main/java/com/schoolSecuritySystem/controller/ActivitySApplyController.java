package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.ActivityController.ApplyActivityInfoReq;
import com.schoolSecuritySystem.pojo.Activityapply;
import com.schoolSecuritySystem.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Activity")
public class ActivitySApplyController {
    @Autowired
    private ActivityService activityService;
    @ResponseBody
    @PostMapping("/activityApply")
    public boolean ActivityApply(@RequestBody ApplyActivityInfoReq dto) { return activityService.applyActivity(dto); }

    @ResponseBody
    @PostMapping("/allActivityInfo")
    public List<Activityapply> ActivityApply() { return activityService.getAllActivityInfo(); }
}
