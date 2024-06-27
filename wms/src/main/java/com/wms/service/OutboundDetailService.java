package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.OutboundDetail;

public interface OutboundDetailService extends IService<OutboundDetail> {

    IPage pageCC(Page<OutboundDetail> page, Wrapper wrapper);
    boolean update_outboundDetail(OutboundDetail outboundDetail);

}
