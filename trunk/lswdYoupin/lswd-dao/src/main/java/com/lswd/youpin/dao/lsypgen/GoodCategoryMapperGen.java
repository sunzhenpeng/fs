package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.GoodCategory;

public interface GoodCategoryMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    int insert(GoodCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    int insertSelective(GoodCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    GoodCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GoodCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoodCategory record);
}