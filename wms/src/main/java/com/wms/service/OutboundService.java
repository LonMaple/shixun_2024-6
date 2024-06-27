package com.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.common.Result;
import com.wms.dto.OutboundCreateDTO;
import com.wms.dto.OutboundDetailUpdate;
import com.wms.dto.OutboundOrderQueryDTO;
import com.wms.entity.Outbound;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 17:08
 * @Description:
 */
public interface OutboundService extends IService<Outbound> {
    /**
     * 根据status、num(出库单号)和customer进行查询
     * @param outboundOrderQueryDTO
     * @return
     */
    Result query(OutboundOrderQueryDTO outboundOrderQueryDTO);

    Result deleteByOutBoundNum(Integer outboundNum);

    Result createOutbound(OutboundCreateDTO outboundCreateDTO);

    Result queryOutboundDetail(String outboundNum);

    Result updateOutboundDetail(OutboundDetailUpdate outboundDetailUpdate);
}
