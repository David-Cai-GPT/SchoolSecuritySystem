package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.pojo.DiningroomCardInfo;
import com.schoolSecuritySystem.pojo.DiningroomPayInfo;

import java.util.List;

public interface DiningRoomService {
    // 充值
    boolean investMoney(String cardId,double money);
    // 所有用户信息
    List<DiningroomCardInfo> getAllAccountInfo();
    // 所有消费信息
    List<DiningroomPayInfo> getAllCostInfo();
}
