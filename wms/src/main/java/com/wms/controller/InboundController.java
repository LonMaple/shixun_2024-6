package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Inbound;
import com.wms.service.InboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@RestController
@RequestMapping("/inbound")
public class InboundController {

    @Autowired
    private InboundService inboundService;
    //新增
    @PostMapping("/save")
    public Result save(@RequestBody Inbound inbound){
        return inboundService.save_inbound(inbound)?Result.suc():Result.fail();
    }
    //更新
//    @PostMapping("/update")
//    public Result update(@RequestBody Inbound inbound){
//        return inboundService.update_inbound(inbound)?Result.suc():Result.fail();
//    }
    //删除
    @GetMapping("/del")
    public Result del(@RequestParam int id){
        return inboundService.remove_inbound(id)?Result.suc():Result.fail();
    }

    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
//        String inbound_num = (String)param.get("inbound_num");
//        String inbound_status = (String)param.get("inbound_status");
        //String  = (String)param.get("storage");

        Page<Inbound> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<Inbound> lambdaQueryWrapper = new LambdaQueryWrapper();
//        if(StringUtils.isNotBlank(inbound_num) && !"null".equals(inbound_num)){
//            lambdaQueryWrapper.like(Inbound::getInboundNum,inbound_num);
//        }
//        if(StringUtils.isNotBlank(inbound_status) && !"null".equals(inbound_status)){
//            lambdaQueryWrapper.eq(Inbound::getInboundStatus,inbound_status);
//        }
//        if(StringUtils.isNotBlank(storage) && !"null".equals(storage)){
//            lambdaQueryWrapper.eq(Inbound::getStorage,storage);
//        }

        IPage result = inboundService.pageCC(page,lambdaQueryWrapper);
        return Result.suc(result.getRecords(),result.getTotal());
    }
}
