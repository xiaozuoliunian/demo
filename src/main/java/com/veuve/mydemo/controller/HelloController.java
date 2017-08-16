package com.veuve.mydemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.veuve.mydemo.base.exception.MyException;
import com.veuve.mydemo.domain.User;
import com.veuve.mydemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen on 2017-08-15.
 */
@RestController
@Api(value = "Hello",description = "HelloController API")
public class HelloController {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UserService UserService;


    @RequestMapping("/hello")
    @ApiOperation(value = "springboot测试demo",notes = "springboot测试demo")
    public String sayHello(){
        return "welcome to springboot word!";
    }

    @RequestMapping("/getUserInfo")
    @ApiOperation(value = "获取用户信息",notes = "获取用户信息")
    public Map getUserInfo(){
        logger.info("---------------------------------获取用户信息-----------------------");
        HashMap<String, Object> map = UserService.queryUser();
        return map;
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
