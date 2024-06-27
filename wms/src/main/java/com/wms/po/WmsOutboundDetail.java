package com.wms.po;

import io.swagger.annotations.ApiModel;
import lombok.*;

import java.sql.Timestamp;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 17:04
 * @Description: PO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OutboundDetail对象", description="")
@NoArgsConstructor
@AllArgsConstructor
public class WmsOutboundDetail {
    private int outboundId;//可以不用
    private String outboundNum;//入库单号
    private String itemNum; //零件号
    private Integer itemStatus;
    private Integer container; // 包装容量允许为null，使用包装类 Integer
    private Integer planQuantity; // 计划入库数量允许为null，使用包装类 Integer
    private Integer realQuantity; // 实际入库数量允许为null，使用包装类 Integer
    private String createBy;
    private String updateBy;
    private Timestamp createTime;
    private Timestamp updateTime;

}
