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
 * 用户钱包---收入记录明细
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_user_wallet")
public class UserWallet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 记录用户id
     */
    private Integer userId;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 被收入用户id
     */
    private Integer lowerUserId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 类型：1-收入、2-支出
     */
    private Integer type;

    /**
     * 金额 (分)
     */
    private BigDecimal amountMoney;

    /**
     * 收入时间
     */
    private LocalDateTime incomeTime;

    /**
     * 审核状态：0-待审核、 1-通过、2-未通过
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

    public Integer getLowerUserId() {
        return lowerUserId;
    }

    public void setLowerUserId(Integer lowerUserId) {
        this.lowerUserId = lowerUserId;
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
        return "UserWallet{" +
        ", id=" + id +
        ", userId=" + userId +
        ", merchantId=" + merchantId +
        ", lowerUserId=" + lowerUserId +
        ", orderId=" + orderId +
        ", type=" + type +
        ", amountMoney=" + amountMoney +
        ", incomeTime=" + incomeTime +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
