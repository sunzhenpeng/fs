package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.DiskLabel;

public interface DiskLabelMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    int insert(DiskLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    int insertSelective(DiskLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    DiskLabel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DiskLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_label
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DiskLabel record);
}