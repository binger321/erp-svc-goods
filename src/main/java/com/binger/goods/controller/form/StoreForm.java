package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("商店form")
@Data
public class StoreForm {

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


}
