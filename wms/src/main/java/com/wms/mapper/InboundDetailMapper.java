package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.InboundDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface InboundDetailMapper extends BaseMapper<InboundDetail> {

    IPage pageCC(IPage<InboundDetail> page, @Param(Constants.WRAPPER) Wrapper wrapper);

    boolean update_inboundDetail(InboundDetail inboundDetail);
}
