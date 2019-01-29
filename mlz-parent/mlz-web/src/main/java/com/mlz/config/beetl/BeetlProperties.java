package com.mlz.config.beetl;

import com.mlz.util.ToolUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

 /**
 * @Description:  beetl配置(如果需要配置别的配置可参照这个形式自己添加)  可以通过application.yml文件进行相关的属性的配置
 * @Author: Mr.Zhu
 * @Date: 2019/1/25
 */
@Data
@ConfigurationProperties(prefix = BeetlProperties.BEETLCONF_PREFIX)
public class BeetlProperties {
    // Beetl属性安全配置的前缀
    public static final String BEETLCONF_PREFIX = "beetl";
    public static final String TEMPLATES_PATH = "/templates";
    public static final String STATIC_PATH = "static";
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
    // 模板文件位置
    private String templatesPath = TEMPLATES_PATH;
    // 模板根路径
    @Value("${spring.mvc.view.prefix}")
    private String prefix;
    // 静态资源css js img位置
    private String staticPath = STATIC_PATH;

    
    /**
    * @Description: 验证参数是否为空，并且返回配置的参数, 如果没用在 yml文件中配置对应的属性值，将直接使用beetl-default.properties中的配置
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
