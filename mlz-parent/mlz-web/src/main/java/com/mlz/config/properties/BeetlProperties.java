package com.mlz.config.properties;

import com.mlz.util.ToolUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

/**
* @Description:  beetl配置(如果需要配置别的配置可参照这个形式自己添加)
* @Author: Mr.Zhu
* @Date: 2019/1/25
*/
@Data
@ConfigurationProperties(prefix = BeetlProperties.BEETLCONF_PREFIX)
public class BeetlProperties {

    public static final String BEETLCONF_PREFIX = "beetl";
    // 占位符前缀
    private String delimiterStatementStart;
    // 占位符后缀
    private String delimiterStatementEnd;
    // 自定义标签文件位置
    private String resourceTagroot;
    // 自定义标签文件后缀
    private String resourceTagsuffix;
    // 是否检测文件变化
    private String resourceAutoCheck;

    @Value("${spring.mvc.view.prefix}")
    private String prefix; // 模板根路径
    
    /** 
    * @Description: 验证参数是否为空，并且返回配置的参数
    * @Param: [] 
    * @return: java.util.Properties 
    * @Author: Mr.Zhu 
    * @Date: 2019/1/25 
    */ 
    public Properties getProperties() {
        Properties properties = new Properties();
        if (ToolUtil.isNotEmpty(delimiterStatementStart)) {
            if (delimiterStatementStart.startsWith("\\")) {
                delimiterStatementStart = delimiterStatementStart.substring(1);
            }
            properties.setProperty("DELIMITER_STATEMENT_START", delimiterStatementStart);
        }
        if (ToolUtil.isNotEmpty(delimiterStatementEnd)) {
            properties.setProperty("DELIMITER_STATEMENT_END", delimiterStatementEnd);
        } else {
            properties.setProperty("DELIMITER_STATEMENT_END", "null");
        }
        if (ToolUtil.isNotEmpty(resourceTagroot)) {
            properties.setProperty("RESOURCE.tagRoot", resourceTagroot);
        }
        if (ToolUtil.isNotEmpty(resourceTagsuffix)) {
            properties.setProperty("RESOURCE.tagSuffix", resourceTagsuffix);
        }
        if (ToolUtil.isNotEmpty(resourceAutoCheck)) {
            properties.setProperty("RESOURCE.autoCheck", resourceAutoCheck);
        }
        return properties;
    }
}
