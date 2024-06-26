package com.wms.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Inbound对象", description="")
public class Inbound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")


    private int id;

    @Column(name = "inbound_num", nullable = false)
    private String inboundNum;

    @Column(name = "inbound_status")
    private Integer inboundStatus;

    @Column(name = "inbound_time")
    private Timestamp inboundTime;

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
    private List<InboundDetail> inboundDetail;

    public Inbound() {
        // default constructor
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInboundNum() {
        return inboundNum;
    }

    public void setInboundNum(String inboundNum) {
        this.inboundNum = inboundNum;
    }

    public Integer getInboundStatus() {
        return inboundStatus;
    }

    public void setInboundStatus(Integer inboundStatus) {
        this.inboundStatus = inboundStatus;
    }

    public Timestamp getInboundTime() {
        return inboundTime;
    }

    public void setInboundTime(Timestamp inboundTime) {
        this.inboundTime = inboundTime;
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

    public List<InboundDetail> getInboundDetail() {
        return this.inboundDetail;
    }

    public void setInboundDetail(List<InboundDetail> inboundDetail) {
        this.inboundDetail = inboundDetail;
    }
}
