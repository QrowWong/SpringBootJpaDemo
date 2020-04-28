package com.wenbin.demojpa.controller;

import com.wenbin.demojpa.entity.UserDetail;
import com.wenbin.demojpa.response.ResponseData;
import com.wenbin.demojpa.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController注解相当于@Controller + @ResponseBody 合在一起的作用
@RestController
//@Controller
@RequestMapping("/userDetail")
public class UserDetailController {
    //面向接口编程应该用的是接口调用
    @Autowired
    private UserDetailService userDetailService ;

    // 新增用户
//    @PostMapping("/addUserDetail")
    //@CurrentUser 获取当前登录对象 ,参数注解
//    public ResponseData addUser(@RequestBody UserDetail userDetail, @CurrentUser User user) {
//        String userid = user.getUserid();
//        userDetail.setUserid(userid);
//        return ResponseData.success(userDetailService.addUser(userDetail));
//    }

    //增加用户详情  验证OK
    @PostMapping("/addUserDetail")
    public ResponseData addEducation(
            @RequestBody UserDetail userDetail
    ) {
        return ResponseData.success(userDetailService.addUserDetail(userDetail));
    }
    //删除用户详情
    //这些return回去的对象给前台，前台可以用这些对象取东西
    //顺序是前台通过axios，controller接收处理，返回对象给前台
    @PostMapping("/delete/{id}")
    public void deleteUserDetail(@PathVariable("id") String id) {
        System.out.println(id);
        userDetailService.deletUserDetail(id);
        ResponseData.success();//不返回结果规范不
    }
    //查询所有用户  ok
    @GetMapping("/getUserDetail")
    public ResponseData getUserDetail() {
        return ResponseData.success(userDetailService.getAllUserDetail());
    }
    //修改用户详情
//    @PostMapping("/updateUserDetail")
//    public ResponseData updateEducation(
//            @RequestBody UserDetail userDetail) {
//        return ResponseData.success(userDetailService.updateUserDetail(userDetail));
//    }
    //修改byID            ok
    @PutMapping("/updateEducation/{id}")
    public ResponseData updateUserDetail(@PathVariable("id") String userId, @RequestBody UserDetail userDetail) {
        userDetail.setId(userId);
        return ResponseData.success(userDetailService.updateUserDetail(userDetail));
    }

    //test
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world2";
    }

}