package com.wms.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-27 01:31
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class outboundVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "outbound_num", nullable = false)
    private String outboundNum;

    @Column(name = "outbound_status")
    private Integer outboundStatus;

    @Column(name = "outbound_time")
    private Timestamp outboundTime;

    @Column(name = "create_by", length = 30)
    private String createBy;

    @Column(name = "update_by", length = 30)
    private String updateBy;

    @Column(name = "create_time", updatable = false, insertable = false)
    private Timestamp createTime;

    @Column(name = "update_time", insertable = false)
    private Timestamp updateTime;

    private String customer;
}
