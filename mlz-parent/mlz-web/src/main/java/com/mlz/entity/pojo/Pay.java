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
}
