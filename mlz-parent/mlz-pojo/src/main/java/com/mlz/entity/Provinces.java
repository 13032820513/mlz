package com.mlz.entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Boolean getDepth() {
        return depth;
    }

    public void setDepth(Boolean depth) {
        this.depth = depth;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Provinces{" +
        ", id=" + id +
        ", cityName=" + cityName +
        ", parentId=" + parentId +
        ", shortName=" + shortName +
        ", depth=" + depth +
        ", cityCode=" + cityCode +
        ", zipCode=" + zipCode +
        ", mergerName=" + mergerName +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", pinyin=" + pinyin +
        ", deleted=" + deleted +
        "}";
    }
}
