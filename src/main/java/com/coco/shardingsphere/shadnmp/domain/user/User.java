package com.coco.shardingsphere.shadnmp.domain.user;

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
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String createTime;

}
