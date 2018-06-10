package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品品牌VO")
public class GoodsBrandVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 品牌编码
     */
    @ApiModelProperty(value="品牌编码")
    private String brandCode;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value="品牌名称")
    private String brandName;

    /**
     * 国家编码
     */
    @ApiModelProperty(value="国家编码")
    private String countryCode;

    /**
     * 国家名称
     */
    @ApiModelProperty(value="国家名称")
    private String countryName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String remark;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

}