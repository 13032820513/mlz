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
 * 下单商品详细
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_order_details")
public class OrderDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 商品单价（元）
     */
    private BigDecimal price;

    /**
     * 商品属性json
     */
    private String productAttribute;

    /**
     * 保修时间（年）
     */
    private Integer guaranteeTime;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public Integer getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(Integer guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
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
        return "OrderDetails{" +
        ", id=" + id +
        ", orderId=" + orderId +
        ", merchantId=" + merchantId +
        ", productId=" + productId +
        ", productName=" + productName +
        ", num=" + num +
        ", price=" + price +
        ", productAttribute=" + productAttribute +
        ", guaranteeTime=" + guaranteeTime +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
