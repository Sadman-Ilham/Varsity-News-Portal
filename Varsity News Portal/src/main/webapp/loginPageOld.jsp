<%@page import="com.sadman.varsityNewsPortal.dto.varsityDto"
  import="com.sadman.varsityNewsPortal.dto.userInfoDto"
  import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-EN">
<head profile="http://gmpg.org/xfn/11">
    <title>Log In</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="styles/style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="styles/nav.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="styles/plugins.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="styles/template-style.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="styles/print.css" type="text/css" media="print" />
    <script type="text/javascript" src="js/dropdowns.js"></script>
</head>
<body id="home">

<div id="page" class="clearfloat">
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
            <li class="page_item"><a href="archives.html">Archives</a></li>
            <li class="page_item"><a href="featured.html">News</a></li>
            <li class="page_item"><a href="subpages.html">Category</a>
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
</div>
<div class="content">

    <div id="page">
        <div id="lead">
            <form id="form1" name="form1" method="post" action="loginController">

                <p>&nbsp;</p>
                <p>Name :
                    <input name="email" type="text" size="69" />
                </p>
                <p>
                    Password :
                    <label for="pass"></label>
                    <input name="password" type="password" size="64" />
                </p>
                <p>
                    <input name="logIn" type="submit" class="button" value="Log In" />
                </p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p><br />
                </p>
            </form>
        </div>
    </div>
</div>
<div id="footer">
    <div> &#169; 2008 Varsity News Portal by <a href="bd.linkedin.com/in/sadmanilham">group</a></div>
</div>
</body>
</html>
