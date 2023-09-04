package com.jxgm;

import com.jxgm.mapper.StudentMapper;
import com.jxgm.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: chenheng
 * @Date: 2023/9/4 10:38
 */
public class Tests {
    @Test
    public void test01() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Students students = mapper.queryById(1);
        System.out.println(students);
        sqlSession.close();
    }
}
