<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/24
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Hello World</title>
  </head>
  <body>
    <h1>Hello World From Struts2</h1>
    <form action="hello">
      <label for="name">Please enter your name</label><br/>
      <input type="text" name="name" />
      <input type="submit" value="Say Hello" />
    </form>
  </body>
</html>
