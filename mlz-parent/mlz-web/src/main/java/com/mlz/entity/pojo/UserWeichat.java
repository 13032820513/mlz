package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 微信用户表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_user_weichat")
public class UserWeichat implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户OpenID
     */
    private String openid;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 0-未知，1-男，2-女
     */
    private Integer sex;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 用户头像URL
     */
    private String headimgurl;

    /**
     * 用户UnionID
     */
    private String unionid;

    /**
     * 关注状态：0-未关注，1-已关注
     */
    private Integer subscribe;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    /**
     * 删除状态：0-未删除，1-删除
     */
    private Integer deleted;
}
