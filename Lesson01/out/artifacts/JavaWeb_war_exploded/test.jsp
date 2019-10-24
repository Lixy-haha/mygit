<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/18
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>流程控制</title>
</head>
<body>
    <%! int day = 3; %>
    <%--&lt;%&ndash;if else语句&ndash;%&gt;
    <%
        if (day == 1 || day ==7){ %>
          <p> Today is weekend</p>
      <%} else { %>
          <p>Today is not weekend</p>
      <%}
    %>--%>

    <%--&lt;%&ndash;switch  case语句&ndash;%&gt;
    <%
        switch (day){
            case 0:
                out.println("It\'s Sunday.");
                break;
            case 1:
                out.println("It\'s Monday.");
                break;
            case 2:
                out.println("It\'s Tuesday.");
                break;
            case 3:
                out.println("It\'s Wednesday.");
                break;
            case 4:
                out.println("It\'s Thursday.");
                break;
            case 5:
                out.println("It\'s Friday.");
                break;
            default:
                out.println("It's Saturday.");
        }
    %>--%>

    <%--for循环--%>
    <%! int fontSize; %>
    <%for (fontSize=1;fontSize<=3;fontSize++){%>
        <font color="green" size="<%= fontSize%>">
              JSP Tutorial
        </font><br/>
    <%}%>

    <%--while循环--%>
    <%while(fontSize <= 6){%>
        <font color="green" size="<%= fontSize%>">
            JSP Tutorial
        </font><br/>
        <%fontSize++;%>
    <%}%>
    <%
        out.println(fontSize);
    %>
</body>
</html>
