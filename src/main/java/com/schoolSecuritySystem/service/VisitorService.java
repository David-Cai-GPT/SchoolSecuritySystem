package com.schoolSecuritySystem.service;

import com.schoolSecuritySystem.dto.VisitorController.ApplyVisitorInfoReq;
import com.schoolSecuritySystem.pojo.Visitorapply;

import java.util.List;

public interface VisitorService {
    boolean applyVisitor(ApplyVisitorInfoReq dto);
    List<Visitorapply> getAllVisitorInfo();
    boolean visitorSignIn(ApplyVisitorInfoReq dto);
    boolean visitorSignOut(ApplyVisitorInfoReq dto);
}
