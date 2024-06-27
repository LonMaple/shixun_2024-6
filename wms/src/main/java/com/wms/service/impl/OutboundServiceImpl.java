package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.Result;
import com.wms.dto.OutboundCreateDTO;
import com.wms.dto.OutboundDetailUpdate;
import com.wms.dto.OutboundOrderQueryDTO;
import com.wms.entity.Outbound;
import com.wms.entity.OutboundDetail;
import com.wms.po.WmsOutboundDetail;
import com.wms.mapper.WmsOutboundDetailMapper;
import com.wms.mapper.OutboundMapper;
import com.wms.service.OutboundService;
import com.wms.vo.outboundVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 17:09
 * @Description:
 */
@Service
public class OutboundServiceImpl extends ServiceImpl<OutboundMapper, Outbound> implements OutboundService {
    @Resource
    private OutboundMapper outboundMapper;
    @Resource
    private WmsOutboundDetailMapper wmsOutboundDetailMapper;

    @Override
    public Result query(OutboundOrderQueryDTO outboundOrderQueryDTO) {
        Outbound outbound = outboundMapper.queryByOutboundDto(outboundOrderQueryDTO);
        if(outbound==null){
            return new Result().fail();
        }
        else{
            outboundVO outboundVO = new outboundVO();
            BeanUtils.copyProperties(outbound,outboundVO);
            outboundVO.setCustomer(outboundOrderQueryDTO.getCustomer());
            return Result.suc(outboundVO);
        }
    }

    @Override
    public Result deleteByOutBoundNum(Integer outboundNum) {
        if(outboundNum!=null){
            boolean suc = outboundMapper.deleteByOutboundNum(outboundNum);
            if(suc)  return Result.suc();
        }
        return Result.fail();
    }

    @Override
    public Result createOutbound(OutboundCreateDTO outboundCreateDTO) {
        boolean ok = true;
        ok = outboundMapper.insert(outboundCreateDTO.getOutboundNum());
        for(OutboundDetail obd:outboundCreateDTO.getOutboundDetail()){
            WmsOutboundDetail wmsOutboundDetail = new WmsOutboundDetail();
            BeanUtils.copyProperties(obd,wmsOutboundDetail);
            wmsOutboundDetail.setOutboundNum(outboundCreateDTO.getOutboundNum());
            wmsOutboundDetail.setRealQuantity(wmsOutboundDetail.getPlanQuantity());
            if(wmsOutboundDetailMapper.insert(wmsOutboundDetail)==0){
                ok=false;
            }
        }
        if(ok){
            return Result.suc("outbound插入成功");
        }
        return Result.fail();
    }

    @Override
    public Result queryOutboundDetail(String outboundNum) {
        List<WmsOutboundDetail> outboundDetailList = wmsOutboundDetailMapper.getByOutboundNum(outboundNum);
        if(outboundDetailList!=null){
            return Result.suc(outboundDetailList);
        }
        return Result.fail();
    }

    @Override
    public Result updateOutboundDetail(OutboundDetailUpdate outboundDetailUpdate) {
        boolean ok = true;
        for(OutboundDetail dt:outboundDetailUpdate.getOutboundDetail()){
            dt.setOutboundNum(outboundDetailUpdate.getOutboundNum());
            ok = wmsOutboundDetailMapper.updateOutboundDetail(dt);
        }
        return ok==true?Result.suc("出库明细表修改成功"):Result.fail();

    }
}
