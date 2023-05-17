package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.xml.transform.Source;
import com.ebuss.db.DBConnection;
import java.sql.*;

public final class HomeSearchRoute1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>BussPass</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!--   Free Website Template by t o o p l a t e . c o m   -->\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("function clearText(field)\n");
      out.write("{\n");
      out.write("    if (field.defaultValue == field.value) field.value = '';\n");
      out.write("    else if (field.value == '') field.value = field.defaultValue;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");

String userName = (String)session.getAttribute("username");
if(userName!=null){

      out.write("\n");
      out.write("<div id=\"tooplate_wrapper\">\n");
      out.write("\n");
      out.write("\t<div id=\"tooplate_header\">\n");
      out.write("    \t\n");
      out.write("        <div id=\"tooplate_menu\">\n");
      out.write("        \t<ul>\n");
      out.write("                <li><a href=\"CustomerHome.jsp\" class=\"current\">Home</a></li>\n");
      out.write("                <!--<li><a href=\"#\">Login</a></li>\n");
      out.write("                <li><a href=\"#\">Register</a></li>-->\n");
      out.write("                <li><a href=\"RootPass.jsp\">Route Pass</a></li>\n");
      out.write("                <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                <li><a href=\"BookingHistory.jsp\">Booking History</a></li>\n");
      out.write("                <li><a href=\"RoutePassHistory.jsp\">Route Pass History</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"cleaner\"></div>\n");
      out.write("        </div> <!-- end of menu -->\n");
      out.write("        \n");
      out.write("\t\t<div id=\"site_title\"><h1><a href=\"#\">Parachutes</a><span>We wish you a happy Journey </span></h1></div>\n");
      out.write("    \n");
      out.write("    </div> <!-- end of header -->\n");
      out.write("    \n");
      out.write("    <div id=\"tooplate_middle\">\n");
      out.write("   \t\t<!--<div id=\"search_box\">\n");
      out.write("            <form action=\"#\" method=\"get\" onsubmit=\"return(regvalidate())>\n");
      out.write("                <input type=\"text\" value=\"Search for Roots\" name=\"q\" size=\"10\" id=\"searchfield\" title=\"searchfield\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" />\n");
      out.write("                <input type=\"submit\" name=\"Search\" value=\"\" id=\"searchbutton\" title=\"Search\" />\n");
      out.write("            </form>\n");
      out.write("        </div> <!-- end of search box -->\n");
      out.write("    </div> <!-- end of middle -->\n");
      out.write("    \n");
      out.write("    <div id=\"tooplate_main\">\n");
      out.write("                <form action=\"HomeSearchRoute1.jsp\" method=\"post\">\n");
      out.write("            <h3 align=\"left\">  <input type=\"text\" placeholder=\"Enter Source Name\" name=\"q\"></input>\n");
      out.write("                <input type=\"date\" name=\"date\"></input><br/><br/>\n");
      out.write("            <input type=\"submit\"></input>\n");
      out.write("            </h3>\n");
      out.write("        </form>    \n");
      out.write("        <div id=\"tooplate_content\">\n");
      out.write("          \n");

//String userName = (String)session.getAttribute("username");
int sno=0;
String fromName      = request.getParameter("q").trim();
String date          = request.getParameter("date").trim();

java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yy-MM-dd");
 java.sql.Date jDate =new java.sql.Date(dateFormat.parse(date).getTime());

Connection con = null;
PreparedStatement ps = null;
ResultSet rs=null;
String trnno=null,trainname=null,source=null,destination=null;
float distance=0.0f,cost=0.0f;
int seatAvailable=0;
String trainQuery ="select distinct trainno, trainname, source,destination,distance, cost,available from trainseats where  source=? and dates=?";
try{
ps = DBConnection.getDBConnection(trainQuery);
ps.setString(1,fromName);
ps.setDate(2, jDate);

rs = ps.executeQuery();

      out.write("\n");
      out.write("<table rules=\"all\" bgcolor=\"#F8F8FF\" width=\"900px\" border=\"2\" cellpadding=\"1px\" cellspacing=\"1px\">\n");
      out.write("   <em>   \n");
      out.write("       <tr style=\"font-weight: 35px;font-size: 15px\">Trains Roots</tr>\n");
      out.write("       <tr style=\"font-weight: 35px;font-size: 12px\">\n");
      out.write("        <th>S.No</th>\n");
      out.write("        <th>Train No</th>\n");
      out.write("        <th>Train Name</th>\n");
      out.write("        <th>From</th>\n");
      out.write("        <th>Departure</th>\n");
      out.write("        <th>Distance</th>\n");
      out.write("        <th>Cost</th>\n");
      out.write("        <th>Availability</th>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("   </em>\n");

while(rs.next()){
sno++;
trnno         = rs.getString(1);
trainname     = rs.getString(2);
source        = rs.getString(3);
destination   = rs.getString(4);
distance      = rs.getFloat(5);
cost          = rs.getFloat(6);
seatAvailable = rs.getInt(7);

      out.write("\n");
      out.write("   <tr style=\"font-family: monospace;font-size: 15px;font-weight: 15px;color: #2b66ff\">\n");
      out.write("        <td>");
      out.print(sno);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(trnno);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(trainname);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(source);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(destination);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(distance);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(cost);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(seatAvailable);
      out.write("</td>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </tr>\n");

}
if(trnno!=null){}else{
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <br/>\n");
      out.write("            No Train Roots Available for the Given Root\n");
      out.write("    </tr>\n");
      out.write("    ");


}
}catch(Exception e){
System.out.println("Errors at Geting seats:"+e.getMessage());
}
finally{
try{
rs.close();
ps.close();
}catch(Exception e){

}
}


      out.write("\n");
      out.write("</table>\n");
      out.write("<table rules=\"all\" bgcolor=\"#F8F8FF\" width=\"900px\" border=\"1\" cellpadding=\"2px\" cellspacing=\"3px\">\n");
      out.write("   <em>   \n");
      out.write("       <tr style=\"font-weight: 35px;font-size: 15px\">Buss Roots</tr>\n");
      out.write("       <tr style=\"font-weight: 35px;font-size: 12px\">\n");
      out.write("        <th>S.No</th>\n");
      out.write("        <th>Bus No</th>\n");
      out.write("        <th>Bus Name</th>\n");
      out.write("        <th>From</th>\n");
      out.write("        <th>Departure</th>\n");
      out.write("        <th>Distance</th>\n");
      out.write("        <th>Cost</th>\n");
      out.write("        <th>Available</th>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("   </em>\n");
      out.write("\n");

int busSno=0;
String buseServiceNo=null, busname=null,busSource = null,busDestination=null;
float busDistance=0.0f,busCost=0.0f;
int bustAvailableSeat=0;
String busQuery = "select distinct serviceno,busname, source,destination,distance, cost,available from busseats where  source=? and dates=?";
PreparedStatement ps1 = null;
ResultSet rs1 = null;
try{
ps1 = DBConnection.getDBConnection(busQuery);
ps1.setString(1,fromName);
ps1.setDate(2, jDate);
rs1 = ps1.executeQuery();
while(rs1.next()){
    busSno++;
buseServiceNo     = rs1.getString(1);
busname           = rs1.getString(2);
busSource         = rs1.getString(3);
busDestination    = rs1.getString(4);
busDistance       = rs1.getFloat(5);
busCost           = rs1.getFloat(6);
bustAvailableSeat = rs1.getInt(7);
//System.out.println("Bus Service Number:"+buseServiceNo);

      out.write("\n");
      out.write("<tr style=\"font-family: monospace;font-size: 15px;font-weight: 15px;color: #2b66ff\">\n");
      out.write("        <td>");
      out.print(busSno);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(buseServiceNo);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(busname);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(busSource);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(busDestination);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(busDistance);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(busCost);
      out.write("</td>\n");
      out.write(" ");

   if(bustAvailableSeat>0){
   
      out.write("\n");
      out.write("  <td>");
      out.print(bustAvailableSeat);
      out.write("</td>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("        ");

   }else{
  
      out.write("\n");
      out.write("        <td>Seats Not Available</td>\n");
      out.write("  ");

  }        

      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("\n");

}
if(buseServiceNo!=null){}else{
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <br/>\n");
      out.write("            No Busses Available for the Given Root\n");
      out.write("    </tr>\n");
      out.write("    ");


}
}catch(Exception e){
System.out.println("Error Getting Bus Seats:"+e.getMessage());
e.printStackTrace();
}finally{
try{

}catch(Exception ee){

}
}


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("<br/><br/><br/>\n");
      out.write("        \t<div class=\"col_w880\">\n");
      out.write("            \n");
      out.write("            \t<div class=\"col_w260 fp_box\">\n");
      out.write("                \t<h2>Classic Itineraries</h2>\n");
      out.write("                \t<p>Private guided tours elaborately designed by the largest online Blue Wave travel agency and our expert operators to cater to your budget and specific preference.</p>\n");
      out.write("                    <!--<a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col_w260 fp_box\">\n");
      out.write("                \t<h2>City Packages</h2>\n");
      out.write("                    <p>If you are on a tight travel plan and obsessed with what to see,you can follow these carefully designed single city packages to make the best use of your time to visit the major highlights.\n");
      out.write("</p>\n");
      out.write("                    <!--<a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col_w260 fp_box col_last\">\n");
      out.write("                \t<h2>Destinations</h2>\n");
      out.write("                    <p>Comprehensive Blue Wave travel information on destinations, attractions, transportation, weather, maps to help you achieve an unforgettable trip.</p>\n");
      out.write("                   <!-- <a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col_w880 portfolio\">\n");
      out.write("\t\t\t\n");
      out.write("            \t<h2>Portfolio</h2>\n");
      out.write("            \t<div class=\"col_w260\">\n");
      out.write("                \t<h6>Non Stop Services</h6>\n");
      out.write("                        <img src=\"images/leftside.jpg\" width=\"250\" height=\"140\" alt=\"Image 01\" />\n");
      out.write("                \t<p>Superfast trains are express rail services of the Blue Wave railways. They make few stops, unlike other Mail/Express trains, achieving somewhat shorter journey times. Tickets cost more than Mail Express rates. </p>\n");
      out.write("                   <!-- <a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col_w260\">\n");
      out.write("                \t<h6>Regular Service</h6>\n");
      out.write("                        <img src=\"images/center.gif\" width=\"250\" height=\"140\" alt=\"Image 02\" />\n");
      out.write("                    <p>365 days a year, usually from 6 a.m. until past midnight although all routes do not operate seven days a week.Weekday rush hours from 7 a.m. ? 9 a.m. and 3:30 p.m. ? 5:30 p.m., providing the most service available.</p>\n");
      out.write("                    <!--<a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col_w260 col_last\">\n");
      out.write("                \t<h6>Weekly Service</h6>\n");
      out.write("                        <img src=\"images/rightside.jpg\" width=\"250\" height=\"140\" alt=\"Image 03\" />\n");
      out.write("                    <p>Arriva is here to help you get around the Medway Towns and the surrounding area.\n");
      out.write("\n");
      out.write("Our buses run across the region, with frequent services linking estates and residential areas to the town centres and to Hempstead Valley Shopping Centre.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("                   <!-- <a class=\"more\" href=\"#\">Learn more</a>-->\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div> <!-- end of content -->\n");
      out.write("        \n");
      out.write("    </div>\t<!-- end of main -->\n");
      out.write("     \n");
      out.write("    <div id=\"tooplate_footer\">\n");
      out.write("    \n");
      out.write("        Copyright © 2015 <a href=\"#\">My Company</a>\n");
      out.write("    \n");
      out.write("    </div> <!-- end of tooplate_footer -->\n");
      out.write("\n");
      out.write("</div> <!-- end of wrapper -->\n");
      out.write("<!--   Free Website Template by t o o p l a t e . c o m   -->\n");

}else{
response.sendRedirect("index.html");
}

      out.write("\n");
      out.write("</body>\n");
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
