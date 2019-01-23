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
 * 商品表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 商品类型ID
     */
    private Integer productTypeId;

    /**
     * 商品编号
     */
    private String productOn;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商品原价（元）
     */
    private BigDecimal originalPrice;

    /**
     * 商品现价（元）
     */
    private BigDecimal price;

    /**
     * 商品属性列表
     */
    private String attrs;

    /**
     * 商品标签列表
     */
    private String labels;

    /**
     * 商品介绍
     */
    private String content;

    /**
     * 视频介绍地址
     */
    private String videoUrl;

    /**
     * 成交量
     */
    private Integer volume;

    /**
     * 保修时间（年）
     */
    private Integer guaranteeTime;

    /**
     * 状态: 0.禁用、1:正常
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

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductOn() {
        return productOn;
    }

    public void setProductOn(String productOn) {
        this.productOn = productOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(Integer guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
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
        return "Product{" +
        ", id=" + id +
        ", merchantId=" + merchantId +
        ", productTypeId=" + productTypeId +
        ", productOn=" + productOn +
        ", name=" + name +
        ", brand=" + brand +
        ", originalPrice=" + originalPrice +
        ", price=" + price +
        ", attrs=" + attrs +
        ", labels=" + labels +
        ", content=" + content +
        ", videoUrl=" + videoUrl +
        ", volume=" + volume +
        ", guaranteeTime=" + guaranteeTime +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
