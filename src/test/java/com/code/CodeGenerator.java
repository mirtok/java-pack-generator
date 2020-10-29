package com.code;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 */
public class CodeGenerator {
    public static void main(String[] args) {

        // 创建构建一个代码自动生成对象
        AutoGenerator mpg = new AutoGenerator();

        // 创建全局配置
        GlobalConfig gc = new GlobalConfig();
        // 获取用户目录
        String projectPath = System.getProperty("user.dir");
        // 设置生成目录
        gc.setOutputDir(projectPath + "/src/main/java");
        // 作者
        gc.setAuthor("LiXiang");
        // 是否打开资源管理器
        gc.setOpen(false);
        // 是否覆盖原来生成的代码
        gc.setFileOverride(false);
        // 去service I 前缀
        gc.setServiceName("%sService");
        // 初始算法ID
        gc.setIdType(IdType.ID_WORKER);
        // 配置日期类型
        gc.setDateType(DateType.ONLY_DATE);
        // 是否需要swagger2
        gc.setSwagger2(true);
        // 插入代码生成器
        mpg.setGlobalConfig(gc);
        
        // 设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/scrapy?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 配置包
        PackageConfig pc = new PackageConfig();
        // 模块名称
        pc.setModuleName("gen");
        // 包名称
        pc.setParent("com.code");
        // 控制器
        pc.setController("controller");
        // 实体类
        pc.setEntity("entity");
        // mapper
        pc.setMapper("mapper");
        // service
        pc.setService("service");
        mpg.setPackageInfo(pc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 表前缀
        strategy.setTablePrefix("my_");
        // 修改映射的表名
        strategy.setInclude("my_user");
        // 表名生成策略 下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //逻辑删除属性名称
        strategy.setLogicDeleteFieldName("deleted");
        //是否使用Lombok
        strategy.setEntityLombokModel(true);
        // rest 驼峰命名
        strategy.setRestControllerStyle(false);
        // 自动填充配置
        TableFill gmtCreate = new TableFill("create_time", FieldFill.INSERT);
        TableFill gmtUpdate = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        List<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtUpdate);
        strategy.setTableFillList(tableFills);
        // 乐观锁
        strategy.setVersionFieldName("version");
        strategy.setControllerMappingHyphenStyle(true); //localhost:8080/hello_id_2
        mpg.setStrategy(strategy);
        // 执行
        mpg.execute();
    }
}
