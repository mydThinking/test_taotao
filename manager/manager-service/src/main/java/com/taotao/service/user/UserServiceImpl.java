package com.taotao.service.user;


import org.springframework.stereotype.Service;

/**
 * @author myd
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Override
    public void findOne() {
        System.out.println("qqqqqqqqqqqqqqqqqqq");
    }
}
