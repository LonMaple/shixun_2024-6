package com.wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 18:23
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OutboundOrderQueryDTO {
    private String outboundStatus;
    private String outboundNum;
    private String customer;

}
