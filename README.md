# ssm
**简单的SSM示例项目使用技术为Spring3.2+SpringMVC3.2+Mybatis3.2**
*司徒凉在2019年1月8日开发组例会讲解*

----------
# 安装步骤:
1. 将项目clone到本地,用eclipse或myeclipse直接打开项目.
2. 如果步骤1完成报错,参考SmartME开发环境的配置,修改项目properties中的```java build path```中JDK为本机安装地址
3. 打开项目根路径下```resources/spring/spring-dao.xml```,将bean名称为datasource中数据库的配置信息补充完整(使用的是开发库).
4. 将项目直接运行在tomcat中,浏览器中访问[http://localhost:8080/ssm/test](http://localhost:8080/ssm/test "测试地址"),将看到```Hello SSM!```,到此项目启动成功.
# 杂项:
- 项目开发环境:JDK1.7,Eclipse(Indigo),Oracle(开发库)
- 如果启动项目时出现```creating bean error```时请确认eclipse(myeclipse)project菜单栏中的Build Automatically是否勾选上!