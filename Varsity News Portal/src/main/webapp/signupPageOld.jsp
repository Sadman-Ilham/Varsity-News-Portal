<%@page import="com.sadman.varsityNewsPortal.dto.varsityDto"
  import="com.sadman.varsityNewsPortal.dto.userInfoDto"
  import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-EN">
<head profile="http://gmpg.org/xfn/11">
    <title>Sign Up</title>
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

    <style type="text/css">

        #name2{
            margin: 0 auto;
        }

    </style>
    <div id="page">
        <div id="lead">
            <form method="post" action="signupController">

                <p>&nbsp;</p>
                <p>Email :
                    <input name="email" type="text" size="145"/>
                </p>
                <p>
                    Password :
                    <input name="password" type="password" size="141.5" />
                </p>
                <p>
                    Confirm Password :
                    <input name="confirmPassword" type="password" size="133.9" />
                </p>
                <p>Name :
                    <input name="name" type="text" size="144.8"/>
                </p>
                <p>Varsity :
                    <input name="varsityAbbreviation" type="text" size="144"/>
                </p>
                <p>
                    Gender :
                    male
                    <input type="radio" name="gender"  value="male" />
                    female
                    <input type="radio" name="gender"  value="female" />
                </p>
                <style type="text/css">
                    #date, #month, #year{
                        width : 60px;
                    }
                </style>
                <p>Date of Birth :
                    <select name="date" id="date">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                        <option value="14">14</option>
                        <option value="15">15</option>
                        <option value="16">16</option>
                        <option value="17">17</option>
                        <option value="18">18</option>
                        <option value="19">19</option>
                        <option value="20">20</option>
                        <option value="21">21</option>
                        <option value="22">22</option>
                        <option value="23">23</option>
                        <option value="24">24</option>
                        <option value="25">25</option>
                        <option value="26">26</option>
                        <option value="27">27</option>
                        <option value="28">28</option>
                        <option value="29">29</option>
                        <option value="30">30</option>
                        <option value="31">31</option>
                    </select>
                    <select name="month" id="month">
                        <option value="1">Jan</option>
                        <option value="2">Feb</option>
                        <option value="3">Mar</option>
                        <option value="4">Apr</option>
                        <option value="5">May</option>
                        <option value="6">Jun</option>
                        <option value="7">Jul</option>
                        <option value="8">Aug</option>
                        <option value="9">Sep</option>
                        <option value="10">Oct</option>
                        <option value="11">Nov</option>
                        <option value="12">Dec</option>
                    </select>
                    <select name="year" id="year">
                        <option>2015</option>
                        <option>2014</option>
                        <option>2013</option>
                        <option>2012</option>
                        <option>2011</option>
                        <option>2010</option>
                        <option>2009</option>
                        <option>2008</option>
                        <option>2007</option>
                        <option>2006</option>
                        <option>2005</option>
                        <option>2004</option>
                        <option>2003</option>
                        <option>2002</option>
                        <option>2001</option>
                        <option>2000</option>
                        <option>1999</option>
                        <option>1998</option>
                        <option>1997</option>
                        <option>1996</option>
                        <option>1995</option>
                        <option>1994</option>
                        <option>1993</option>
                        <option>1992</option>
                        <option>1991</option>
                        <option>1990</option>
                        <option>1989</option>
                        <option>1988</option>
                        <option>1987</option>
                        <option>1986</option>
                        <option>1985</option>
                        <option>1984</option>
                        <option>1983</option>
                        <option>1982</option>
                        <option>1981</option>
                        <option>1980</option>
                    </select>
                </p>
                <p>&nbsp;</p>
                <p>
                    <input name="Sign Up" type="submit" class="button" id="Sign Up" value="Sign Up" />
                </p>
                <p>&nbsp;</p>
                <p>&nbsp; </p>
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
