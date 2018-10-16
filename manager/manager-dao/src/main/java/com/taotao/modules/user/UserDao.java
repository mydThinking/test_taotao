package com.taotao.modules.user;

import com.taotao.common.persistence.annotation.MyBatisDao;
import com.taotao.modules.sys.entity.User;

import java.util.List;

/**
 * @author myd
 */
@MyBatisDao
public interface UserDao {

    List<User> findList();

}
