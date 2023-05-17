package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddBusAndTrainPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <script>\n");
      out.write("    function calc(){\n");
      out.write("    var fcost = document.getElementById(\"fcost\").value;    \n");
      out.write("    var sCost = document.getElementById(\"scost\").value;\n");
      out.write("    var tCost = document.getElementById(\"tCost\").value;\n");
      out.write("    \n");
      out.write("    var finalCost = parseFloat(fcost)+parseFloat(sCost)+parseFloat(tCost);\n");
      out.write("    document.getElementById(\"finalCost\").value=parseFloat(finalCost);\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">View Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
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
      out.write("\t\t\t\t\t\t\t<h2>Adding Multiple Bus Pass Details</h2>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<p class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"comments\"><a href=\"#\"></a></span> &nbsp; <span class=\"readmore\"><a href=\"#\"></a></span>\n");
      out.write("                                                                <form action=\"AddBusAndTrainController\" method=\"post\">\n");
      out.write("                                                                    <table border=\"1\" width=\"700\" >\n");
      out.write("<tr><td>Source Stop Name</td><td>&nbsp;<input type=\"text\" required name=\"startingOrigin\"/></td></tr>\n");
      out.write("<tr><td>Bus Stop </td><td>&nbsp;<input type=\"text\" required name=\"startingStopName\"/> </td></tr>\n");
      out.write("<tr><td>Get In Bus Number</td><td>&nbsp;<input type=\"text\" required name=\"fisrtRootNumber\"/> </td></tr>\n");
      out.write("<tr><td>First Cost </td><td>&nbsp;$&nbsp;<input type=\"text\" id=\"fcost\" size=\"5\" required name=\"firstCost\"/> </td></tr>\n");
      out.write("<tr><td>Get Down at Busstop Name </td><td>&nbsp;<input type=\"text\" required name=\"getDownFirstStop\"/> </td></tr>\n");
      out.write("<tr><td>Walk Distance </td><td>&nbsp;<input type=\"text\" required name=\"firstWalkDistance\"/> </td></tr>\n");
      out.write("<tr><td>Train Station Name </td><td>&nbsp;<input type=\"text\" required name=\"firstTrainStationName\"/> </td></tr>\n");
      out.write("<tr><td>Train  Name </td><td>&nbsp;<input type=\"text\" required name=\"firstTrainName\"/> </td></tr>\n");
      out.write("<tr><td>Second Cost  </td><td>&nbsp;$&nbsp;<input type=\"text\" size=\"5\" required id =\"scost\" name=\"secondCost\"/> </td></tr>\n");
      out.write("<tr><td>Get Down Train Stop Name </td><td>&nbsp;<input type=\"text\"  required name=\"getDownTrainStopName\"/> </td></tr>\n");
      out.write("<tr><td>Walk Distance  </td><td>&nbsp;<input type=\"text\" required name=\"secondWalkDistance\"/> </td></tr>\n");
      out.write("<tr><td>Get In Bus Number  </td><td>&nbsp;<input type=\"text\" required name=\"getInSecondBusNumber\" /> </td></tr>\n");
      out.write("<tr><td>Third Cost  </td><td>&nbsp;$&nbsp;<input type=\"text\" size=\"5\" required id=\"tCost\" name=\"thirdCost\"/> </td></tr>\n");
      out.write("<tr><td> Get Down Destination  </td><td>&nbsp;<input  type=\"text\" required name=\"destination\" onblur=\"return calc()\"/> </td></tr>\n");
      out.write("<tr><td>Total Cost  </td><td>&nbsp;$&nbsp;<input id=\"finalCost\" size=\"5\" readonly type=\"text\" name=\"totalCost\"/> </td></tr>\n");
      out.write("<tr><td><center> <input size=\"20\" type=\"submit\" value=\"Add\" ></center></td><td><center><input readonly type=\"reset\" value=\"Reset\"/></center> </td></tr>\n");
      out.write(" </tr>\n");
      out.write("  ");

       String message=request.getParameter("msg");

       if(message!=null && message.equalsIgnoreCase("success"))
       {
        out.println("<font color='red'><blink>Adding Root Pass Details is Success!</blink></font>");
	}
       else if(message!=null && message.equalsIgnoreCase("faild")){
       out.println("<font color='red'><blink>Adding Root Pass Details is faild!</blink></font>");
       }
      
       
      out.write("\n");
      out.write("</table>\n");
      out.write("                                                                    </form>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
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
