package com.zyy.service;

import com.zyy.pojo.User;

public interface UserService {
    User create(String username, String password);
}
