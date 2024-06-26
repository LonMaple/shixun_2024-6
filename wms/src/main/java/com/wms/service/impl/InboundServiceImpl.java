package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.Inbound;
import com.wms.entity.InboundDetail;
import com.wms.mapper.InboundMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.service.InboundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class InboundServiceImpl extends ServiceImpl<InboundMapper, Inbound> implements InboundService {
    @Resource
    private InboundMapper inboundMapper;
    @Override
    public IPage pageCC(IPage<Inbound> page, Wrapper wrapper) {
        return inboundMapper.pageCC(page,wrapper);
    }

    @Override
    public boolean save_inbound(Inbound inbound) {
        List<InboundDetail> inboundDetails = inbound.getInboundDetail();
        boolean a = true;
        //批次处理入库单明细
        for (InboundDetail inboundDetail :inboundDetails)
        {
            InboundDetail inboundDetail_ = new InboundDetail();
            //入库单数据

            inboundDetail_.setInboundNum(inbound.getInboundNum());
            //入库单明细
            inboundDetail_.setItemNum(inboundDetail.getItemNum());
            inboundDetail_.setPlanQuantity(inboundDetail.getPlanQuantity());
            inboundDetail_.setPackagingCapacity(inboundDetail.getPackagingCapacity());

            a = a && inboundMapper.save_inbound_detail(inboundDetail_);
        }
        return inboundMapper.save_inbound(inbound) && a;

    }

//    @Override
//    public boolean update_inbound(Inbound inbound) {
//        return inboundMapper.update_inbound(inbound);
//    }

    @Override
    public boolean remove_inbound(int id) {
        return inboundMapper.remove_inbound(id);
    }

}
