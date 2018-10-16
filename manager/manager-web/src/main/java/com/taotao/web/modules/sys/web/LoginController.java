package com.taotao.web.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录Controller
 * @author myd
 */
@Controller
public class LoginController {

    /**
     * 管理登录
     */
    @RequestMapping(value = "login")
    public String login(){
        return "modules/sys/sysLogin";
    }

}
