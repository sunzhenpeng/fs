package com.lswd.youpin.daogen;

import com.lswd.youpin.model.ShowImages;

public interface ShowImagesMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    int insert(ShowImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    int insertSelective(ShowImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    ShowImages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_images
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowImages record);
}