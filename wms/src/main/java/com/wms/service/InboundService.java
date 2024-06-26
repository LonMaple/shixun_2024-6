package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Inbound;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */

public interface InboundService extends IService<Inbound> {
    IPage pageCC(IPage<Inbound> page, Wrapper wrapper);
    boolean save_inbound(Inbound inbound);
//    boolean update_inbound(Inbound inbound);
    boolean remove_inbound(int id);



}
