package com.mlz.entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantTypeIds() {
        return merchantTypeIds;
    }

    public void setMerchantTypeIds(String merchantTypeIds) {
        this.merchantTypeIds = merchantTypeIds;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvinceCityArea() {
        return provinceCityArea;
    }

    public void setProvinceCityArea(String provinceCityArea) {
        this.provinceCityArea = provinceCityArea;
    }

    public String getProvinceCityName() {
        return provinceCityName;
    }

    public void setProvinceCityName(String provinceCityName) {
        this.provinceCityName = provinceCityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public Double getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Double commissionRatio) {
        this.commissionRatio = commissionRatio;
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
        return "Merchant{" +
        ", id=" + id +
        ", merchantTypeIds=" + merchantTypeIds +
        ", roleId=" + roleId +
        ", name=" + name +
        ", phone=" + phone +
        ", tel=" + tel +
        ", password=" + password +
        ", provinceCityArea=" + provinceCityArea +
        ", provinceCityName=" + provinceCityName +
        ", address=" + address +
        ", logoUrl=" + logoUrl +
        ", licenseNumber=" + licenseNumber +
        ", licenseUrl=" + licenseUrl +
        ", commissionRatio=" + commissionRatio +
        ", status=" + status +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
