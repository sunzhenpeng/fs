package com.lswd.youpin.model.lsyp;

import java.util.Date;

public class Supplier {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.supplier_id
     *
     * @mbg.generated
     */
    private String supplierId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.level
     *
     * @mbg.generated
     */
    private Short level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.leader
     *
     * @mbg.generated
     */
    private String leader;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.postcode
     *
     * @mbg.generated
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.bank
     *
     * @mbg.generated
     */
    private String bank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.bankcode
     *
     * @mbg.generated
     */
    private String bankcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.address_id
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.update_user
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.safetyone
     *
     * @mbg.generated
     */
    private String safetyone;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.safetytwo
     *
     * @mbg.generated
     */
    private String safetytwo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_supplier.safetythree
     *
     * @mbg.generated
     */
    private String safetythree;


    private boolean checked=false;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.id
     *
     * @return the value of t_supplier.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.id
     *
     * @param id the value for t_supplier.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.supplier_id
     *
     * @return the value of t_supplier.supplier_id
     * @mbg.generated
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.supplier_id
     *
     * @param supplierId the value for t_supplier.supplier_id
     * @mbg.generated
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.name
     *
     * @return the value of t_supplier.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.name
     *
     * @param name the value for t_supplier.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.level
     *
     * @return the value of t_supplier.level
     * @mbg.generated
     */
    public Short getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.level
     *
     * @param level the value for t_supplier.level
     * @mbg.generated
     */
    public void setLevel(Short level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.leader
     *
     * @return the value of t_supplier.leader
     * @mbg.generated
     */
    public String getLeader() {
        return leader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.leader
     *
     * @param leader the value for t_supplier.leader
     * @mbg.generated
     */
    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.telephone
     *
     * @return the value of t_supplier.telephone
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.telephone
     *
     * @param telephone the value for t_supplier.telephone
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.postcode
     *
     * @return the value of t_supplier.postcode
     * @mbg.generated
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.postcode
     *
     * @param postcode the value for t_supplier.postcode
     * @mbg.generated
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.bank
     *
     * @return the value of t_supplier.bank
     * @mbg.generated
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.bank
     *
     * @param bank the value for t_supplier.bank
     * @mbg.generated
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.bankcode
     *
     * @return the value of t_supplier.bankcode
     * @mbg.generated
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.bankcode
     *
     * @param bankcode the value for t_supplier.bankcode
     * @mbg.generated
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.description
     *
     * @return the value of t_supplier.description
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.description
     *
     * @param description the value for t_supplier.description
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.is_delete
     *
     * @return the value of t_supplier.is_delete
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.is_delete
     *
     * @param isDelete the value for t_supplier.is_delete
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.address
     *
     * @return the value of t_supplier.address
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.address
     *
     * @param
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.update_time
     *
     * @return the value of t_supplier.update_time
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.update_time
     *
     * @param updateTime the value for t_supplier.update_time
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.update_user
     *
     * @return the value of t_supplier.update_user
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.update_user
     *
     * @param updateUser the value for t_supplier.update_user
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.safetyone
     *
     * @return the value of t_supplier.safetyone
     * @mbg.generated
     */
    public String getSafetyone() {
        return safetyone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.safetyone
     *
     * @param safetyone the value for t_supplier.safetyone
     * @mbg.generated
     */
    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.safetytwo
     *
     * @return the value of t_supplier.safetytwo
     * @mbg.generated
     */
    public String getSafetytwo() {
        return safetytwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.safetytwo
     *
     * @param safetytwo the value for t_supplier.safetytwo
     * @mbg.generated
     */
    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_supplier.safetythree
     *
     * @return the value of t_supplier.safetythree
     * @mbg.generated
     */
    public String getSafetythree() {
        return safetythree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_supplier.safetythree
     *
     * @param safetythree the value for t_supplier.safetythree
     * @mbg.generated
     */
    public void setSafetythree(String safetythree) {
        this.safetythree = safetythree == null ? null : safetythree.trim();
    }

    private Integer materialCount;

    public Integer getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(Integer materialCount) {
        this.materialCount = materialCount;
    }

    private String detailAddress;

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}