package com.mlz.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;

public class Generator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("ZhuJun");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        gc.setEnableCache(false); // XML二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList


        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sAction");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/jiaju_shop?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        // dsc.setSchemaName("public");
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.mlz");
        pc.setMapper("mapper");
        pc.setXml("xml");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setXml("xml");

        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        //String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 Beetl
//        String templatePath = "/templates/mapper.xml.btl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

             // 自定义输出配置
        /*List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);*/

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        // templateConfig.setEntity();
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 表名前缀 jia_
        strategy.setTablePrefix(new String[] { "jia_" });
        // 表名生成策略  （下划线转驼峰命名）
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 表字段生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);

        /*
        * , "config", "attribute", "file", "label", "login_log",
        "menu", "merchant", "merchant_type", "merchant_user", "merchant_wallet", "operation_log",
        "order", "order_details", "pay", "product", "product_attribute", "product_price","product_type",
        "provinces", "relation", "role", "system", "user", " user_address", "user_wallet", "user_weichat"
        * */
        strategy.setInclude(new String[] { "jia_admin", "jia_config", "jia_attribute", "jia_file", "jia_label",
                "jia_login_log", "jia_menu", "jia_merchant", "jia_merchant_type", "jia_merchant_user",
                "jia_merchant_wallet", "jia_operation_log", "jia_order", "jia_order_details", "jia_pay",
                "jia_product", "jia_product_attribute", "jia_product_price", "jia_product_type", "jia_provinces",
                "jia_relation", "jia_role", "jia_system", "jia_user", "jia_user_address", "jia_user_wallet", "jia_user_weichat"});
        mpg.setStrategy(strategy);
        // 设置模板引擎
        mpg.setTemplateEngine(new BeetlTemplateEngine());
        mpg.execute();
    }
}
