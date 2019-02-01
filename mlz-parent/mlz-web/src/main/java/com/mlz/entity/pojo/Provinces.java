package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 区县行政编码字典表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_provinces")
public class Provinces implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 城市缩写名称
     */
    private String shortName;

    /**
     * 城市层级
     */
    private Boolean depth;

    /**
     * 城市代码
     */
    private String cityCode;

    /**
     * 城市邮编
     */
    private String zipCode;

    /**
     * 城市组合名称
     */
    private String mergerName;

    /**
     * 精度
     */
    private String longitude;

    /**
     * 维度
     */
    private String latitude;

    /**
     * 城市拼音
     */
    private String pinyin;

    /**
     * 是否删除
     */
    private Boolean deleted;
}
