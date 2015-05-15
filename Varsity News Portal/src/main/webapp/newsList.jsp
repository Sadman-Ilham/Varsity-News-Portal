<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.sadman.varsityNewsPortal.dto.newsDto"
    import="java.util.List"
    import="java.util.ArrayList"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-EN">
<head profile="http://gmpg.org/xfn/11">
<title>Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="styles/nav.css" type="text/css" media="screen" />
<link rel="stylesheet" href="styles/plugins.css" type="text/css" media="screen" />
<link rel="stylesheet" href="styles/template-style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="styles/print.css" type="text/css" media="print" />
<script type="text/javascript" src="js/dropdowns.js"></script>
<script src="js/jquery-1.6.2.min.js" type="text/javascript" charset="utf-8"></script>
<!--[if IE 6]>
  <script src="js/DD_belatedPNG-min.js" type="text/javascript" charset="utf-8"></script>
<![endif]-->
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/Myriad_Pro_700.font.js" type="text/javascript"></script>
<script src="js/jquery.jcarousel.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/functions.js" type="text/javascript" charset="utf-8"></script>
</head>
<body id="home" style="padding:0 0 10px 0;">
<div id="page" class="clearfloat" style="border-top:none;">

  <%
    List<newsDto> topNews = (List<newsDto>) request.getAttribute("topNews");
    List<newsDto> recentNews = (List<newsDto>) request.getAttribute("recentNews");
    List<newsDto> varsityNews = (List<newsDto>) request.getAttribute("varsityNews");
    List<newsDto> allNews = new ArrayList<newsDto>();
    if(topNews != null) allNews = topNews;
    else if(recentNews != null) allNews = recentNews;
    else if(varsityNews != null) allNews = varsityNews;
    int sz = Integer.valueOf(request.getAttribute("size"));
  %>

  <jsp:include page="header.jsp" />

  <div class="clear"></div>
  <hr />
  <div class="adsense-banner"> <img src="images/adverts/728x90.gif" alt="advert" /> </div>
  <hr />
  <div id="homecontent-bottom">

    <%
    int cnt = 0;
    for(newsDto news : allNews){
    if(cnt%3 == 0) {
    %>


    <div id="homeleftcol">
      <div class="clearfloat homeNews">
        <div class="cat-head">
          <h3><a href=""> <%=news.getVarsityAbbreviation()%> | <%=news.getView()%> views </a></h3>
        </div>
        <a href="#"><img src="images/<%=news.getImageLocation()%>.jpg" alt="" width="100" height="100" class="home-cat-img" /></a> <a href="/varsityNewsPortal/article?news="+<%=news.getNewsID()%> class="title"> <%=news.getTitle()%> </a><br />
        <%=news.getDetails()%>
      </div>
    </div>

    <%
    }

    else if(cnt%3 == 1){
    %>

    <!--END LEFTCOL-->
    <div id="homemidcol">
      <div class="clearfloat homeNews">
        <div class="cat-head">
          <h3><a href=""> <%=news.getVarsityAbbreviation()%> | <%=news.getView()%> views </a></h3>
        </div>
        <a href="#"><img src="images/<%=news.getImageLocation()%>.jpg" alt="" width="100" height="100" class="home-cat-img" /></a> <a href="/varsityNewsPortal/article?news="+<%=news.getNewsID()%> class="title"> <%=news.getTitle()%> </a><br />
        <%=news.getDetails()%>
      </div>
    </div>

    <%
    }
    else{
    %>

    <!--END MIDCOL-->
    <div id="homerightcol">
      <div class="clearfloat homeNews">
        <div class="cat-head">
          <h3><a href=""> <%=news.getVarsityAbbreviation()%> | <%=news.getView()%> views </a></h3>
        </div>
        <a href="#"><img src="images/<%=news.getImageLocation()%>.jpg" alt="" width="100" height="100" class="home-cat-img" /></a> <a href="/varsityNewsPortal/article?news="+<%=news.getNewsID()%> class="title"> <%=news.getTitle()%> </a><br />
        <%=news.getDetails()%>
      </div>
    </div>

    <%
    }

    cnt++;

    }
    %>

    <!--END RIGHTCOL-->
    <!--END CONTENT-->
  </div>
</div>

<jsp:include page="footer.html" />

</body>
</html>
