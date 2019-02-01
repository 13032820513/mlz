package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商户信息表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_merchant")
public class Merchant implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商户类型ID（多个以逗号分割）
     */
    private String merchantTypeIds;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 商户名称
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 座机号
     */
    private String tel;

    /**
     * 密码
     */
    private String password;

    /**
     * 省、市、区（县）：以,号分割
     */
    private String provinceCityArea;

    /**
     * 省、市、区（县）名称，已空格分割
     */
    private String provinceCityName;

    /**
     * 商家地址
     */
    private String address;

    /**
     * 商户logo地址
     */
    private String logoUrl;

    /**
     * 营业执照号
     */
    private String licenseNumber;

    /**
     * 营业执照图片地址
     */
    private String licenseUrl;

    /**
     * 商户佣金比例
     */
    private Double commissionRatio;

    /**
     * 状态: 0.待审核、1.通过、2.失败
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
