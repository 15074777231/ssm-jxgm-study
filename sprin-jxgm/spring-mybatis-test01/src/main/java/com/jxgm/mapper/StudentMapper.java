package com.jxgm.mapper;

import com.jxgm.pojo.Students;

import java.util.List;

/**
 * @Author: chenheng
 * @Date: 2023/9/4 10:26
 */
public interface StudentMapper {
    Students queryById(Integer id);

    //根据id删除员工信息
    int deleteById(Integer id);

    //根据名字查询学生信息
    List<Students> queryByName(String name);

    //插入学生数据

    int insertStudent(Students students);
}
