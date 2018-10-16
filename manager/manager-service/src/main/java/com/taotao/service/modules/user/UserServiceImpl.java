package com.taotao.service.modules.user;

import com.taotao.modules.sys.entity.User;
import com.taotao.modules.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author myd
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findList() {
        return userDao.findList();
    }
}
