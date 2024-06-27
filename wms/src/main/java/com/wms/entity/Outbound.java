package com.wms.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Outbound对象", description="")
public class Outbound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")


    private int id;

    @Column(name = "Outbound_num", nullable = false)
    private String OutboundNum;

    @Column(name = "Outbound_status")
    private Integer OutboundStatus;

    @Column(name = "Outbound_time")
    private Timestamp OutboundTime;

    @Column(name = "create_by", length = 30)
    private String createBy;

    @Column(name = "update_by", length = 30)
    private String updateBy;

    @Column(name = "create_time", updatable = false, insertable = false)
    private Timestamp createTime;

    @Column(name = "update_time", insertable = false)
    private Timestamp updateTime;

    @Column(name = "supplier", length = 30)
    private String supplier;

    @Transient
    private List<OutboundDetail> OutboundDetail;

    public Outbound() {
        // default constructor
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutboundNum() {
        return OutboundNum;
    }

    public void setOutboundNum(String OutboundNum) {
        this.OutboundNum = OutboundNum;
    }

    public Integer getOutboundStatus() {
        return OutboundStatus;
    }

    public void setOutboundStatus(Integer OutboundStatus) {
        this.OutboundStatus = OutboundStatus;
    }

    public Timestamp getOutboundTime() {
        return OutboundTime;
    }

    public void setOutboundTime(Timestamp OutboundTime) {
        this.OutboundTime = OutboundTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public List<OutboundDetail> getOutboundDetail() {
        return this.OutboundDetail;
    }

    public void setOutboundDetail(List<OutboundDetail> OutboundDetail) {
        this.OutboundDetail = OutboundDetail;
    }
}
