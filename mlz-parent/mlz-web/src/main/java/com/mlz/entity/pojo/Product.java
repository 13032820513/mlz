package com.mlz.entity.pojo;

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
}
