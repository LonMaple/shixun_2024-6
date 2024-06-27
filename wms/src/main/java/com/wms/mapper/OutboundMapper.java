package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.dto.OutboundOrderQueryDTO;
import com.wms.entity.Outbound;
import org.apache.ibatis.annotations.*;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@Mapper
public interface OutboundMapper extends BaseMapper<Outbound> {
    Outbound queryByOutboundDto(OutboundOrderQueryDTO dto);

    boolean deleteByOutboundNum(Integer outboundNum);

    boolean insert(String outboundNum);

    boolean updateStatusByOutboundNum(String outboundNum);
}
