package com.coco.shardingsphere.shadnmp.domain.address;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Ming
 */
@Data
@Accessors(chain = true)
public class Address {

    private Long id;

    private String address;

    private String name;

}
