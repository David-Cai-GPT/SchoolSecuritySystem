package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.pojo.StudentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoMapper {

    int countByExample(StudentInfoExample example);


    int deleteByExample(StudentInfoExample example);


    int deleteByPrimaryKey(Integer id);


    int insert(StudentInfo record);


    int insertSelective(StudentInfo record);


    List<StudentInfo> selectByExample(StudentInfoExample example);


    StudentInfo selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);


    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);


    int updateByPrimaryKeySelective(StudentInfo record);


    int updateByPrimaryKey(StudentInfo record);
}