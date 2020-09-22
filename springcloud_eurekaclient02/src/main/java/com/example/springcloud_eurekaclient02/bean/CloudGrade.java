package com.example.springcloud_eurekaclient02.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王飞
 * @since 2020-09-21
 */
public class CloudGrade extends Model<CloudGrade> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "grade_id", type = IdType.AUTO)
    private Integer gradeId;

    private Integer userId;

    private Float shuxue;

    private Float yuwen;

    private Float yingyu;


    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getShuxue() {
        return shuxue;
    }

    public void setShuxue(Float shuxue) {
        this.shuxue = shuxue;
    }

    public Float getYuwen() {
        return yuwen;
    }

    public void setYuwen(Float yuwen) {
        this.yuwen = yuwen;
    }

    public Float getYingyu() {
        return yingyu;
    }

    public void setYingyu(Float yingyu) {
        this.yingyu = yingyu;
    }

    @Override
    protected Serializable pkVal() {
        return this.gradeId;
    }

    @Override
    public String toString() {
        return "CloudGrade{" +
        "gradeId=" + gradeId +
        ", userId=" + userId +
        ", shuxue=" + shuxue +
        ", yuwen=" + yuwen +
        ", yingyu=" + yingyu +
        "}";
    }
}
