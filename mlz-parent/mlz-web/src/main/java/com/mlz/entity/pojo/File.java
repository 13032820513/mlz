package com.mlz.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文件表
 * </p>
 *
 * @author ZhuJun
 * @since 2019-01-22
 */
@Data
@TableName("jia_file")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件存放路径
     */
    private String filePath;

    /**
     * 文件 mime，如：image/jpeg、text/csv
     */
    private String fileMime;

    /**
     * 文件大小（字节数）
     */
    private Integer fileSize;

    /**
     * 关联ID
     */
    private Integer usageId;

    /**
     * 关联类型：101 - 活动轮播图 102 - 活动内容
     */
    private Integer usageType;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    private LocalDateTime updatetime;

    private Boolean deleted;
}
