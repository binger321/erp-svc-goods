package com.binger.goods.dto.query;

import com.binger.common.QueryDtoBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("人员列表query")
@Data
public class UserQueryDto extends QueryDtoBase{
    /**
     * 用户代码
     */
    @ApiModelProperty(value="用户代码",required = false)
    private String userCode;

    /**
     * 用户名称
     */
    @ApiModelProperty(value="用户名称",required = false)
    private String userName;

    /**
     * 人员表id
     */
    @ApiModelProperty(value="人员表id",required = false)
    private Integer personId;


    /**
     * 人员表name
     */
    @ApiModelProperty(value="人员表名称",required = false)
    private String personName;


    /**
     * 0禁用, 1启用, 2锁定
     */
    @ApiModelProperty(value="0禁用, 1启用, 2锁定",required = false)
    private Integer status;

}
