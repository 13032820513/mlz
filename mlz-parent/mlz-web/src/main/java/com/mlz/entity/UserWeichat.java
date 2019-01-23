package com.mlz.entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserWeichat{" +
        ", id=" + id +
        ", openid=" + openid +
        ", nickname=" + nickname +
        ", sex=" + sex +
        ", province=" + province +
        ", city=" + city +
        ", country=" + country +
        ", headimgurl=" + headimgurl +
        ", unionid=" + unionid +
        ", subscribe=" + subscribe +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
