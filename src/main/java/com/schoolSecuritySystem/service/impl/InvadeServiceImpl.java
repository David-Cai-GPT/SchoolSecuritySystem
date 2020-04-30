package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.AddressResponseInfoMapper;
import com.schoolSecuritySystem.dao.InvadeInfoMapper;
import com.schoolSecuritySystem.dto.InvadeController.invadeInfoDto;
import com.schoolSecuritySystem.pojo.AddressResponseInfo;
import com.schoolSecuritySystem.pojo.AddressResponseInfoExample;
import com.schoolSecuritySystem.pojo.InvadeInfo;
import com.schoolSecuritySystem.pojo.InvadeInfoExample;
import com.schoolSecuritySystem.service.InvadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class InvadeServiceImpl implements InvadeService {
    @Autowired
    private InvadeInfoMapper invadeInfoMapper;
    @Autowired
    private AddressResponseInfoMapper addressResponseInfoMapper;
    @Autowired
    private MailService mailService;
    @Async("executor")
    @Scheduled(cron = "0 0 8 * * ?")
    @Override
    public boolean invadeSendEmail() {
        InvadeInfoExample invadeInfoExample = new InvadeInfoExample();
        invadeInfoExample.createCriteria().andStatusEqualTo("未处理");
        List<InvadeInfo> list = invadeInfoMapper.selectByExample(invadeInfoExample);
        for(InvadeInfo value : list){
            String address = value.getAddress();
            AddressResponseInfoExample addressResponseInfoExample = new AddressResponseInfoExample();
            addressResponseInfoExample.createCriteria().andAddressEqualTo(address);
            List<AddressResponseInfo> EmailList = addressResponseInfoMapper.selectByExample(addressResponseInfoExample);
            String subject = new String("入侵警报通知");
            String content = new String("您所管辖的区域出现入侵行为");
            for(AddressResponseInfo value1 : EmailList){
                mailService.sendSimpleMail(value1.getResponseEmail(),subject,content);
            }
        }
        return false;
    }

    @Override
    public boolean invadeInfoSave(invadeInfoDto dto) {
       InvadeInfo invadeInfo = new InvadeInfo();
       invadeInfo.setAddress(dto.getAddress());
       Date date = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String time = ft.format(date);
       invadeInfo.setTime(time);
       invadeInfo.setStatus("未处理");
       invadeInfoMapper.insert(invadeInfo);
       return true;
    }

    @Override
    public List<InvadeInfo> getAllInvadeInfo() {
        InvadeInfoExample invadeInfoExample = new InvadeInfoExample();
        invadeInfoExample.createCriteria().andIdIsNotNull();
        List<InvadeInfo> list = invadeInfoMapper.selectByExample(invadeInfoExample);
        return list;
    }
}
