package com.coco.shardingsphere.shadnmp.rest;

import com.coco.shardingsphere.shadnmp.service.order.IOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ming
 */
@RestController
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {

    IOrderService orderService;


}
