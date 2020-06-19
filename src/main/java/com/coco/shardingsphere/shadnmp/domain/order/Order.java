package com.coco.shardingsphere.shadnmp.domain.order;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Ming
 */
@Data
@Accessors(chain = true)
public class Order {

    private Long id;

    private String orderNumber;

    private String receiveUser;

    private String createDate;

}
