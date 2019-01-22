package com.mlz.entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getProvinceCityArea() {
        return provinceCityArea;
    }

    public void setProvinceCityArea(String provinceCityArea) {
        this.provinceCityArea = provinceCityArea;
    }

    public String getProvinceCityName() {
        return provinceCityName;
    }

    public void setProvinceCityName(String provinceCityName) {
        this.provinceCityName = provinceCityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getIsInvite() {
        return isInvite;
    }

    public void setIsInvite(Integer isInvite) {
        this.isInvite = isInvite;
    }

    public Integer getIsWebUser() {
        return isWebUser;
    }

    public void setIsWebUser(Integer isWebUser) {
        this.isWebUser = isWebUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "MerchantUser{" +
        ", id=" + id +
        ", merchantId=" + merchantId +
        ", pid=" + pid +
        ", userId=" + userId +
        ", name=" + name +
        ", sex=" + sex +
        ", provinceCityArea=" + provinceCityArea +
        ", provinceCityName=" + provinceCityName +
        ", address=" + address +
        ", balance=" + balance +
        ", isInvite=" + isInvite +
        ", isWebUser=" + isWebUser +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
