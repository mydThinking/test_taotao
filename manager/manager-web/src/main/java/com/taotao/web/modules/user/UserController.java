package com.taotao.web.modules.user;

import com.taotao.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author myd
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    UserService userService;


    @RequestMapping(value = "/index")
    public String list() {
        userService.findOne();
        return "modules/user/userList";
    }
}
