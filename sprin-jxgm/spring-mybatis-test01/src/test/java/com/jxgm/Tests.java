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
import java.util.List;

/**
 * @Author: chenheng
 * @Date: 2023/9/4 10:38
 */
public class Tests {
    @Test
    public void test01(){
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Students> students = mapper.queryByNameAndHome("chen", "sdf");
        System.out.println(students);
        sqlSession.commit();
        sqlSession.close();
    }
}
