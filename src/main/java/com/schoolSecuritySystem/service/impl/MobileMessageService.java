package com.schoolSecuritySystem.service.impl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MobileMessageService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    static final String product = "Dysmsapi";
    static final String domain = "dysmsapi.aliyuncs.com";
    @Value("${accessKeyId}")
    private static String accessKeyId;
    @Value("${accessKeySecret}")
    private static String accessKeySecret;

    public boolean sendMessage(String phoneNumber, String code,String templateCode){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",accessKeyId, accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", "蔡大卫");
        request.putQueryParameter("TemplateCode", templateCode);
        try {
            return true;
        } catch (Exception e) {
            logger.error("错误");
        }
        return false;
    }
}
