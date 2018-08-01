package com.wnf.springcloud.service;

import com.wnf.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by wunaifu on 2018/7/18.
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
