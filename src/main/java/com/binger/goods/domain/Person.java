package com.binger.goods.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 人员表
 */
@ApiModel(value="人员表")
public class Person implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 工号
     */
    @ApiModelProperty(value="工号",required = false)
    private String personCode;

    /**
     * 姓名
     */
    @ApiModelProperty(value="姓名",required = true)
    private String personName;

    /**
     * 证件类型
     */
    @ApiModelProperty(value="证件类型",required = true)
    private String idType;

    /**
     * 证件号码
     */
    @ApiModelProperty(value="证件号码",required = true)
    private String idCardNo;

    /**
     * 性别,0女,1男
     */
    @ApiModelProperty(value="性别,0女,1男",required = false)
    private Boolean sex;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phone;

    /**
     * 人员类型(常量字典编码)
     */
    @ApiModelProperty(value="人员类型(常量字典编码)",required = true)
    private String category;

    /**
     * 0离职, 1在职
     */
    @ApiModelProperty(value="0离职, 1在职",required = false)
    private Integer status;

    /**
     * 离职时间
     */
    @ApiModelProperty(value="离职时间",required = false)
    private Date blockTime;

    /**
     * 入职时间
     */
    @ApiModelProperty(value="入职时间",required = false)
    private Date entryTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;

    /**
     * person
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     * @return id ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 工号
     * @return person_code 工号
     */
    public String getPersonCode() {
        return personCode;
    }

    /**
     * 工号
     * @param personCode 工号
     */
    public void setPersonCode(String personCode) {
        this.personCode = personCode == null ? null : personCode.trim();
    }

    /**
     * 姓名
     * @return person_name 姓名
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 姓名
     * @param personName 姓名
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 证件类型
     * @return id_type 证件类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 证件类型
     * @param idType 证件类型
     */
    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    /**
     * 证件号码
     * @return id_card_no 证件号码
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 证件号码
     * @param idCardNo 证件号码
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    /**
     * 性别,0女,1男
     * @return sex 性别,0女,1男
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 性别,0女,1男
     * @param sex 性别,0女,1男
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 联系电话
     * @return phone 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 人员类型(常量字典编码)
     * @return category 人员类型(常量字典编码)
     */
    public String getCategory() {
        return category;
    }

    /**
     * 人员类型(常量字典编码)
     * @param category 人员类型(常量字典编码)
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 0离职, 1在职
     * @return status 0离职, 1在职
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0离职, 1在职
     * @param status 0离职, 1在职
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 离职时间
     * @return block_time 离职时间
     */
    public Date getBlockTime() {
        return blockTime;
    }

    /**
     * 离职时间
     * @param blockTime 离职时间
     */
    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * 入职时间
     * @return entry_time 入职时间
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * 入职时间
     * @param entryTime 入职时间
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Person other = (Person) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPersonCode() == null ? other.getPersonCode() == null : this.getPersonCode().equals(other.getPersonCode()))
            && (this.getPersonName() == null ? other.getPersonName() == null : this.getPersonName().equals(other.getPersonName()))
            && (this.getIdType() == null ? other.getIdType() == null : this.getIdType().equals(other.getIdType()))
            && (this.getIdCardNo() == null ? other.getIdCardNo() == null : this.getIdCardNo().equals(other.getIdCardNo()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
            && (this.getEntryTime() == null ? other.getEntryTime() == null : this.getEntryTime().equals(other.getEntryTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPersonCode() == null) ? 0 : getPersonCode().hashCode());
        result = prime * result + ((getPersonName() == null) ? 0 : getPersonName().hashCode());
        result = prime * result + ((getIdType() == null) ? 0 : getIdType().hashCode());
        result = prime * result + ((getIdCardNo() == null) ? 0 : getIdCardNo().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
        result = prime * result + ((getEntryTime() == null) ? 0 : getEntryTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", personCode=").append(personCode);
        sb.append(", personName=").append(personName);
        sb.append(", idType=").append(idType);
        sb.append(", idCardNo=").append(idCardNo);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", category=").append(category);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}