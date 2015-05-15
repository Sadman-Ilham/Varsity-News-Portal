<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

    Welcome Home!!!

    <form action="test" method="get">
        <input type="textbox" name="username" />
        <input type="submit" />
    </form>

    <%
        String str = "News1";
    %>

    <div class="newsHeadline">
        <a href="/varsityNewsPortal/test?username=<%=str%>"></a>
        <div type="test/css" style="border:1 px black">
            <h1>Header</h1>
            <h1>Sample News</h1>
        </div>
    </div>

</body>
</html>