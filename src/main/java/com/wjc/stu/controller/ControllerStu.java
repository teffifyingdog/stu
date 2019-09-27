package com.wjc.stu.controller;

import com.wjc.stu.entity.Stu;
import com.wjc.stu.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class ControllerStu {



    @Autowired
    private IStuService stuService;

    @RequestMapping("/list")
    public String getStuList(ModelMap mm){
        List<Stu> stuList = stuService.list();
        mm.put("stuList",stuList);
        return "StuList";
    }

    @RequestMapping("/del/{id}")
    public String delStuById(@PathVariable("id") Integer id){
        stuService.removeById(id);
        return "forward:/stu/list";
    }
}
