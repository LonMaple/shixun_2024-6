package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Inbound;
import com.wms.entity.InboundDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@Mapper
public interface InboundMapper extends BaseMapper<Inbound> {
    IPage pageCC(IPage<Inbound> page, @Param(Constants.WRAPPER) Wrapper wrapper);


    @Insert("insert into `teamwork-614`.inbound(inbound_num, supplier) "
            +"values "
            +"(#{inboundNum},#{supplier})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    boolean save_inbound(Inbound inbound);

    @Insert("insert into `teamwork-614`.wms_inbound_detail(inbound_id, inbound_num, item_num, package_capacity, plan_quantity) "
            +"values "
            +"(#{inboundId},#{inboundNum},#{itemNum},#{packagingCapacity},#{planQuantity})")
    boolean save_inbound_detail(InboundDetail inboundDetail);

    boolean update_inbound(Inbound inbound);

    @Delete("DELETE FROM `teamwork-614`.inbound WHERE inbound_num = #{num};")//pass
    boolean remove_inbound(int num);
}
