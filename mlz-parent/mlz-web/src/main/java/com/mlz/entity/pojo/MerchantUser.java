package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商户与用户关联表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_merchant_user")
public class MerchantUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 邀请人ID
     */
    private Integer pid;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 性别：0-未知，1-男，2-女
     */
    private Integer sex;

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
     * 用户余额
     */
    private Double balance;

    /**
     * 用户是否可以生成邀请二维码: 0.否、1.是
     */
    private Integer isInvite;

    /**
     * 是否是前端注册用户: 0-否、1-是
     */
    private Integer isWebUser;

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
     * 是否删除：0-否、1-是
     */
    private Boolean deleted;
}
