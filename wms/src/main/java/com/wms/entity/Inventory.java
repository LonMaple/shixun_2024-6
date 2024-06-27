package com.wms.entity;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Data
public class Inventory {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "item_num", nullable = false)
    private int itemNum;

    @Column(name = "quantity")
    private int quantity;  // 使用Integer允许库存数量可以为空

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    // 构造方法
    public Inventory() {
        // 默认构造方法
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    // toString方法（可选）

}

