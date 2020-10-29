package com.code.gen.service.impl;

import com.code.gen.entity.User;
import com.code.gen.mapper.UserMapper;
import com.code.gen.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiXiang
 * @since 2020-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
