package com.mlz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 登录记录
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_login_log")
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员id
     */
    private Integer userId;

    /**
     * 日志名称
     */
    private String logName;

    /**
     * 是否执行成功：0-否、1-是
     */
    private String succeed;

    /**
     * 具体消息
     */
    private String message;

    /**
     * 登录ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getSucceed() {
        return succeed;
    }

    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    @Override
    public String toString() {
        return "LoginLog{" +
        ", id=" + id +
        ", userId=" + userId +
        ", logName=" + logName +
        ", succeed=" + succeed +
        ", message=" + message +
        ", ip=" + ip +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}
