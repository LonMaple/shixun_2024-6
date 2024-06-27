package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.dto.OutboundDetailUpdate;
import com.wms.entity.OutboundDetail;
import com.wms.po.WmsOutboundDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WmsOutboundDetailMapper extends BaseMapper<WmsOutboundDetail> {

    List<WmsOutboundDetail> getByOutboundNum(String outboundNum);

    boolean updateOutboundDetail(OutboundDetail dt);
}
