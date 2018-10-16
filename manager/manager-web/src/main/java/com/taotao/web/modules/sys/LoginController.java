package com.taotao.web.modules.sys;

import com.taotao.web.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录Controller
 *
 * @author myd
 */
@Controller
public class LoginController extends BaseController {

    /**
     * 管理登录
     */
    @RequestMapping(value = "login")
    public String login() {
        return "modules/sys/sysLogin";
    }

    /**
     * 登录失败，真正登录的POST请求由Filter完成
     */
    @GetMapping(value = "syslogin")
    public String loginFail() {
        return "modules/sys/sysIndex";
    }

}
