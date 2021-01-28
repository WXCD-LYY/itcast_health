package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckGroup;

import java.util.List;
import java.util.Map;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/18/018 15:57
 **/
public interface CheckGroupDao {
    public void add(CheckGroup checkGroup);
    public void setCheckGroupAndCheckItem(Map map);

    public Page<CheckGroup> findByCondition(String queryString);

    public CheckGroup findById(Integer id);

    public List<Integer> findCheckItemIdsByCheckGroupId(Integer id);

    public void edit(CheckGroup checkGroup);

    public void deleteAssoication(Integer id);

    public List<CheckGroup> findAll();
}
