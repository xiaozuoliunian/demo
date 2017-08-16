package com.veuve.mydemo.service;

import com.veuve.mydemo.domain.User;

import java.util.HashMap;

/**
 * Created by chen on 2017-08-16.
 */
public interface UserService {

    User getUser(String UserCode);

    HashMap<String, Object> queryUser();
}
