package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/25
 * Time: 下午1:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "款式vo")
@Data
public class GoodsStyleVo {

    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 款式编码
     */
    @ApiModelProperty(value="款式编码",required = true)
    private String styleCode;

    /**
     * 款式名称
     */
    @ApiModelProperty(value="款式名称",required = true)
    private String styleName;

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

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间",required = false)
    private Date blockTime;
}
