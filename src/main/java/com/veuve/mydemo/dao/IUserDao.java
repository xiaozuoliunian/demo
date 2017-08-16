package com.veuve.mydemo.dao;

import com.veuve.mydemo.domain.User;

import java.util.List;

/**
 * Created by chen on 2017-08-16.
 */
public interface IUserDao {

    User selectByPrimaryKey(String userCode);

    List<User> queryUser(Object o);
}
