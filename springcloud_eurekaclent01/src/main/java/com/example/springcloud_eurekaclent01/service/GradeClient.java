package com.example.springcloud_eurekaclent01.service;

import com.example.springcloud_eurekaclent01.bean.ReturnMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 王飞
 * @Date: 2020/09/21/15:52
 * @Description:
 */
@Component
@FeignClient(value = "service-client-02")
public interface GradeClient {

    @PostMapping("/cloudGrade/insertgrade")
    ReturnMessage getgrade(Map<String,Object> map);

}
