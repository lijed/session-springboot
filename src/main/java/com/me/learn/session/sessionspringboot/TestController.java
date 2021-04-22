/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.session.sessionspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Description:
 * @Author: Administrator
 * Created: 2021/4/22
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    String portNumber;

    @GetMapping("/set")
    public String set(HttpSession session) {
        session.setAttribute("userInfo", "jedli");
        return portNumber;
    }

    @GetMapping("/getData")
    public String get(HttpSession session) {
        return session.getAttribute("userInfo") + portNumber;
    }
}
