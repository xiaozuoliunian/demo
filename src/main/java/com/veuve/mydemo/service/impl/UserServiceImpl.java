package com.veuve.mydemo.service.impl;

import java.util.HashMap;
import java.util.List;

import com.veuve.mydemo.dao.IUserDao;
import com.veuve.mydemo.domain.User;
import com.veuve.mydemo.service.UserService;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao userDao;

    public User getUser(String userCode) {
        User user = userDao.selectByPrimaryKey(userCode);
        return user;
    }

    public HashMap<String, Object> queryUser() {
        //分页处理，显示第一页的10条数据
        PageHelper.startPage(1, 10);
        List<User> list = userDao.queryUser(null);//查询
        // 取分页信息
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        long total = pageInfo.getTotal(); //获取总记录数

        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("total", total);
        return map;
    }

}
