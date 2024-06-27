package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Inventory;
import com.wms.entity.Inventory;
import com.wms.mapper.InventoryMapper;
import com.wms.service.InventoryService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements InventoryService {
    @Resource
    private InventoryMapper InventoryMapper;

    @Override
    public boolean update_inventory(Inventory inventory) {
        return InventoryMapper.update_inventory(inventory);
    }
    @Override
    public IPage pageCC(IPage<Inventory> page, Wrapper wrapper) {
        return InventoryMapper.pageCC(page,wrapper);
    }
}
