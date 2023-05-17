package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<title>Integrating Ticketing System For Bus & Train</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"outer\">\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"#\">Integrating Ticketing System For Bus & Train</a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"nav\">\n");
      out.write("\t\t\t\t<!--\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"first active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Add Bus Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">View Bus Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Add Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">View Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Downloads</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t--><br class=\"clear\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t<div id=\"box1\">\n");
      out.write("\t\t\t\t\t\t<!-- Primary Wide Blog Post 3 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"blogpost primary_wide3\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"left\" src=\"images/pic02.jpg\" width=\"1116\" height=\"316\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<h2>\n");
      out.write("<form action=\"adminLoginCheck\" method=\"post\">\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("  <td>UserName:</td>\n");
      out.write("  <td><input type=\"text\" name=\"username\"/></td>\n");
      out.write("   </tr>\n");
      out.write("             <tr>\n");
      out.write("                        <td>Password:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pwd\"/></td>\n");
      out.write("                       </tr>\n");
      out.write("\n");
      out.write("                       <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Login\"/></td>\n");
      out.write("                       </tr>\n");
      out.write("                   ");

       String message=request.getParameter("msg");

       if(message!=null && message.equalsIgnoreCase("invalid"))
       {
        out.println("<font color='red'><blink>Invalid User Details!</blink></font>");
	}
                  
      out.write("\n");
      out.write("                   </table>\n");
      out.write("                                                            </form>\n");
      out.write("\n");
      out.write("                                                        </h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<br class=\"clear\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"copyright\">\n");
      out.write("\t\t\tIntegrating Ticketing System For Bus & Train by <a href=\"http://www.google.com\">Student</a>.\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
