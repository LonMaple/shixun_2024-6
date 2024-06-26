package com.wms.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Storage;
import com.wms.entity.Supplier;
import com.wms.mapper.StorageMapper;
import com.wms.mapper.SupplierMapper;
import com.wms.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SupplierServicelmpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;
    @Override
    public IPage pageCC(IPage<Supplier> page, Wrapper wrapper) {
        return supplierMapper.pageCC(page,wrapper);
    }
}
