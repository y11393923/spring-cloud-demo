package com.zyy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author:zhouyuyang
 * @Description: 采用RemoteTokenServices这种方式对token进行验证，如果其他资源服务需要验证token,则需要远程调用授权服务暴露的验证token的api接口
 * @Date: Created in 17:14 2019/4/25
 */
@RestController
@RequestMapping("/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info(principal.toString());
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        return principal;
    }
}
