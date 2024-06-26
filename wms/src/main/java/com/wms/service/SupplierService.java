package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Supplier;
import org.apache.ibatis.annotations.Param;

public interface SupplierService extends IService<Supplier> {

    IPage pageCC(IPage<Supplier> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
