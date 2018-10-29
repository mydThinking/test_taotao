package com.taotao.web.modules.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.modules.sys.entity.User;
import com.taotao.service.modules.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author myd
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    /**
     * actives 并发数量
     * 如果客户端请求该方法并发超过100则客户端会被阻塞，等客户端并发请求数量少于100的时候，该请求才会被发送到服务提供方服务器，
     * 在dubbo中客户端并发控制是使用ActiveLimitFilter过滤器来控制的
     *
     */
    @Reference(check = true,actives = 100, timeout = 3000, version = "1.0.0",loadbalance = "random")
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
