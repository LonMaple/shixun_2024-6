package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.OutboundDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OutboundDetailMapper extends BaseMapper<OutboundDetail> {

    IPage pageCC(IPage<OutboundDetail> page, @Param(Constants.WRAPPER) Wrapper wrapper);

    boolean update_outboundDetail(OutboundDetail outboundDetail);
}
