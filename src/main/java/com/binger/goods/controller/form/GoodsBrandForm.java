package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "品牌信息Form")
public class GoodsBrandForm {

    /**
     * 品牌编码
     */
    @ApiModelProperty(value="品牌编码",required = true)
    private String brandCode;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value="品牌名称",required = true)
    private String brandName;

    /**
     * 国家编码
     */
    @ApiModelProperty(value="国家编码",required = false)
    private String countryCode;

    /**
     * 国家名称
     */
    @ApiModelProperty(value="国家名称",required = false)
    private String countryName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用",required = false)
    private Boolean status;

}