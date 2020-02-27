package com.schoolSecuritySystem.dao;

import com.schoolSecuritySystem.pojo.Carrecord;
import com.schoolSecuritySystem.pojo.CarrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int countByExample(CarrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int deleteByExample(CarrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int insert(Carrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int insertSelective(Carrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    List<Carrecord> selectByExample(CarrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    Carrecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Carrecord record, @Param("example") CarrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Carrecord record, @Param("example") CarrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Carrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Carrecord record);
}