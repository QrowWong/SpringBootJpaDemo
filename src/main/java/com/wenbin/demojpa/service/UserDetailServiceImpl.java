package com.wenbin.demojpa.service;

import com.wenbin.demojpa.dao.UserDetailRepository;
import com.wenbin.demojpa.entity.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//业务层实现
@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailService {
    //@Autowired自动为属性赋值 得到实例
    @Autowired
    UserDetailRepository userDetailRespository;

    @Override
    public UserDetail addUserDetail(UserDetail userDetail) {
        return userDetailRespository.save(userDetail);
    }

    @Override
    public List<UserDetail> getAllUserDetail() {
        return userDetailRespository.findAll();
    }

    @Override
    public void deletUserDetail(String id) {
        userDetailRespository.deleteById(id);
    }

    @Override
    public UserDetail updateUserDetail(UserDetail userDetail) {
        return userDetailRespository.saveAndFlush(userDetail);
    }


    //向表中新增一个用户，并返回带有id值的用户对象。
//    @Override
//    public UserDetail addUser(UserDetail userDetail) {
//        return userDetailRespository.save(userDetail);
//    }


}