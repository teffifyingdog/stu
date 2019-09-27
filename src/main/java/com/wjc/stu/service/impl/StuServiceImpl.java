package com.wjc.stu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjc.stu.dao.StuMapper;
import com.wjc.stu.entity.Stu;
import com.wjc.stu.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements IStuService {

    @Autowired
    private StuMapper stuMapper;

}
