package com.taotao.service.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author myd
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Override
    public List<String> findOne() {
        List<String> list = new ArrayList<>();
        list.add("ssss");
        list.add("bbbb");
        return list;
    }
}
