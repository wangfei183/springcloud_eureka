package com.example.springcloud_eurekaclent01.controller;



import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.springcloud_eurekaclent01.bean.CloudUser;
import com.example.springcloud_eurekaclent01.bean.ReturnMessage;
import com.example.springcloud_eurekaclent01.service.CloudUserService;
import com.example.springcloud_eurekaclent01.service.GradeClient;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/cloudUser")
public class CloudUserController {

    @Resource
    private CloudUserService cloudUserService;
    @Resource
    GradeClient gradeClient;

    @RequestMapping("/insertuser")
    @ResponseBody
    @LcnTransaction
    @Transactional
    public ReturnMessage isnertUser(@RequestBody Map<String,Object> map){
        CloudUser cloudUser=new CloudUser();
        cloudUser.setName(map.get("name").toString());
        cloudUser.setAge(Integer.valueOf(map.get("age").toString()));
        cloudUser.setPassword(map.get("password").toString());
        System.out.println(map);
        if (cloudUserService.save(cloudUser)) {
            map.put("userid",cloudUser.getId());
            ReturnMessage returnMessage= gradeClient.getgrade(map);
            System.out.println(returnMessage);
            return returnMessage;
        }
        return ReturnMessage.failWithMsg("失败");
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public ReturnMessage updateUser(CloudUser cloudUser){
        System.out.println(cloudUser);
        if (cloudUserService.updateById(cloudUser))return  ReturnMessage.success();
        return ReturnMessage.failWithMsg("失败");

    }

}

