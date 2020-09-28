package net.zhaoqing.ssm.controller;

import java.util.List;

import net.zhaoqing.ssm.pojo.Student;
import net.zhaoqing.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {

    @Autowired
    private IStudentService studentService;

    /**
     * 查找所有学生
     * @return
     */
    @RequestMapping(value="/findAll")
    public ModelAndView test(){
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", list);
        return modelAndView;
    }

}

