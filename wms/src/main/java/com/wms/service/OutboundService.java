package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Outbound;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */

public interface OutboundService extends IService<Outbound> {
    IPage pageCC(IPage<Outbound> page, Wrapper wrapper);
    boolean save_outbound(Outbound outbound);
    //    boolean update_Outbound(Outbound Outbound);
    boolean remove_outbound(int id);



}
