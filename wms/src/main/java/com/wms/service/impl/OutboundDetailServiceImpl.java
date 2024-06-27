package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.OutboundDetail;
import com.wms.mapper.OutboundDetailMapper;
import com.wms.service.OutboundDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class OutboundDetailServiceImpl extends ServiceImpl<OutboundDetailMapper, OutboundDetail> implements OutboundDetailService {

    @Resource
    private OutboundDetailMapper outboundDetailMapper;

    @Override
    public boolean update_outboundDetail(OutboundDetail outboundDetail) {
        return outboundDetailMapper.update_outboundDetail(outboundDetail);
    }

    @Override
    public IPage<OutboundDetail> pageCC(Page<OutboundDetail> page, Wrapper wrapper) {
        return outboundDetailMapper.pageCC(page, wrapper);
    }

}
