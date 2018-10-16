package com.taotao.web.modules.user;

import com.taotao.modules.sys.entity.User;
import com.taotao.service.modules.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author myd
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String list() {
        List<User> list = userService.findList();
        list.forEach(item -> {
            System.out.println("==========================" + item.getUsername());
        });
        return "modules/user/userList";
    }
}
