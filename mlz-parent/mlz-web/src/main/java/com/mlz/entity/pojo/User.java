package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 微信关联ID
     */
    private Integer weichatId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 性别：0-未知，1-男，2-女
     */
    private Integer sex;

    /**
     * 电话
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否是前端注册用户: 0-否、1-是
     */
    private Integer isWebUser;

    /**
     * 用户余额
     */
    private Double balance;

    /**
     * 省、市、区（县）：以,号分割
     */
    private String provinceCityArea;

    /**
     * 省、市、区（县）名称，已空格分割
     */
    private String provinceCityName;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户是否可以生成邀请二维码: 0.否、1.是
     */
    private Integer isInvite;

    /**
     * 状态: 0.停用、1.正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    /**
     * 删除：1-删除、0-未删除
     */
    private Boolean deleted;
}
