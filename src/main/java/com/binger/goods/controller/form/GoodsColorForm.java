package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("颜色Form")
public class GoodsColorForm {

    /**
     * 颜色编码
     */
    @ApiModelProperty(value="颜色编码",required = true)
    private String colorCode;

    /**
     * 颜色名称
     */
    @ApiModelProperty(value="颜色名称",required = true)
    private String colorName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;
}