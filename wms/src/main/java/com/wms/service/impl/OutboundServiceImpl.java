package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.Outbound;
import com.wms.entity.OutboundDetail;
import com.wms.mapper.OutboundMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.service.OutboundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OutboundServiceImpl extends ServiceImpl<OutboundMapper, Outbound> implements OutboundService {
    @Resource
    private OutboundMapper outboundMapper;
    @Override
    public IPage pageCC(IPage<Outbound> page, Wrapper wrapper) {
        return outboundMapper.pageCC(page,wrapper);
    }

    @Override
    public boolean save_outbound(Outbound outbound) {
        List<OutboundDetail> outboundDetails = outbound.getOutboundDetail();
        boolean a = true;
        //批次处理入库单明细
        for (OutboundDetail outboundDetail :outboundDetails)
        {
            OutboundDetail outboundDetail_ = new OutboundDetail();
            //入库单数据

            outboundDetail_.setOutboundNum(outbound.getOutboundNum());
            //入库单明细
            outboundDetail_.setItemNum(outboundDetail.getItemNum());
            outboundDetail_.setPlanQuantity(outboundDetail.getPlanQuantity());
            outboundDetail_.setPackageCapacity(outboundDetail.getPackageCapacity());

            a = a && outboundMapper.save_outbound_detail(outboundDetail_);
        }
        return outboundMapper.save_outbound(outbound) && a;

    }


    @Override
    public boolean remove_outbound(int id) {
        return outboundMapper.remove_outbound(id);
    }
}