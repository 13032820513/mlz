package com.mlz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 操作日志
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_operation_log")
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作用户id
     */
    private Integer userId;

    /**
     * 日志类型:1-增加、2-修改、3-删除
     */
    private String logType;

    /**
     * 日志名称
     */
    private String logName;

    /**
     * 类名称
     */
    private String className;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 修改前的数据
     */
    private String updataFront;

    /**
     * 修改后的数据
     */
    private String updataAfter;

    /**
     * 备注
     */
    private String message;

    /**
     * 是否成功：0-否、1-是
     */
    private String succeed;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUpdataFront() {
        return updataFront;
    }

    public void setUpdataFront(String updataFront) {
        this.updataFront = updataFront;
    }

    public String getUpdataAfter() {
        return updataAfter;
    }

    public void setUpdataAfter(String updataAfter) {
        this.updataAfter = updataAfter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSucceed() {
        return succeed;
    }

    public void setSucceed(String succeed) {
        this.succeed = succeed;
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
        return "OperationLog{" +
        ", id=" + id +
        ", userId=" + userId +
        ", logType=" + logType +
        ", logName=" + logName +
        ", className=" + className +
        ", method=" + method +
        ", updataFront=" + updataFront +
        ", updataAfter=" + updataAfter +
        ", message=" + message +
        ", succeed=" + succeed +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", deleted=" + deleted +
        "}";
    }
}
