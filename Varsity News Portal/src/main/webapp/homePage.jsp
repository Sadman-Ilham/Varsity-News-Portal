<%@
page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import="com.sadman.varsityNewsPortal.dto.newsDto"
import="com.sadman.varsityNewsPortal.dto.varsityDto"
import="java.util.List"
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style type="text/css">
	a{
		text-decoration: none;
		color: black;
	}
	ul{
		list-style-type: none;
		float: left;
	}	
</style>

<div style="width: 80%; border: 1px solid red; margin: 0 auto;">

	<%
	List<newsDto> recentNews = (List<newsDto>) request.getAttribute("recentNews");
	List<varsityDto> varsityList = (List<varsityDto>) request.getAttribute("varsityList");
	%>

    <jsp:include page="headerPage.jsp">

	<table style="width: 100%; border: 1px solid blue;">
	    <tr>
	        <th style="position: relative; width: 30%; border: 1px solid blue;">
	        	<div style="position: absolute; top: 0; left: 0; width: 100%;">
	        		<ul>
	        		<%
                    for(varsityDto varsity : varsityList){
                    %>
		        		<li><a href="/varsityNewsPortal/news?type=<%=varsity.getAbbreviation()%>"><%=varsity.getAbbreviation()%></a></li>
		        	<%
		        	}
		        	%>
		        	</ul>
	        	</div>
	        </th>
	        <th style="width: 70%; border: 1px solid blue;">
                <div style="position: relative; width: 100%; height: 150px; border: 1px solid red; overflow: hidden;">
                	<h4><strong><%=news.getVarsityAbbreviation()%> | <%=news.getView()%> views | <%=news.getDate()%></strong></h4>
                	<h4>hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello </h4>                	
                	<a href="#" style="position: absolute; right:10px; bottom: -3px; background: white;">...more</a>
                </div>
                <div style="position: relative; width: 100%; height: 150px; border: 1px solid red; overflow: hidden;">
                	<h4>hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello </h4>                	
                	<a href="#" style="position: absolute; right:10px; bottom: -3px; background: white;">...more</a>
                </div>
                <div style="position: relative; width: 100%; height: 150px; border: 1px solid red; overflow: hidden;">
                	<h4>hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello </h4>                	
                	<a href="#" style="position: absolute; right:10px; bottom: -3px; background: white;">...more</a>
                </div>
	        </th>
	    </tr>
	</table>
</div>

</body>
</html