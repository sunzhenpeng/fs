package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.MealRecord;

public interface MealRecordMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer mealRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    int insert(MealRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    int insertSelective(MealRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    MealRecord selectByPrimaryKey(Integer mealRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MealRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_mealrecord
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MealRecord record);
}