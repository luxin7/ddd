package com.spring.ddd.controller;

import com.spring.ddd.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by luxin on 2016/7/13.
 */
@RestController
public class IndexController {
    @Autowired
    private CreateDeptDao createDeptDao;

    @Autowired
    private TimeDao timeDao;

    @RequestMapping("/123")
    public java.lang.String indexShow(){
        return  "么么哒";
    }

    @RequestMapping("/create")
    public Object create(){
        CreateDept createDept=new CreateDept();
        createDept.setDname("电信部");
        return createDeptDao.save(createDept);
    }

    @RequestMapping("/c")
    public Object createTime(){
        DTime DTime =new DTime();
        DTime.setName("电信部");
        return timeDao.save(DTime);
    }


    @RequestMapping("/dname")
    public Object findDname(String dname){
        return createDeptDao.findByDname(dname);
    }

    @RequestMapping("/idname")
    public Object findDeptnoAndDname(long no,String name){
        return createDeptDao.findByDeptnoAndDname(no,name);
    }

    @RequestMapping("/idorname")
    public Object findDeptnoOrDname(long no,String name){
        return createDeptDao.findByDeptnoOrDname(no,name);
    }

    @RequestMapping("/check")
    public Object check(@RequestParam(name = "id",defaultValue = "-1") String stringId){
        long id = Integer.valueOf(stringId);
        return createDeptDao.findOne(id);
    }

    @RequestMapping("/ck")
    public Object ch(ReturnMessage returnMessage){
        return returnMessage.getMessage();
    }

    @RequestMapping("/time")
    public Object findTid(String tid){
        DTime dTime = new DTime();
        dTime.setTime(System.currentTimeMillis());
        return timeDao.save(dTime);
    }
}