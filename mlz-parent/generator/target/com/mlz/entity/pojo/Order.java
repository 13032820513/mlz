package com.mlz.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer merchantId;

    private String on;

    private Byte payType;

    private BigDecimal discountMoney;

    private BigDecimal amountMoney;

    private Date incomeTime;

    private Integer userAddressId;

    private Byte status;

    private String remarks;

    private Byte isWechatCode;

    private Byte isCreateQrcode;

    private Date createtime;

    private Date updatetime;

    private Boolean deleted;

    private static final long serialVersionUID = 1L;

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
        this.on = on == null ? null : on.trim();
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
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

    public Date getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Byte getIsWechatCode() {
        return isWechatCode;
    }

    public void setIsWechatCode(Byte isWechatCode) {
        this.isWechatCode = isWechatCode;
    }

    public Byte getIsCreateQrcode() {
        return isCreateQrcode;
    }

    public void setIsCreateQrcode(Byte isCreateQrcode) {
        this.isCreateQrcode = isCreateQrcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", on=").append(on);
        sb.append(", payType=").append(payType);
        sb.append(", discountMoney=").append(discountMoney);
        sb.append(", amountMoney=").append(amountMoney);
        sb.append(", incomeTime=").append(incomeTime);
        sb.append(", userAddressId=").append(userAddressId);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", isWechatCode=").append(isWechatCode);
        sb.append(", isCreateQrcode=").append(isCreateQrcode);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMerchantId() == null ? other.getMerchantId() == null : this.getMerchantId().equals(other.getMerchantId()))
            && (this.getOn() == null ? other.getOn() == null : this.getOn().equals(other.getOn()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getDiscountMoney() == null ? other.getDiscountMoney() == null : this.getDiscountMoney().equals(other.getDiscountMoney()))
            && (this.getAmountMoney() == null ? other.getAmountMoney() == null : this.getAmountMoney().equals(other.getAmountMoney()))
            && (this.getIncomeTime() == null ? other.getIncomeTime() == null : this.getIncomeTime().equals(other.getIncomeTime()))
            && (this.getUserAddressId() == null ? other.getUserAddressId() == null : this.getUserAddressId().equals(other.getUserAddressId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getIsWechatCode() == null ? other.getIsWechatCode() == null : this.getIsWechatCode().equals(other.getIsWechatCode()))
            && (this.getIsCreateQrcode() == null ? other.getIsCreateQrcode() == null : this.getIsCreateQrcode().equals(other.getIsCreateQrcode()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
        result = prime * result + ((getOn() == null) ? 0 : getOn().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getDiscountMoney() == null) ? 0 : getDiscountMoney().hashCode());
        result = prime * result + ((getAmountMoney() == null) ? 0 : getAmountMoney().hashCode());
        result = prime * result + ((getIncomeTime() == null) ? 0 : getIncomeTime().hashCode());
        result = prime * result + ((getUserAddressId() == null) ? 0 : getUserAddressId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getIsWechatCode() == null) ? 0 : getIsWechatCode().hashCode());
        result = prime * result + ((getIsCreateQrcode() == null) ? 0 : getIsCreateQrcode().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}