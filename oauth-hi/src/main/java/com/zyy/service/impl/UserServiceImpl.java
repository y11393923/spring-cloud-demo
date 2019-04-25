package com.zyy.service.impl;

import com.zyy.pojo.User;
import com.zyy.repository.UserDao;
import com.zyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author:zhouyuyang
 * @Description:
 * @Date: Created in 17:32 2019/4/25
 */
@Service
public class UserServiceImpl implements UserService {
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @Override
    public User create(String username, String password) {
        User user = new User();
        user.setUsername(username);
        password = "{bcrypt}" + passwordEncoder.encode(password);
        user.setPassword(password);
        User u = userDao.save(user);
        return u;
    }
}
