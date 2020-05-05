package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.DiningroomCardInfoMapper;
import com.schoolSecuritySystem.dao.DiningroomPayInfoMapper;
import com.schoolSecuritySystem.pojo.DiningroomCardInfo;
import com.schoolSecuritySystem.pojo.DiningroomCardInfoExample;
import com.schoolSecuritySystem.pojo.DiningroomPayInfo;
import com.schoolSecuritySystem.pojo.DiningroomPayInfoExample;
import com.schoolSecuritySystem.service.DiningRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DiningRoomServiceImpl implements DiningRoomService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DiningroomPayInfoMapper diningroomPayInfoMapper;
    @Autowired
    private DiningroomCardInfoMapper diningroomCardInfoMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public boolean investMoney(String cardId, double money) {
        DiningroomCardInfoExample diningroomCardInfoExample = new DiningroomCardInfoExample();
        diningroomCardInfoExample.createCriteria().andIdcardEqualTo(cardId);
        List<DiningroomCardInfo> list = diningroomCardInfoMapper.selectByExample(diningroomCardInfoExample);
        if(list.size() == 0){
            logger.info("用户不存在");
            return false;
        } else {
            DiningroomCardInfo diningroomCardInfoOld = list.get(0);
            DiningroomCardInfo diningroomCardInfo = new DiningroomCardInfo();
            diningroomCardInfo.setId(diningroomCardInfoOld.getId());
            diningroomCardInfo.setIdcard(diningroomCardInfoOld.getIdcard());
            diningroomCardInfo.setName(diningroomCardInfoOld.getName());
            diningroomCardInfo.setSurplus(diningroomCardInfoOld.getSurplus() - money);
            diningroomCardInfoMapper.updateByExample(diningroomCardInfo, diningroomCardInfoExample);
            return true;
        }
    }

    @Override
    public List<DiningroomCardInfo> getAllAccountInfo() {
        DiningroomCardInfoExample diningroomCardInfoExample = new DiningroomCardInfoExample();
        diningroomCardInfoExample.createCriteria().andIdIsNotNull();
        List<DiningroomCardInfo> list = diningroomCardInfoMapper.selectByExample(diningroomCardInfoExample);
        return list;
    }

    @Override
    public List<DiningroomPayInfo> getAllCostInfo() {
        DiningroomPayInfoExample diningroomPayInfoExample = new DiningroomPayInfoExample();
        diningroomPayInfoExample.createCriteria().andIdIsNotNull();
        List<DiningroomPayInfo> list = diningroomPayInfoMapper.selectByExample(diningroomPayInfoExample);
        return list;
    }
}
