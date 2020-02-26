package com.schoolSecuritySystem.service.impl;

import com.schoolSecuritySystem.dao.VisitorapplyMapper;
import com.schoolSecuritySystem.dto.VisitorController.ApplyVisitorInfoReq;
import com.schoolSecuritySystem.pojo.Visitorapply;
import com.schoolSecuritySystem.pojo.VisitorapplyExample;
import com.schoolSecuritySystem.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorapplyMapper visitorapplyMapper;
    @Override
    public boolean applyVisitor(ApplyVisitorInfoReq dto) {
        Visitorapply visitorapply = new Visitorapply();
        visitorapply.setVisitorname(dto.getVisitorName());
        visitorapply.setVisitortel(dto.getVisitorTel());
        Date startDate = dto.getStartDate();
        Date startTime = dto.getStartTime();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm:ss");
        String activityStartTime = ft1.format(startDate) + ' ' + ft2.format(startTime);
        visitorapply.setVisitorstarttime(activityStartTime);
        visitorapply.setApplicantname(dto.getApplicantName());
        visitorapply.setApplicanttel(dto.getApplicanttel());
        visitorapply.setApplicantemail(dto.getApplicantEmail());
        visitorapply.setType(dto.getType());
        visitorapplyMapper.insert(visitorapply);
        return true;
    }
    @Override
    public List<Visitorapply> getAllVisitorInfo() {
        VisitorapplyExample visitorapplyExample = new VisitorapplyExample();
        VisitorapplyExample.Criteria criteria = visitorapplyExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Visitorapply> list = visitorapplyMapper.selectByExample(visitorapplyExample);
        return list;
    }

    @Override
    public boolean visitorSignIn(ApplyVisitorInfoReq dto) {
        VisitorapplyExample visitorapplyExample = new VisitorapplyExample();
        VisitorapplyExample.Criteria criteria = visitorapplyExample.createCriteria();
        criteria.andVisitornameEqualTo(dto.getVisitorName());
        Visitorapply visitorapply = new Visitorapply();
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String visitorSignInTime = ft1.format(date);
        visitorapply.setVisitorstarttime(visitorSignInTime);
        visitorapplyMapper.updateByExampleSelective(visitorapply, visitorapplyExample);
        return true;
    }

    @Override
    public boolean visitorSignOut(ApplyVisitorInfoReq dto) {
        VisitorapplyExample visitorapplyExample = new VisitorapplyExample();
        VisitorapplyExample.Criteria criteria = visitorapplyExample.createCriteria();
        criteria.andVisitornameEqualTo(dto.getVisitorName());
        Visitorapply visitorapply = new Visitorapply();
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String visitorSignInTime = ft1.format(date);
        visitorapply.setVisitorendtime(visitorSignInTime);
        visitorapplyMapper.updateByExampleSelective(visitorapply, visitorapplyExample);
        return true;
    }
}
