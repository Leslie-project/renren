package com.leslie.renren.tools.generate;

public class GenerateMain {

    private static final int BUFFER_SIZE = 2 * 1024;

    public static void main(String[] args) throws Exception {

        generateEntity();
        System.out.println("完成");

    }

    public static void generateEntity() throws Exception {
        GeneratePojo pojo = new GeneratePojo();
        pojo.setDb_driver("com.mysql.cj.jdbc.Driver"); // 驱动
        pojo.setDb_url("jdbc:mysql://localhost:3306/renren?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC"); // 链接地址
        pojo.setDb_user("root"); // 用户名
        pojo.setDb_pwd("123456"); // 密码
        pojo.setDbName("renren"); //
        pojo.setPackageDao("com.leslie.renren.dao.mybatis");
        pojo.setPackageEntity("com.leslie.renren.entity");
        pojo.setPackageRepository("com.leslie.renren.dao.jpa");
        pojo.setOutputPath("/renren/");
        GenerateUtils tableEntity = new GenerateUtils();
        tableEntity.generateEntity(pojo);
    }
}
