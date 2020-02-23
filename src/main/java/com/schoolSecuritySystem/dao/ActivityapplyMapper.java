package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.Activityapply;
import com.schoolSecuritySystem.pojo.ActivityapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityapplyMapper {

    int countByExample(ActivityapplyExample example);


    int deleteByExample(ActivityapplyExample example);


    int deleteByPrimaryKey(Integer no);


    int insert(Activityapply record);


    int insertSelective(Activityapply record);


    List<Activityapply> selectByExample(ActivityapplyExample example);


    Activityapply selectByPrimaryKey(Integer no);


    int updateByExampleSelective(@Param("record") Activityapply record, @Param("example") ActivityapplyExample example);


    int updateByExample(@Param("record") Activityapply record, @Param("example") ActivityapplyExample example);


    int updateByPrimaryKeySelective(Activityapply record);


    int updateByPrimaryKey(Activityapply record);
}