package com.jxgm.pojo;

/**
 * @Author: chenheng
 * @Date: 2023/9/4 10:18
 */
public class Students {
    private Integer id;
    private String name;
    private String home;


    private String home;

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
