package com.ps.dao.base;

import java.util.List;

/**
 * @Classname BaseDao
 * @Description TODO
 * @Date 2021/7/13 11:17
 * @Created by ps
 */
public interface BaseDao<T> {
    public Integer insert(T var);
    public Integer delete(T var);
    public Integer update(T var);
    public List<T> select(T var);
}
