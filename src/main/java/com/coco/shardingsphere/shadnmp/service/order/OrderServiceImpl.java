package com.coco.shardingsphere.shadnmp.service.order;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.shardingsphere.shadnmp.domain.order.Order;
import com.coco.shardingsphere.shadnmp.mapper.order.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ming
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService{

}
