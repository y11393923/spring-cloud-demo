package com.zyy.repository;

import com.zyy.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhouyuyang
 * @Description:
 * @Date: Created in 16:32 2019/4/25
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
