package com.test.controller;

import com.test.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/***
 * javaBean在MVC设计模型中是model，又称模型层，在一般的程序中，我们称它为数据层，就是用来设置数据的属性和一些行为，
 * 然后我会提供获取属性和设置属性的get/set方法
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public SqlSessionTemplate template = null;

    @Override
    public String getUser(int id) {
        return template.selectOne("getUserInfo",id).toString();
    }

    @Override
    public List<User> getUserList(int start) {
        return template.selectList("getUserList",start);
    }

    @Override
    public int addUser(User user) {
        return template.insert("addUser",user);
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return template.update("updateUser",user);
    }
}
