package com.jxgm.mapper;

import com.jxgm.pojo.Students;

/**
 * @Author: chenheng
 * @Date: 2023/9/4 10:26
 */
public interface StudentMapper {
    Students queryById(Integer id);
}
