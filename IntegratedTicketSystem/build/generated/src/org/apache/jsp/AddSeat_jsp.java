package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.ebuss.db.DBConnection;

public final class AddSeat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"first active\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AdminHome.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddBussRoots.jsp\">Add Bus Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddTrainRoots.jsp\">Add Train Roots</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AddSeat.jsp\">Add Train Seat</a>\n");
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
      out.write("\t\t\t\t\t\t<div class=\"blogpost primary_wide3\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"left\" src=\"images/pic02.jpg\" width=\"1116\" height=\"316\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<h2>INTEGRATING TICKETING SYSTEM FOR BUS & TRAIN</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"comments\"><a href=\"#\"></a></span> &nbsp; <span class=\"readmore\"><a href=\"#\"></a></span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("<div id=\"box3\">\n");
      out.write(" <div class=\"blogpost secondary_wide4\">\n");
      out.write("  <h2>Adding Ceats</h2>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("    <p>\n");
      out.write("        <table border=\"2\" width=\"900px\" cellpadding=\"2px\" cellspacing=\"3px\" rules=\"rows\" style=\"font-size: 17px\">\n");
      out.write("            <tr>\n");
      out.write("                <th>S.No</th>\n");
      out.write("                <th>Current Date</th>\n");
      out.write("                <th>Train Number</th>\n");
      out.write("                <th>Train Name</th>\n");
      out.write("                <th>Starting point</th>\n");
      out.write("                <th>Ending Point</th>\n");
      out.write("                <th>Distance</th>\n");
      out.write("                <th>Cost</th>\n");
      out.write("                <th>Add Seats</th>\n");
      out.write("            </tr>\n");
      out.write("        \n");

      int no=0;
    String msg=null;
    java.sql.Date cDate = new java.sql.Date(new java.util.Date().getTime()); 
    String trainno=null;
    String trainname=null;
    String sourcecity=null;
    String destinationcity=null;
    float distance = 0;
    float cost = 0;
    
    int totalSeat = 0;
    int availableSeat = 0;
    PreparedStatement ps = null;
    PreparedStatement ps2 = null;
    ResultSet rs = null;
    String getTrainInfoQuery ="select trainno,trainname,sourcecity,destinationcity,distance,cost from trainroot where seatstatus='no'";
    try{
    // InsertTrainRoots itr = new InsertTrainRoots();
    ps = DBConnection.getDBConnection(getTrainInfoQuery);
    rs = ps.executeQuery();
    int count=0;
    
    while(rs.next()){
        count++;
    trainno = rs.getString(1);
    
    trainname = rs.getString(2);
    sourcecity = rs.getString(3);
    destinationcity = rs.getString(4);
    distance = rs.getFloat(5);
    cost = rs.getFloat(6);
    cDate = cDate;    
    totalSeat = 300;
    availableSeat =300;
        //System.out.println("Train Number:"+);
    
       //no = itr.addTrainRoots(list, trainno, trainname, sourcecity, destinationcity, distance, cost, currentDate, totalSeat, availableSeat);
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(count);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(cDate);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(trainno);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(trainname);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(sourcecity);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(destinationcity);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(distance);
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(cost);
      out.write(" </td>\n");
      out.write("        <td style=\"font-size: 18px;font-family: sans-serif;color: #3694ab\">\n");
      out.write("            <a href=\"./addTrainsSeatsFirst?cdate=");
      out.print(cDate);
      out.write("&trainno=");
      out.print(trainno);
      out.write("&trainname=");
      out.print(trainname);
      out.write("&sourcecity=");
      out.print(sourcecity);
      out.write("&destinationcity=");
      out.print(destinationcity);
      out.write("&distance=");
      out.print(distance);
      out.write("&cost=");
      out.print(cost);
      out.write("&totalSeat=");
      out.print(totalSeat);
      out.write("&availableSeat=");
      out.print(availableSeat);
      out.write("\">Add Seat</a> </td>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("        ");

    
    }
      
        
    
    }catch(Exception e){
        System.out.println("Adding Trains Seats:"+e.getMessage());
    }
   
   
       String message=request.getParameter("msg");

       if(message!=null && message.equalsIgnoreCase("success"))
       {
        out.println("<font color='red'><blink>Adding Train Seat Details is Success!</blink></font>");
	}
       else if(message!=null && message.equalsIgnoreCase("faild")){
       out.println("<font color='red'><blink>Adding Train Seat Details is faild!</blink></font>");
       }
      
       
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("    </p>\n");
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
