package net.zhaoqing.ssm.service;

import net.zhaoqing.ssm.pojo.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAll();
}