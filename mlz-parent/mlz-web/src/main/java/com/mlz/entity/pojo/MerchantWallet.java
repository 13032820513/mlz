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
 * 商户钱包收入记录明细
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_merchant_wallet")
public class MerchantWallet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商户ID
     */
    private Integer merchantId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 类型：1-收入、2-支出
     */
    private Integer type;

    /**
     * 金额
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
}
