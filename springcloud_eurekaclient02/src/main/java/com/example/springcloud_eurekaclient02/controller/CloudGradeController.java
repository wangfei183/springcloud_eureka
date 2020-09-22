package com.example.springcloud_eurekaclient02.controller;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.springcloud_eurekaclient02.bean.CloudGrade;
import com.example.springcloud_eurekaclient02.bean.ReturnMessage;
import com.example.springcloud_eurekaclient02.service.CloudGradeService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王飞
 * @since 2020-09-21
 */
@Controller
@RequestMapping("/cloudGrade")
public class CloudGradeController {
    @Resource
    CloudGradeService cloudGradeService;


    @RequestMapping("/insertgrade")
    @ResponseBody
    @LcnTransaction
    @Transactional
    public ReturnMessage insertGrade(@RequestBody Map<String,Object> map){
        Integer userid=Integer.valueOf(map.get("userid").toString());

        CloudGrade cloudGrade =new CloudGrade();
        cloudGrade.setUserId(userid);
        System.out.println(cloudGrade);
            boolean flag=cloudGradeService.save(cloudGrade);
            if(flag)return  ReturnMessage.success();

        return ReturnMessage.failWithMsg("成绩插入失败");
    }

    @RequestMapping("/updategrade")
    public ReturnMessage updategrade(CloudGrade cloudGrade){
        System.out.println(cloudGrade);
        if(cloudGradeService.updateById(cloudGrade))return  ReturnMessage.success();
        return ReturnMessage.failWithMsg("成绩修改失败");
    }
}

