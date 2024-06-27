package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Outbound;
import com.wms.service.OutboundService;
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
@RequestMapping("/outbound")
public class OutboundController {

    @Autowired
    private OutboundService outboundService;
    //新增
    @PostMapping("/save")
    public Result save(@RequestBody Outbound Outbound){
        return outboundService.save_outbound(Outbound)?Result.suc():Result.fail();
    }
    //更新
//    @PostMapping("/update")
//    public Result update(@RequestBody Outbound Outbound){
//        return OutboundService.update_Outbound(Outbound)?Result.suc():Result.fail();
//    }
    //删除
    @GetMapping("/del")
    public Result del(@RequestParam int id){
        return outboundService.remove_outbound(id)?Result.suc():Result.fail();
    }

    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
//        String Outbound_num = (String)param.get("Outbound_num");
//        String Outbound_status = (String)param.get("Outbound_status");
        //String  = (String)param.get("storage");

        Page<Outbound> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<Outbound> lambdaQueryWrapper = new LambdaQueryWrapper();
//        if(StringUtils.isNotBlank(Outbound_num) && !"null".equals(Outbound_num)){
//            lambdaQueryWrapper.like(Outbound::getOutboundNum,Outbound_num);
//        }
//        if(StringUtils.isNotBlank(Outbound_status) && !"null".equals(Outbound_status)){
//            lambdaQueryWrapper.eq(Outbound::getOutboundStatus,Outbound_status);
//        }
//        if(StringUtils.isNotBlank(storage) && !"null".equals(storage)){
//            lambdaQueryWrapper.eq(Outbound::getStorage,storage);
//        }

        IPage result = outboundService.pageCC(page,lambdaQueryWrapper);
        return Result.suc(result.getRecords(),result.getTotal());
    }
}
