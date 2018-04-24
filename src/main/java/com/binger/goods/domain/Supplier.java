package com.binger.goods.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 供应商
 */
@ApiModel(value="供应商")
public class Supplier implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 供应商代码
     */
    @ApiModelProperty(value="供应商代码",required = true)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = true)
    private String supplierName;

    /**
     * 供应商简称
     */
    @ApiModelProperty(value="供应商简称",required = false)
    private String supplierShortName;

    /**
     * 供应商分类
     */
    @ApiModelProperty(value="供应商分类",required = false)
    private String supplierCategory;

    /**
     * 联系人
     */
    @ApiModelProperty(value="联系人",required = false)
    private String contact;

    /**
     * 超收比例(%)
     */
    @ApiModelProperty(value="超收比例(%)",required = false)
    private BigDecimal overchargeRate;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 国家ID
     */
    @ApiModelProperty(value="国家ID",required = false)
    private Integer countryId;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String country;

    /**
     * 省份ID
     */
    @ApiModelProperty(value="省份ID",required = false)
    private Integer stateId;

    /**
     * 省份
     */
    @ApiModelProperty(value="省份",required = false)
    private String state;

    /**
     * 城市ID
     */
    @ApiModelProperty(value="城市ID",required = false)
    private Integer cityId;

    /**
     * 城市
     */
    @ApiModelProperty(value="城市",required = false)
    private String city;

    /**
     * 地址
     */
    @ApiModelProperty(value="地址",required = false)
    private String address;

    /**
     * 邮编
     */
    @ApiModelProperty(value="邮编",required = false)
    private String zip;

    /**
     * 银行类别
     */
    @ApiModelProperty(value="银行类别",required = false)
    private String bankCategory;

    /**
     * 开户银行
     */
    @ApiModelProperty(value="开户银行",required = false)
    private String bank;

    /**
     * 银行账号
     */
    @ApiModelProperty(value="银行账号",required = false)
    private String bankAccount;

    /**
     * 税号/身份证号
     */
    @ApiModelProperty(value="税号/身份证号",required = false)
    private String taxNumber;

    /**
     * 信用额度
     */
    @ApiModelProperty(value="信用额度",required = false)
    private String credit;

    /**
     * 是否黑名单
     */
    @ApiModelProperty(value="是否黑名单",required = false)
    private Boolean isBlackList;

    /**
     * 结算id
     */
    @ApiModelProperty(value="结算id",required = false)
    private Integer settlementId;

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
     * 
     */
    @ApiModelProperty(value="",required = false)
    private String secondContact;

    /**
     * supplier
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
     * 供应商代码
     * @return supplier_code 供应商代码
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 供应商代码
     * @param supplierCode 供应商代码
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    /**
     * 供应商名称
     * @return supplier_name 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 供应商名称
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 供应商简称
     * @return supplier_short_name 供应商简称
     */
    public String getSupplierShortName() {
        return supplierShortName;
    }

    /**
     * 供应商简称
     * @param supplierShortName 供应商简称
     */
    public void setSupplierShortName(String supplierShortName) {
        this.supplierShortName = supplierShortName == null ? null : supplierShortName.trim();
    }

    /**
     * 供应商分类
     * @return supplier_category 供应商分类
     */
    public String getSupplierCategory() {
        return supplierCategory;
    }

    /**
     * 供应商分类
     * @param supplierCategory 供应商分类
     */
    public void setSupplierCategory(String supplierCategory) {
        this.supplierCategory = supplierCategory == null ? null : supplierCategory.trim();
    }

    /**
     * 联系人
     * @return contact 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 联系人
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 超收比例(%)
     * @return overcharge_rate 超收比例(%)
     */
    public BigDecimal getOverchargeRate() {
        return overchargeRate;
    }

    /**
     * 超收比例(%)
     * @param overchargeRate 超收比例(%)
     */
    public void setOverchargeRate(BigDecimal overchargeRate) {
        this.overchargeRate = overchargeRate;
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
     * 国家ID
     * @return country_id 国家ID
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 国家ID
     * @param countryId 国家ID
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 国家
     * @return country 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 省份ID
     * @return state_id 省份ID
     */
    public Integer getStateId() {
        return stateId;
    }

    /**
     * 省份ID
     * @param stateId 省份ID
     */
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    /**
     * 省份
     * @return state 省份
     */
    public String getState() {
        return state;
    }

    /**
     * 省份
     * @param state 省份
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 城市ID
     * @return city_id 城市ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 城市ID
     * @param cityId 城市ID
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 邮编
     * @return zip 邮编
     */
    public String getZip() {
        return zip;
    }

    /**
     * 邮编
     * @param zip 邮编
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * 银行类别
     * @return bank_category 银行类别
     */
    public String getBankCategory() {
        return bankCategory;
    }

    /**
     * 银行类别
     * @param bankCategory 银行类别
     */
    public void setBankCategory(String bankCategory) {
        this.bankCategory = bankCategory == null ? null : bankCategory.trim();
    }

    /**
     * 开户银行
     * @return bank 开户银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 开户银行
     * @param bank 开户银行
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * 银行账号
     * @return bank_account 银行账号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 银行账号
     * @param bankAccount 银行账号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * 税号/身份证号
     * @return tax_number 税号/身份证号
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * 税号/身份证号
     * @param taxNumber 税号/身份证号
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    /**
     * 信用额度
     * @return credit 信用额度
     */
    public String getCredit() {
        return credit;
    }

    /**
     * 信用额度
     * @param credit 信用额度
     */
    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    /**
     * 是否黑名单
     * @return is_black_list 是否黑名单
     */
    public Boolean getIsBlackList() {
        return isBlackList;
    }

    /**
     * 是否黑名单
     * @param isBlackList 是否黑名单
     */
    public void setIsBlackList(Boolean isBlackList) {
        this.isBlackList = isBlackList;
    }

    /**
     * 结算id
     * @return settlement_id 结算id
     */
    public Integer getSettlementId() {
        return settlementId;
    }

    /**
     * 结算id
     * @param settlementId 结算id
     */
    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
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

    /**
     * 
     * @return second_contact 
     */
    public String getSecondContact() {
        return secondContact;
    }

    /**
     * 
     * @param secondContact 
     */
    public void setSecondContact(String secondContact) {
        this.secondContact = secondContact == null ? null : secondContact.trim();
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
        Supplier other = (Supplier) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getSupplierShortName() == null ? other.getSupplierShortName() == null : this.getSupplierShortName().equals(other.getSupplierShortName()))
            && (this.getSupplierCategory() == null ? other.getSupplierCategory() == null : this.getSupplierCategory().equals(other.getSupplierCategory()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getOverchargeRate() == null ? other.getOverchargeRate() == null : this.getOverchargeRate().equals(other.getOverchargeRate()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getStateId() == null ? other.getStateId() == null : this.getStateId().equals(other.getStateId()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getZip() == null ? other.getZip() == null : this.getZip().equals(other.getZip()))
            && (this.getBankCategory() == null ? other.getBankCategory() == null : this.getBankCategory().equals(other.getBankCategory()))
            && (this.getBank() == null ? other.getBank() == null : this.getBank().equals(other.getBank()))
            && (this.getBankAccount() == null ? other.getBankAccount() == null : this.getBankAccount().equals(other.getBankAccount()))
            && (this.getTaxNumber() == null ? other.getTaxNumber() == null : this.getTaxNumber().equals(other.getTaxNumber()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getIsBlackList() == null ? other.getIsBlackList() == null : this.getIsBlackList().equals(other.getIsBlackList()))
            && (this.getSettlementId() == null ? other.getSettlementId() == null : this.getSettlementId().equals(other.getSettlementId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getSecondContact() == null ? other.getSecondContact() == null : this.getSecondContact().equals(other.getSecondContact()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getSupplierShortName() == null) ? 0 : getSupplierShortName().hashCode());
        result = prime * result + ((getSupplierCategory() == null) ? 0 : getSupplierCategory().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getOverchargeRate() == null) ? 0 : getOverchargeRate().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getStateId() == null) ? 0 : getStateId().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getZip() == null) ? 0 : getZip().hashCode());
        result = prime * result + ((getBankCategory() == null) ? 0 : getBankCategory().hashCode());
        result = prime * result + ((getBank() == null) ? 0 : getBank().hashCode());
        result = prime * result + ((getBankAccount() == null) ? 0 : getBankAccount().hashCode());
        result = prime * result + ((getTaxNumber() == null) ? 0 : getTaxNumber().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getIsBlackList() == null) ? 0 : getIsBlackList().hashCode());
        result = prime * result + ((getSettlementId() == null) ? 0 : getSettlementId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getSecondContact() == null) ? 0 : getSecondContact().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", supplierShortName=").append(supplierShortName);
        sb.append(", supplierCategory=").append(supplierCategory);
        sb.append(", contact=").append(contact);
        sb.append(", overchargeRate=").append(overchargeRate);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", countryId=").append(countryId);
        sb.append(", country=").append(country);
        sb.append(", stateId=").append(stateId);
        sb.append(", state=").append(state);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", zip=").append(zip);
        sb.append(", bankCategory=").append(bankCategory);
        sb.append(", bank=").append(bank);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", taxNumber=").append(taxNumber);
        sb.append(", credit=").append(credit);
        sb.append(", isBlackList=").append(isBlackList);
        sb.append(", settlementId=").append(settlementId);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", secondContact=").append(secondContact);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}