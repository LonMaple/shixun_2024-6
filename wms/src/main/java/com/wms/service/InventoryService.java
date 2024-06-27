package com.wms.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Inventory;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface InventoryService {

    IPage pageCC(IPage<Inventory> page, @Param(Constants.WRAPPER) Wrapper wrapper);
    boolean update_inventory(Inventory inventory);
}
