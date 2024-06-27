package com.wms.entity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OutboundDetail对象", description="")
public class OutboundDetail {
    // Getters 和 Setters
    private int id;
    private int OutboundId;//可以不用
    private String OutboundNum;//入库单号
    private String itemNum; //零件号
    private Integer packageCapacity; // 包装容量允许为null，使用包装类 Integer
    private Integer planQuantity; // 计划入库数量允许为null，使用包装类 Integer
    private Integer realQuantity; // 实际入库数量允许为null，使用包装类 Integer
    private String createBy;
    private String updateBy;
    private Timestamp createTime;
    private Timestamp updateTime;

    // 构造函数
    public OutboundDetail() {
        // 默认构造函数
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOutboundId(int OutboundId) {
        this.OutboundId = OutboundId;
    }

    public void setOutboundNum(String OutboundNum) {
        this.OutboundNum = OutboundNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public void setPackageCapacity(Integer packageCapacity) {
        this.packageCapacity = packageCapacity;
    }

    public void setPlanQuantity(Integer planQuantity) {
        this.planQuantity = planQuantity;
    }

    public void setRealQuantity(Integer realQuantity) {
        this.realQuantity = realQuantity;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
