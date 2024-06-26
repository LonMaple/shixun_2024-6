package com.wms.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Supplier对象", description="")
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "供应商代码")
    @TableId(value = "id", type = IdType.AUTO)
    private Number id;

    @ApiModelProperty(value = "供应商名称")
    private String Sp_name;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "更新人")
    private String updater;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date update_time;




}
