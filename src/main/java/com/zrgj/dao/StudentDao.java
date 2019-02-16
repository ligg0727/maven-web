package com.zrgj.dao;

import com.zrgj.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/2/2 0002.
 */
public interface StudentDao {
    //查询所有
    List<Student> selectAll();
}
