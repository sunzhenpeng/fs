package com.lswd.youpin.model.lsyp;

import java.util.Date;

public class GoodComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.good_id
     *
     * @mbg.generated
     */
    private String goodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.comment_type
     *
     * @mbg.generated
     */
    private Short commentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.additional_content
     *
     * @mbg.generated
     */
    private String additionalContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.associator_id
     *
     * @mbg.generated
     */
    private String associatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_comment.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.id
     *
     * @return the value of t_good_comment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.id
     *
     * @param id the value for t_good_comment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.good_id
     *
     * @return the value of t_good_comment.good_id
     *
     * @mbg.generated
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.good_id
     *
     * @param goodId the value for t_good_comment.good_id
     *
     * @mbg.generated
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.comment_type
     *
     * @return the value of t_good_comment.comment_type
     *
     * @mbg.generated
     */
    public Short getCommentType() {
        return commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.comment_type
     *
     * @param commentType the value for t_good_comment.comment_type
     *
     * @mbg.generated
     */
    public void setCommentType(Short commentType) {
        this.commentType = commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.content
     *
     * @return the value of t_good_comment.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.content
     *
     * @param content the value for t_good_comment.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.additional_content
     *
     * @return the value of t_good_comment.additional_content
     *
     * @mbg.generated
     */
    public String getAdditionalContent() {
        return additionalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.additional_content
     *
     * @param additionalContent the value for t_good_comment.additional_content
     *
     * @mbg.generated
     */
    public void setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent == null ? null : additionalContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.associator_id
     *
     * @return the value of t_good_comment.associator_id
     *
     * @mbg.generated
     */
    public String getAssociatorId() {
        return associatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.associator_id
     *
     * @param associatorId the value for t_good_comment.associator_id
     *
     * @mbg.generated
     */
    public void setAssociatorId(String associatorId) {
        this.associatorId = associatorId == null ? null : associatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.is_delete
     *
     * @return the value of t_good_comment.is_delete
     *
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.is_delete
     *
     * @param isDelete the value for t_good_comment.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.create_time
     *
     * @return the value of t_good_comment.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.create_time
     *
     * @param createTime the value for t_good_comment.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_comment.update_time
     *
     * @return the value of t_good_comment.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_comment.update_time
     *
     * @param updateTime the value for t_good_comment.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}