package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.Recipe;

public interface RecipeMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    int insert(Recipe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    int insertSelective(Recipe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    Recipe selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Recipe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_recipe
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Recipe record);
}