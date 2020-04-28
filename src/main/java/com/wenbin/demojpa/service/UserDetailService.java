package com.wenbin.demojpa.service;

import com.wenbin.demojpa.entity.UserDetail;

import java.util.List;

public interface UserDetailService {

    // 向表中新增一个用户，并返回带有id值的用户对象。
    //UserDetail addUser(UserDetail userDetail);

    /**
     * 通过用户id获取用户，用户id唯一*
     */
    //UserDetail getUserById(String id);

    //新增用户详情
    UserDetail addUserDetail(UserDetail userDetail);

    //查询用户详情
    List<UserDetail> getAllUserDetail();

    //删除用户详情
    void deletUserDetail(String id);

    //修改用户详情
    UserDetail updateUserDetail(UserDetail userDetail);

}
