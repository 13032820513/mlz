package com.mlz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 下单表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 订单编号
     */
    private String on;

    /**
     * 付款方式：1-现金
     */
    private Integer payType;

    /**
     * 优惠金额（元）
     */
    private BigDecimal discountMoney;

    /**
     * 合计金额（元）
     */
    private BigDecimal amountMoney;

    /**
     * 收入时间
     */
    private LocalDateTime incomeTime;

    /**
     * 用户收货ID
     */
    private Integer userAddressId;

    /**
     * 状态: 0.待支付、1.已支付、2.支付失败
     */
    private Integer status;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否已经生成二维码：0-否、1-是
     */
    private Integer isWechatCode;

    /**
     * 是否可以生成分享二维码：0-否、1-是
     */
    private Integer isCreateQrcode;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public BigDecimal getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(BigDecimal amountMoney) {
        this.amountMoney = amountMoney;
    }

    public LocalDateTime getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(LocalDateTime incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsWechatCode() {
        return isWechatCode;
    }

    public void setIsWechatCode(Integer isWechatCode) {
        this.isWechatCode = isWechatCode;
    }

    public Integer getIsCreateQrcode() {
        return isCreateQrcode;
    }

    public void setIsCreateQrcode(Integer isCreateQrcode) {
        this.isCreateQrcode = isCreateQrcode;
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
        return "Order{" +
        ", id=" + id +
        ", userId=" + userId +
        ", merchantId=" + merchantId +
        ", on=" + on +
        ", payType=" + payType +
        ", discountMoney=" + discountMoney +
        ", amountMoney=" + amountMoney +
        ", incomeTime=" + incomeTime +
        ", userAddressId=" + userAddressId +
        ", status=" + status +
        ", remarks=" + remarks +
        ", isWechatCode=" + isWechatCode +
        ", isCreateQrcode=" + isCreateQrcode +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
