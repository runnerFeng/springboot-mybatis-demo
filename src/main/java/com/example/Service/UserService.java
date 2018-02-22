package com.example.Service;

import com.example.model.User;

import java.util.List;

/**
 * @author jinx
 * @date 2018/2/22 17:10
 * Desc:
 */
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
