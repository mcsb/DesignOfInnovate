package com.marcello.dao;

import com.marcello.entity.Std;


import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author mcsb
 * CreateDate 2018/3/29$ 20:01$
 **/
public interface UserDao {
    /**
     * 获取用户列表
     */
    Std queryStdWithMap(Map<String, Object> map);
}

/**
 * 增加用户
 */
