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
}
