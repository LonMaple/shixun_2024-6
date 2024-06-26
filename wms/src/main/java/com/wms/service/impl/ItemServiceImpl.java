package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Item;
import com.wms.mapper.ItemMapper;
import com.wms.service.ItemService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {
    @Resource
    private ItemMapper itemMapper;
    @Override
    public IPage pageCC(IPage<Item> page, Wrapper wrapper) {
        return itemMapper.pageCC(page,wrapper);
    }
}
