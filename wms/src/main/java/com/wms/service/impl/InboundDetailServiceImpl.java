package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.InboundDetail;
import com.wms.mapper.InboundDetailMapper;
import com.wms.service.InboundDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class InboundDetailServiceImpl extends ServiceImpl<InboundDetailMapper, InboundDetail> implements InboundDetailService {

    @Resource
    private InboundDetailMapper inboundDetailMapper;

    @Override
    public boolean update_inboundDetail(InboundDetail inboundDetail) {
        return inboundDetailMapper.update_inboundDetail(inboundDetail);
    }

    @Override
    public IPage<InboundDetail> pageCC(Page<InboundDetail> page, Wrapper wrapper) {
        return inboundDetailMapper.pageCC(page, wrapper);
    }

}
