package net.zhaoqing.ssm.dao;

import net.zhaoqing.ssm.pojo.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> findAll();
}
