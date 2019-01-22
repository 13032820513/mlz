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
 * 第三方支付记录及回调表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_pay")
public class Pay implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 支付单号
     */
    private String payNo;

    /**
     * 会员ID
     */
    private Integer userId;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 支付人：101-用户、102-商户
     */
    private Integer type;

    /**
     * 支付金额(分)
     */
    private BigDecimal totalAmount;

    /**
     * 税
     */
    private BigDecimal totalFax;

    /**
     * 支付方式 1-微信 2-支付宝 3-银行卡
     */
    private Boolean payType;

    /**
     * 支付时间
     */
    private LocalDateTime payTime;

    /**
     * 商户帐号
     */
    private String payAccount;

    /**
     * 第3方支付单号
     */
    private String tradeNo;

    /**
     * 支付者账号信息 微信openid/支付宝seller_id
     */
    private String tradeAccount;

    /**
     * 支付状态 0-待支付 1-已支付 2-过期
     */
    private Boolean status;

    /**
     * 下单时返回数据串
     */
    private String orderResponse;

    /**
     * 支付回调数据串
     */
    private String orderCallback;

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

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalFax() {
        return totalFax;
    }

    public void setTotalFax(BigDecimal totalFax) {
        this.totalFax = totalFax;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeAccount() {
        return tradeAccount;
    }

    public void setTradeAccount(String tradeAccount) {
        this.tradeAccount = tradeAccount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getOrderResponse() {
        return orderResponse;
    }

    public void setOrderResponse(String orderResponse) {
        this.orderResponse = orderResponse;
    }

    public String getOrderCallback() {
        return orderCallback;
    }

    public void setOrderCallback(String orderCallback) {
        this.orderCallback = orderCallback;
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
        return "Pay{" +
        ", id=" + id +
        ", payNo=" + payNo +
        ", userId=" + userId +
        ", merchantId=" + merchantId +
        ", orderId=" + orderId +
        ", type=" + type +
        ", totalAmount=" + totalAmount +
        ", totalFax=" + totalFax +
        ", payType=" + payType +
        ", payTime=" + payTime +
        ", payAccount=" + payAccount +
        ", tradeNo=" + tradeNo +
        ", tradeAccount=" + tradeAccount +
        ", status=" + status +
        ", orderResponse=" + orderResponse +
        ", orderCallback=" + orderCallback +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
