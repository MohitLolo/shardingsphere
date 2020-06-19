package com.coco.shardingsphere.shadnmp.service.user;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.shardingsphere.shadnmp.domain.user.User;
import com.coco.shardingsphere.shadnmp.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ming
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    
}
