package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sadman.varsityNewsPortal.dto.newsDto;
import java.util.List;
import java.util.ArrayList;

public final class newsList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\" lang=\"en-EN\">\r\n");
      out.write("<head profile=\"http://gmpg.org/xfn/11\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/style.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/nav.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/plugins.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/template-style.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/print.css\" type=\"text/css\" media=\"print\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/dropdowns.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.6.2.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("  <script src=\"js/DD_belatedPNG-min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/Myriad_Pro_700.font.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.jcarousel.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"js/functions.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"home\" style=\"padding:0 0 10px 0;\">\r\n");
      out.write("<div id=\"page\" class=\"clearfloat\" style=\"border-top:none;\">\r\n");
      out.write("\r\n");
      out.write("  ");

    List<newsDto> topNews = (List<newsDto>) request.getAttribute("topNews");
    List<newsDto> recentNews = (List<newsDto>) request.getAttribute("recentNews");
    List<newsDto> varsityNews = (List<newsDto>) request.getAttribute("varsityNews");
    List<newsDto> allNews = new ArrayList<newsDto>();
    if(topNews != null) allNews = topNews;
    else if(recentNews != null) allNews = recentNews;
    else if(varsityNews != null) allNews = varsityNews;
    int sz = Integer.valueOf(request.getAttribute("size"));
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("  <hr />\r\n");
      out.write("  <div class=\"adsense-banner\"> <img src=\"images/adverts/728x90.gif\" alt=\"advert\" /> </div>\r\n");
      out.write("  <hr />\r\n");
      out.write("  <div id=\"homecontent-bottom\">\r\n");
      out.write("\r\n");
      out.write("    ");

    int cnt = 0;
    for(newsDto news : allNews){
    if(cnt%3 == 0) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"homeleftcol\">\r\n");
      out.write("      <div class=\"clearfloat homeNews\">\r\n");
      out.write("        <div class=\"cat-head\">\r\n");
      out.write("          <h3><a href=\"\"> ");
      out.print(news.getVarsityAbbreviation());
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(news.getView());
      out.write(" views </a></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"#\"><img src=\"images/");
      out.print(news.getImageLocation());
      out.write(".jpg\" alt=\"\" width=\"100\" height=\"100\" class=\"home-cat-img\" /></a> <a href=\"/varsityNewsPortal/article?news=\"+");
      out.print(news.getNewsID());
      out.write(" class=\"title\"> ");
      out.print(news.getTitle());
      out.write(" </a><br />\r\n");
      out.write("        ");
      out.print(news.getDetails());
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

    }

    else if(cnt%3 == 1){
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--END LEFTCOL-->\r\n");
      out.write("    <div id=\"homemidcol\">\r\n");
      out.write("      <div class=\"clearfloat homeNews\">\r\n");
      out.write("        <div class=\"cat-head\">\r\n");
      out.write("          <h3><a href=\"\"> ");
      out.print(news.getVarsityAbbreviation());
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(news.getView());
      out.write(" views </a></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"#\"><img src=\"images/");
      out.print(news.getImageLocation());
      out.write(".jpg\" alt=\"\" width=\"100\" height=\"100\" class=\"home-cat-img\" /></a> <a href=\"/varsityNewsPortal/article?news=\"+");
      out.print(news.getNewsID());
      out.write(" class=\"title\"> ");
      out.print(news.getTitle());
      out.write(" </a><br />\r\n");
      out.write("        ");
      out.print(news.getDetails());
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

    }
    else{
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--END MIDCOL-->\r\n");
      out.write("    <div id=\"homerightcol\">\r\n");
      out.write("      <div class=\"clearfloat homeNews\">\r\n");
      out.write("        <div class=\"cat-head\">\r\n");
      out.write("          <h3><a href=\"\"> ");
      out.print(news.getVarsityAbbreviation());
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(news.getView());
      out.write(" views </a></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"#\"><img src=\"images/");
      out.print(news.getImageLocation());
      out.write(".jpg\" alt=\"\" width=\"100\" height=\"100\" class=\"home-cat-img\" /></a> <a href=\"/varsityNewsPortal/article?news=\"+");
      out.print(news.getNewsID());
      out.write(" class=\"title\"> ");
      out.print(news.getTitle());
      out.write(" </a><br />\r\n");
      out.write("        ");
      out.print(news.getDetails());
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

    }

    cnt++;

    }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--END RIGHTCOL-->\r\n");
      out.write("    <!--END CONTENT-->\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
