package com.wms.dto;

import com.wms.entity.OutboundDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-27 09:55
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OutboundDetailUpdate {
    private String outboundNum;
    private List<OutboundDetail> outboundDetail;

}
