package net.zhaoqing.ssm.service.imp;


import java.util.List;

import net.zhaoqing.ssm.dao.StudentDAO;
import net.zhaoqing.ssm.pojo.Student;
import net.zhaoqing.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> findAll() {
        // TODO Auto-generated method stub
        return studentDAO.findAll();
    }

}

