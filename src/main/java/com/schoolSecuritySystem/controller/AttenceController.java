package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.AttenceController.AttenceDto;
import com.schoolSecuritySystem.dto.AttenceController.ChartDataDto;
import com.schoolSecuritySystem.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/Attence")
public class AttenceController {
    @Autowired
    private AttenceService attenceServiceImpl;
    @ResponseBody
    @GetMapping("/notAttenceInfo")
    public List NotAttenceInfo(@RequestParam("role")int role) { return attenceServiceImpl.notAttenceList(role); }

    @ResponseBody
    @PostMapping("/personAttence")
    public boolean PersonAttence(@RequestBody AttenceDto dto) { return attenceServiceImpl.attence(dto); }

    @ResponseBody
    @GetMapping("/attenceAna")
    public ChartDataDto AttenceAna(@RequestParam("role")int role) { return attenceServiceImpl.attenceAnalyse(role); }
}
