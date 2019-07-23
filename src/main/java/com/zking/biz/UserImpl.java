package com.zking.biz;

import com.zking.mapper.UserMapper;
import com.zking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userImpl")
public class UserImpl implements UserInter{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserByNameAndPass(String username, String userpassword) {
        User user = userMapper.queryUserByNameAndPass(username,userpassword);
        return user;
    }

    @Override
    public List<User> queryAllUser() {
        List<User> userList = userMapper.queryAllUser();
        return userList;
    }
}
