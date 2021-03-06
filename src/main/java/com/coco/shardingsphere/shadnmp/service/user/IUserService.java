package com.coco.shardingsphere.shadnmp.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coco.shardingsphere.shadnmp.domain.R;
import com.coco.shardingsphere.shadnmp.domain.user.User;

/**
 * @author Ming
 */
public interface IUserService extends IService<User> {


    R listByName(Long pageNum, Long pageSize, String name);

}
