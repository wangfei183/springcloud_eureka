package com.example.springcloud_eurekaclent01.service.impl;

import com.example.springcloud_eurekaclent01.bean.CloudUser;
import com.example.springcloud_eurekaclent01.mapper.CloudUserMapper;
import com.example.springcloud_eurekaclent01.service.CloudUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王飞
 * @since 2020-09-21
 */
@Service
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CloudUserServiceImpl extends ServiceImpl<CloudUserMapper, CloudUser> implements CloudUserService {

}
