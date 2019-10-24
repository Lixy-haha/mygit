<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/9
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%--
    JSP指令：用来设置与整个JSP页面相关的属性
    三种指令标签：
    <%@ page... %>   定义页面的依赖属性，比如脚本语言、error页面、缓存需求等等
    <%@ include... %>  包含其他文件
    <%@ taglib... %>  引入标签库的定义，可以是自定以标签
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>动态Web测试</title>
    </head>
    <body>
       <%-- <h1 style="color: rebeccapurple">测试</h1>
        <%
            out.println("hello  world!");
        %>--%>
       <%--JSP声明--%>
        <%!
            private int initVar=0;
            private int serviceVar=0;
            private int destroyVar=0;
        %>

        <%!
            public void jspInit(){
                initVar++;
                System.out.println("jspInit():JSP被初始化了"+initVar+"次");
            }
            public void jspDestroy(){
                destroyVar++;
                System.out.println("jspDestroy():JSP被销毁了"+destroyVar+"次");
            }
        %>
        <%--JSP脚本程序--%>
        <%
            //代码片段
            serviceVar++;
            System.out.println("_jspService():JSP共响应了"+serviceVar+"次");

            String content1="初始化次数："+initVar;
            String content2="响应客户请求次数："+serviceVar;
            String content3="销毁次数："+destroyVar;

        %>
        <h1>w3cschool教程 JSP 测试实例</h1>
       <%--JSP表达式<%= 表达式%>  不能用分号来结束表达式--%>
        <p><%=content1 %></p>
        <p><%=content2 %></p>
        <p><%=content3 %></p>
        <h2>测试2</h2>
    </body>
</html>
