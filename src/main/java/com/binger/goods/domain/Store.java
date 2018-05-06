package com.binger.goods.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 店铺
 */
@ApiModel(value="店铺")
public class Store implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 店铺代码
     */
    @ApiModelProperty(value="店铺代码",required = true)
    private String storeCode;

    /**
     * 店铺名称
     */
    @ApiModelProperty(value="店铺名称",required = true)
    private String storeName;

    /**
     * 最近上线时间
     */
    @ApiModelProperty(value="最近上线时间",required = false)
    private Date latestOnlineDate;

    /**
     * 店铺负责人ID
     */
    @ApiModelProperty(value="店铺负责人ID",required = false)
    private Integer storeManagerId;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 网址
     */
    @ApiModelProperty(value="网址",required = false)
    private String website;

    /**
     * 授权令牌
     */
    @ApiModelProperty(value="授权令牌",required = false)
    private String token;

    /**
     * 状态（启用、停用）
     */
    @ApiModelProperty(value="状态（启用、停用）",required = false)
    private Boolean status;

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间",required = false)
    private Date blockTime;

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
     * store
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
     * 店铺代码
     * @return store_code 店铺代码
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 店铺代码
     * @param storeCode 店铺代码
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    /**
     * 店铺名称
     * @return store_name 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 店铺名称
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 最近上线时间
     * @return latest_online_date 最近上线时间
     */
    public Date getLatestOnlineDate() {
        return latestOnlineDate;
    }

    /**
     * 最近上线时间
     * @param latestOnlineDate 最近上线时间
     */
    public void setLatestOnlineDate(Date latestOnlineDate) {
        this.latestOnlineDate = latestOnlineDate;
    }

    /**
     * 店铺负责人ID
     * @return store_manager_id 店铺负责人ID
     */
    public Integer getStoreManagerId() {
        return storeManagerId;
    }

    /**
     * 店铺负责人ID
     * @param storeManagerId 店铺负责人ID
     */
    public void setStoreManagerId(Integer storeManagerId) {
        this.storeManagerId = storeManagerId;
    }

    /**
     * 联系电话
     * @return phone_number 联系电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 联系电话
     * @param phoneNumber 联系电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 网址
     * @return website 网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 网址
     * @param website 网址
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * 授权令牌
     * @return token 授权令牌
     */
    public String getToken() {
        return token;
    }

    /**
     * 授权令牌
     * @param token 授权令牌
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 状态（启用、停用）
     * @return status 状态（启用、停用）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 状态（启用、停用）
     * @param status 状态（启用、停用）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 停用时间
     * @return block_time 停用时间
     */
    public Date getBlockTime() {
        return blockTime;
    }

    /**
     * 停用时间
     * @param blockTime 停用时间
     */
    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
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
        Store other = (Store) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStoreCode() == null ? other.getStoreCode() == null : this.getStoreCode().equals(other.getStoreCode()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getLatestOnlineDate() == null ? other.getLatestOnlineDate() == null : this.getLatestOnlineDate().equals(other.getLatestOnlineDate()))
            && (this.getStoreManagerId() == null ? other.getStoreManagerId() == null : this.getStoreManagerId().equals(other.getStoreManagerId()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
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
        result = prime * result + ((getStoreCode() == null) ? 0 : getStoreCode().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getLatestOnlineDate() == null) ? 0 : getLatestOnlineDate().hashCode());
        result = prime * result + ((getStoreManagerId() == null) ? 0 : getStoreManagerId().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
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
        sb.append(", storeCode=").append(storeCode);
        sb.append(", storeName=").append(storeName);
        sb.append(", latestOnlineDate=").append(latestOnlineDate);
        sb.append(", storeManagerId=").append(storeManagerId);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", website=").append(website);
        sb.append(", token=").append(token);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}