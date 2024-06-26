package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.InboundDetail;

public interface InboundDetailService extends IService<InboundDetail> {

    IPage pageCC(Page<InboundDetail> page, Wrapper wrapper);
    boolean update_inboundDetail(InboundDetail inboundDetail);

}
