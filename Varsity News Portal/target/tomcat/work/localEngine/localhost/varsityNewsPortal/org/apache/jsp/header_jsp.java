package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.varsityNewsPortal.dto.varsityDto;
import com.sadman.varsityNewsPortal.dto.userInfoDto;
import java.util.List;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"clearfloat\">\r\n");
      out.write("    <div id=\"branding\" class=\"left\" onclick=\"location.href='#';\" style=\"cursor: pointer;\">\r\n");
      out.write("      <div class=\"blogtitle\"><a href=\"#\"> </a></div>\r\n");
      out.write("      <div class=\"description\"> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("      <form method=\"get\" id=\"searchform\" action=\"#\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <input type=\"text\" value=\"\" name=\"s\" id=\"s\" class=\"searchfield\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <ul id=\"nav\" class=\"clearfloat\">\r\n");
      out.write("    <div style=\"float:left;\">\r\n");
      out.write("      <li><a href=\"#\" class=\"on\">Home</a></li>\r\n");
      out.write("      <li class=\"page_item\"><a href=\"#\">Archives</a></li>\r\n");
      out.write("      <li class=\"page_item\"><a href=\"#\">News</a></li>\r\n");
      out.write("      <li class=\"page_item\"><a href=\"#\">Category</a>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"page_item\"><a href=\"#\">Fest</a></li>\r\n");
      out.write("          <li class=\"page_item\"><a href=\"#\">Contest</a></li>\r\n");
      out.write("          <li class=\"page_item\"><a href=\"#\">Award</a></li>\r\n");
      out.write("          <li class=\"page_item\"><a href=\"#\">Sports</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"float:right;\">\r\n");
      out.write("    ");

    userInfoDto userInfo = (userInfoDto) session.getAttribute("userInfo");
    if(userInfo == null){
    
      out.write("\r\n");
      out.write("      <li class=\"page_item\"><a href=\"signup\">Sign Up</a></li>\r\n");
      out.write("      <li class=\"page_item\"><a href=\"login\">Log In</a></li>\r\n");
      out.write("    ");

    }else{
    
      out.write("\r\n");
      out.write("      <li class=\"page_item\"><a href=\"#\"> ");
      out.print(userInfo.getName());
      out.write(" </a></li>\r\n");
      out.write("      <li class=\"page_item\"><a href=\"/varsityNewsPortal/logout\">Logout</a></li>\r\n");
      out.write("    ");

    }
    
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </ul>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("    #varsityNav, #catnav {\r\n");
      out.write("      background: #eee;\r\n");
      out.write("      width: 99.8%;\r\n");
      out.write("      height: 25px;\r\n");
      out.write("      position: relative;\r\n");
      out.write("    }\r\n");
      out.write("    #varsityNav .jcarousel-clip {\r\n");
      out.write("      margin-left: 18px;\r\n");
      out.write("      margin-right: 152px;\r\n");
      out.write("    }\r\n");
      out.write("    #varsityNav .jcarousel-clip, #varsityNav ul, #varsityNav ul li{\r\n");
      out.write("      width: 96%;\r\n");
      out.write("      height:25px;\r\n");
      out.write("      position: relative;\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("    }\r\n");
      out.write("    #varsityNav ul li{\r\n");
      out.write("      border-right: 1px solid black;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      width: 60px;\r\n");
      out.write("      padding: 0 0 0 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #varsityNav .jcarousel-prev, #varsityNav .jcarousel-next  {\r\n");
      out.write("      width: 15px;\r\n");
      out.write("      height: 25px;\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      top: 1px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("    #varsityNav .jcarousel-prev {\r\n");
      out.write("      background: url('images/jcarousel_left.png') no-repeat 0 0;\r\n");
      out.write("      left: 2px;\r\n");
      out.write("    }\r\n");
      out.write("    #varsityNav .jcarousel-next {\r\n");
      out.write("      background: url('images/jcarousel_right.png') no-repeat 0 0;\r\n");
      out.write("      right: 2px;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"varsityNav\" style=\"margin: 0 auto;\">\r\n");
      out.write("      <ul id=\"catnav\" class=\"clearfloat\">\r\n");
      out.write("      ");

      List<varsityDto> varsityList = (List<varsityDto>) request.getAttribute("varsityList");
      for(varsityDto varsity : varsityList){
      
      out.write("\r\n");
      out.write("        <li class=\"cat-item\"><a href=\"/varsityNewsPortal/news?type=");
      out.print(varsity.getAbbreviation());
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(varsity.getAbbreviation());
      out.write(" </a> </li>\r\n");
      out.write("      ");

      }
      
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
