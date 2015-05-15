  <%@page
  import="com.sadman.varsityNewsPortal.dto.varsityDto"
  import="com.sadman.varsityNewsPortal.dto.userInfoDto"
  import="java.util.List"
  %>

  <div class="clearfloat">
    <div id="branding" class="left" onclick="location.href='#';" style="cursor: pointer;">
      <div class="blogtitle"><a href="#"> </a></div>
      <div class="description"> </div>
    </div>
    <div class="right">
      <form method="get" id="searchform" action="#">
        <div>
          <input type="text" value="" name="s" id="s" class="searchfield" />
        </div>
      </form>
    </div>
  </div>
  <ul id="nav" class="clearfloat">
    <div style="float:left;">
      <li><a href="#" class="on">Home</a></li>
      <li class="page_item"><a href="#">Archives</a></li>
      <li class="page_item"><a href="#">News</a></li>
      <li class="page_item"><a href="#">Category</a>
        <ul>
          <li class="page_item"><a href="#">Fest</a></li>
          <li class="page_item"><a href="#">Contest</a></li>
          <li class="page_item"><a href="#">Award</a></li>
          <li class="page_item"><a href="#">Sports</a></li>
        </ul>
      </li>
    </div>
    <div style="float:right;">
    <%
    userInfoDto userInfo = (userInfoDto) session.getAttribute("userInfo");
    if(userInfo == null){
    %>
      <li class="page_item"><a href="signup">Sign Up</a></li>
      <li class="page_item"><a href="login">Log In</a></li>
    <%
    }else{
    %>
      <li class="page_item"><a href="#"> <%=userInfo.getName()%> </a></li>
      <li class="page_item"><a href="/varsityNewsPortal/logout">Logout</a></li>
    <%
    }
    %>
    </div>
  </ul>

  <style type="text/css">
    #varsityNav, #catnav {
      background: #eee;
      width: 99.8%;
      height: 25px;
      position: relative;
    }
    #varsityNav .jcarousel-clip {
      margin-left: 18px;
      margin-right: 152px;
    }
    #varsityNav .jcarousel-clip, #varsityNav ul, #varsityNav ul li{
      width: 96%;
      height:25px;
      position: relative;
      overflow: hidden;
    }
    #varsityNav ul li{
      border-right: 1px solid black;
      text-align: center;
      width: 60px;
      padding: 0 0 0 0;
    }

    #varsityNav .jcarousel-prev, #varsityNav .jcarousel-next  {
      width: 15px;
      height: 25px;
      position: absolute;
      top: 1px;
      cursor: pointer;
    }
    #varsityNav .jcarousel-prev {
      background: url('images/jcarousel_left.png') no-repeat 0 0;
      left: 2px;
    }
    #varsityNav .jcarousel-next {
      background: url('images/jcarousel_right.png') no-repeat 0 0;
      right: 2px;
    }
  </style>

  <div id="varsityNav" style="margin: 0 auto;">
      <ul id="catnav" class="clearfloat">
      <%
      List<varsityDto> varsityList = (List<varsityDto>) request.getAttribute("varsityList");
      for(varsityDto varsity : varsityList){
      %>
        <li class="cat-item"><a href="/varsityNewsPortal/news?type=<%=varsity.getAbbreviation()%>"> <%=varsity.getAbbreviation()%> </a> </li>
      <%
      }
      %>
      </ul>
    </div>