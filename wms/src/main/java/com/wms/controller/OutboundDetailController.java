package com.wms.controller;

import com.wms.common.Result;
import com.wms.dto.OutboundCreateDTO;
import com.wms.dto.OutboundDetailUpdate;
import com.wms.dto.OutboundOrderQueryDTO;
import com.wms.service.OutboundService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: Y-Tikon 今天在外太空
 * @Date: 2024-06-26 18:07
 * @Description: 出库详细信息接口控制器
 */
@RestController
@RequestMapping("/outboundDetail")
public class OutboundDetailController {
    @Resource
    private OutboundService outboundService;

    @GetMapping("")
    public Result outBoundDetailQuery(@RequestParam String outboundNum){
        return outboundService.queryOutboundDetail(outboundNum);
    }

    @PutMapping
    public Result updateOutboundDetail(@RequestBody OutboundDetailUpdate outboundDetailUpdate){
        return outboundService.updateOutboundDetail(outboundDetailUpdate);
    }
    @PostMapping
    public Result createOutbound(@RequestBody OutboundCreateDTO outboundCreateDTO){
        return outboundService.createOutbound(outboundCreateDTO);
    }

}
