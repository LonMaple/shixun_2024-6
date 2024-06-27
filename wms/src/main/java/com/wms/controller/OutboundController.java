package com.wms.controller;

import com.wms.common.Result;
import com.wms.dto.OutboundCreateDTO;
import com.wms.dto.OutboundOrderQueryDTO;
import com.wms.service.OutboundService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 17:07
 * @Description: 出库接口控制器
 */
@RestController
@RequestMapping("/outbound")
public class OutboundController {
    @Resource
    private OutboundService outboundService;
    @GetMapping("")
    public Result outBoundQuery(OutboundOrderQueryDTO outboundOrderQueryDTO){
        return outboundService.query(outboundOrderQueryDTO);
    }

    @DeleteMapping("")
    public Result deleteByOutBoundNum(@RequestParam Integer outboundNum){
        return outboundService.deleteByOutBoundNum(outboundNum);
    }
    @PostMapping
    public Result createOutbound(@RequestBody OutboundCreateDTO outboundCreateDTO){
        return outboundService.createOutbound(outboundCreateDTO);
    }

}
