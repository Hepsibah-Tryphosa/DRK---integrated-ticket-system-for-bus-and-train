package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                   window.history.forward();\n");
      out.write("                   function noBack()\n");
      out.write("                   {\n");
      out.write("                     window.history.forward();\n");
      out.write("                   }\n");
      out.write("                 </script>\n");
      out.write("\t</head>\n");
      out.write("\t<body onLoad=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onUnload=\"\">\n");
      out.write("\t\t<div id=\"outer\">\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"#\">Integrating Ticketing System For Bus & Train</a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"nav\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"first active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AdminHome.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddBussRoots.jsp\">Add Bus Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddBusAndTrainPass.jsp\">BusPass</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddTrainRoots.jsp\">Add Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<!--<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">View Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>-->\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddSeat.jsp\">Add Train seats</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                            <li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddBusSeats.jsp\">Add Bus Seats</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"last\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AdminLogin.jsp\">Log Out</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<br class=\"clear\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t<div id=\"box1\">\n");
      out.write("\t\t\t\t\t\t<!-- Primary Wide Blog Post 3 -->\n");
      out.write("\t\t\t\t\t\t<div class=\"blogpost primary_wide3\"> \n");
      out.write("\t\t\t\t\t\t\t<img class=\"left\" src=\"images/pic02.jpg\" width=\"1116\" height=\"316\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<h2>INTEGRATING TICKETING SYSTEM FOR BUS & TRAIN</h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tFor other people like say suppose students and employees, who travell regularly to their college and respective\n");
      out.write("                                                        worl place by bus and possibly train if it is long distance, for them one idea  like to provide one pass for both\n");
      out.write("                                                        bus and train together which generates automatic it is the same distance they are travelling daily.\n");
      out.write("This case only works in weekly/monthly/ann              ual system only.\n");
      out.write("cost for both bus and train in one pass if\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"comments\"><a href=\"#\"></a></span> &nbsp; <span class=\"readmore\"><a href=\"#\"></a></span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div id=\"box3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"blogpost secondary_wide4\">\n");
      out.write("\t\t\t\t\t\t\t<h2>E-Bus Pass Registration & Renewal System</h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<img class=\"left\" src=\"images/pic03.jpg\" width=\"250\" height=\"248\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tE-Bus Pass Registration & Renewal System is a real time project which is useful mainly for the students and people who travel by bus in India, who are facing problems with the current manual work of bus pass registration and renewal. It also increases the validity period, frequently warns the students before completion of his validity period by sending sms or mails. His / Her Renewal or Registration can be done using his/her credit card as well. This Online system will reduce the time in issuing/renewal of bus-passes from 25- 30 minutes to 3-5 minutes, thus leading to convenience& satisfaction to the users.\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"comments\"><a href=\"#\"></a></span> &nbsp; <span class=\"readmore\"><a href=\"#\"></a></span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
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
