package com.schoolSecuritySystem.controller;

import com.schoolSecuritySystem.dto.EntranceGuardDto.entranceGuardPeopleDto;
import com.schoolSecuritySystem.dto.EntranceGuardDto.newEntranceGuardDto;
import com.schoolSecuritySystem.pojo.EntranceGuardInfo;
import com.schoolSecuritySystem.pojo.EntranceGuardUserInfo;
import com.schoolSecuritySystem.service.EntranceGuardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/EntranceGuard")
public class EntranceGuardController {
    @Autowired
    private EntranceGuardService entranceGuardService;

    /**
     * 增加新的门禁设备信息
     * @param dto
     * @return
     */
    @ResponseBody
    @PostMapping("/addNewEntranceGuardInfo")
    public boolean AddNewEntranceGuardInfo(@RequestBody newEntranceGuardDto dto){ return entranceGuardService.addNewEntranceGuard(dto); }

    /**
     * 为门禁添加权限
     * @param dto
     * @return
     */
    @ResponseBody
    @PostMapping("/addEntranceGuardPeople")
    public boolean AddEntranceGuardPeople(@RequestBody entranceGuardPeopleDto dto){ return entranceGuardService.addEntranceGuardPeople(dto); }

    /**
     * 所有门禁信息
     * @return
     */
    @ResponseBody
    @PostMapping("/allEntranceGuardInfo")
    public List<EntranceGuardInfo> AllEntranceGuardInfo(){ return entranceGuardService.allEntranceGuardInfo(); }

    /**
     * 查询单个门禁下权限信息
     * @param entranGuardNumber
     * @return
     */
    @ResponseBody
    @GetMapping("/singleEntranceGuardInfo")
    public List<EntranceGuardUserInfo> SingleEntranceGuardInfo(@RequestParam("entranGuardNumber")String entranGuardNumber){ return entranceGuardService.singleEntranceGuardInfo(entranGuardNumber); }

    /**
     * 删除单个门禁权限
     * @param userCardId
     * @param entranGuardNumber
     * @return
     */
    @ResponseBody
    @GetMapping("/deleteEntranceGuardPeople")
    public boolean DeleteEntranceGuardPeople(@RequestParam("userCardId")String userCardId,
                                             @RequestParam("entranGuardNumber")String entranGuardNumber){ return entranceGuardService.deleteEntranceGuardPeople(userCardId,entranGuardNumber); }
}
