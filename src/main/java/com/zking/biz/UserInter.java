package com.zking.biz;

import com.zking.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInter {

    public User queryUserByNameAndPass(String username,String userpassword);

    public List<User> queryAllUser();

}
