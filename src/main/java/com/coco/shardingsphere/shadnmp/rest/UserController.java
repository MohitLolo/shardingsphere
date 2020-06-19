package com.coco.shardingsphere.shadnmp.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coco.shardingsphere.shadnmp.domain.R;
import com.coco.shardingsphere.shadnmp.domain.user.User;
import com.coco.shardingsphere.shadnmp.service.user.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ming
 */
@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    IUserService userService;

    @PostMapping("info")
    public R addUser(@RequestBody User user) {
        userService.save(user);
        return R.success();
    }

    @GetMapping("list/{pageNum}/{pageSize}")
    public R list(@PathVariable Long pageSize,@PathVariable Long pageNum) {
        Page<User> page = userService.page(new Page<>(pageNum, pageSize));
        return R.success("查询成功",page);
    }


}
