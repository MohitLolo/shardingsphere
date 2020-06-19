package com.coco.shardingsphere.shadnmp.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.shardingsphere.shadnmp.domain.R;
import com.coco.shardingsphere.shadnmp.domain.user.User;
import com.coco.shardingsphere.shadnmp.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ming
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public R listByName(Long pageNum, Long pageSize, String name) {
        IPage<User> userIPage = baseMapper.listByName(new Page<>(pageNum, pageSize), name);
        return R.success(userIPage);
    }

}
