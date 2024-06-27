package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Outbound;
import com.wms.entity.OutboundDetail;
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
public interface OutboundMapper extends BaseMapper<Outbound> {
    IPage pageCC(IPage<Outbound> page, @Param(Constants.WRAPPER) Wrapper wrapper);


    @Insert("insert into `teamwork-614`.wms_outbound(outbound_num, supplier) "
            +"values "
            +"(#{outboundNum},#{supplier})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    boolean save_outbound(Outbound outbound);

    @Insert("insert into `teamwork-614`.wms_outbound_detail(outbound_id, outbound_num, item_num, package_capacity, plan_quantity) "
            +"values "
            +"(#{outboundId},#{outboundNum},#{itemNum},#{packageCapacity},#{planQuantity})")
    boolean save_outbound_detail(OutboundDetail outboundDetail);

//  boolean update_outbound(Outbound outbound);

    @Delete("DELETE FROM `teamwork-614`.wms_outbound WHERE id = #{id};")//pass
    boolean remove_outbound(int id);
}