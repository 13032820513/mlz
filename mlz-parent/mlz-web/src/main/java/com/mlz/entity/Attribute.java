package com.mlz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品属性表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_attribute")
public class Attribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级ID
     */
    private Integer pid;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 商品分类
     */
    private Integer productTypeId;

    /**
     * 属性名称
     */
    private String name;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Attribute{" +
        ", id=" + id +
        ", pid=" + pid +
        ", merchantId=" + merchantId +
        ", productTypeId=" + productTypeId +
        ", name=" + name +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
