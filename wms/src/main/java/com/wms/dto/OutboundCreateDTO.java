package com.wms.dto;

import com.wms.entity.OutboundDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 18:23
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OutboundCreateDTO {
    private String itemNum;
    private String outboundNum;
    private String customer;
    private Integer packagingCapacity;
    private Integer planQuality;
    private List<OutboundDetail> OutboundDetail;

}
