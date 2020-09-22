package com.example.springcloud_eurekaclent01.mapper;

import com.example.springcloud_eurekaclent01.bean.CloudUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王飞
 * @since 2020-09-21
 */
@Component
@Mapper
public interface CloudUserMapper extends BaseMapper<CloudUser> {

}
