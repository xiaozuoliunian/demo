package com.veuve.mydemo.web;

import com.veuve.mydemo.base.exception.MyException;
import com.veuve.mydemo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017-08-15.
 */
@RestController
@Api(value = "Hello",description = "HelloController API")
public class HelloController {

    @RequestMapping("/hello")
    @ApiOperation(value = "springboot测试demo",notes = "springboot测试demo")
    public String sayHello(){
        return "welcome to springboot word!";
    }

    @RequestMapping("/getUserInfo")
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    public User getUserInfo(){
        User user = new User();
        user.setId("1");
        user.setName("张三");
        user.setAge("160");
        user.setAddress("重庆市北碚区");
        return user;
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/json1")
    public String json1() throws MyException {
        throw new MyException("发生错误1");
    }
}
