<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <script type="text/javascript">
        window.history.forward();
        function noBack()
        {
            window.history.forward();
        }
        
       
          
    </script>   
    <SCRIPT type="Text/JavaScript"> 
    function checkCard() { 
       var credit=document.payment.creditcard.value;
       var re16digit = /^\d{16}$/;
       if (!re16digit.test(credit)) {
        alert("Please enter a valid credit card numbers");
        document.payment.creditcard.focus();
        return false;
        }
        else{
         return false;   
        }
    alert("Hello");
       
    }
       </script>
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BussPass</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="tooplate_style.css" rel="stylesheet" type="text/css" />
<link href="js/moment.js" type="text/javascript"/>
<!--   Free Website Template by t o o p l a t e . c o m   -->
<script language="javascript" type="text/javascript">
function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
</head>
<body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
<%

String userName = (String)session.getAttribute("username");
if(userName!=null){
%>
<div id="tooplate_wrapper">

	<div id="tooplate_header">
    	
        <div id="tooplate_menu">
        	<ul>
                <li><a href="CustomerHome.jsp" class="current">Home</a></li>
                <li><a href="RootPass.jsp">Root Pass</a></li>
                <!--<li><a href="#">Login</a></li>
                <li><a href="#">Register</a></li>
                <li><a href="blog.html">Blog</a></li>-->
                <li><a href="contact.html">Contact</a></li>
                <li><a href="logout.jsp">LogOut</a></li>
              </ul>
            <ul style="font-family: cursive;color: #F60;font-size: 24px"align="left">
                Login As : <%=session.getAttribute("username")%>
            </ul>
            <div class="cleaner"></div>
        </div> <!-- end of menu -->
        
		<div id="site_title"><h1><a href="#">Parachutes</a><span>We wish you a happy Journey </span></h1></div>
    
    </div> <!-- end of header -->
    
    <div id="tooplate_middle">
   		<!--<div id="search_box">
            <form action="#" method="get" onsubmit="return(regvalidate())>
                <input type="text" value="Search for Roots" name="q" size="10" id="searchfield" title="searchfield" onfocus="clearText(this)" onblur="clearText(this)" />
                <input type="submit" name="Search" value="" id="searchbutton" title="Search" />
            </form>
        </div> <!-- end of search box -->
    </div> <!-- end of middle -->
    
    <div id="tooplate_main">
                
        <div id="tooplate_content">



      <div class="col_w880">
          <div style="border-style: solid;border-width: 5px">
              <br/>           
           
<%
        String passid              = request.getParameter("passid");
        String user                = request.getParameter("userName");
        String startpoint          = request.getParameter("startpoint");
        String destination         = request.getParameter("destination");
        String startDate           = request.getParameter("startDate");
        String typeofpass          = request.getParameter("typeofpass");
        String totalcost           = request.getParameter("totalcost");
        String dateofbooking       = request.getParameter("dateofbooking");
        String firstGetDown        = request.getParameter("getdownat");
        String firstwalkdistance   = request.getParameter("firstwalkdistance");
        String catchtrainname      = request.getParameter("catchtrainname");
        String secondgetdownat     = request.getParameter("secondgetdownat");
       
        String secondwalkdistance  = request.getParameter("secondwalkdistance");
        String busnumber           = request.getParameter("busnumber");   
        
        
        
%>  
            
<form method="post" name="payment" action="RoutePassGetPaymentSuccess.jsp">
        	
    
    <div class="col_w880 home_intro">
                  
            	<p> 
                    <em>

                                                     Online Payment Details
<div style="font-size: 20px;color: red;font-weight: bolder" color="Red" id="errors"></div>
                         <font color="2514e3">
                           </font><br/>
                    </em> <br/>
                    Credit Card Number:<input type="text" required name="creditcard" style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 200px;height: 30px;font-weight: bolder;font-size: 17px" onblur="return checkCard()"/>
                    
                    CVV:<input type="text" name="cvv" required style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 200px;height: 30px;font-weight: bolder;font-size: 17px"/>
                    <br/><br/>
                    Expiry Date: &nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" placeholder="mm" name="month" style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 70px;height: 30px;font-weight: bolder;font-size: 17px"/>
                  &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" required placeholder="yyyy" name="year" style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 70px;height: 30px;font-weight: bolder;font-size: 17px"/>
                    <br/><br/>
                    Email ID:&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;<input type="email" name="email" required style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 200px;height: 30px;font-weight: bolder;font-size: 17px"/>
                  <br/><br/>
                  
    <input type="hidden" name="passid" value="<%=passid%>">
    <input type="hidden" name="user" value="<%=user%>">
    <input type="hidden" name="startpoint" value="<%=startpoint%>">
    <input type="hidden" name="destination" value="<%=destination%>">
    <input type="hidden" name="startDate" value="<%=startDate%>">
    <input type="hidden" name="typeofpass" value="<%=typeofpass%>">
    <input type="hidden" name="totalcost" value="<%=totalcost%>">
    <input type="hidden" name="dateofbooking" value="<%=dateofbooking%>">
        
        <input type="hidden" name="firstGetDown" value="<%=firstGetDown%>">
        <input type="hidden" name="firstwalkdistance" value="<%=firstwalkdistance%>">
        <input type="hidden" name="catchtrainname" value="<%=catchtrainname%>">
        <input type="hidden" name="secondgetdownat" value="<%=secondgetdownat%>">
        
        <input type="hidden" name="secondwalkdistance" value="<%=secondwalkdistance%>">
    <input type="hidden" name="busnumber" value="<%=busnumber%>">
        
                  <input type="submit" value="Make Payment" name="submit" style="border: solid 1px #707070;box-shadow: 0 0 5px 1px #969696;width: 200px;height: 30px;font-weight: bolder;font-size: 17px;position: absolute"/>
                 </p>
                    
                
                <div class="cleaner"></div>
            </div>
        </form>
              
              

          </div>      
            	<div class="col_w260 fp_box">
                	<h2>Classic Itineraries</h2>
                	<p>Private guided tours elaborately designed by the largest online Blue Wave travel agency and our expert operators to cater to your budget and specific preference.</p>
                    <!--<a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="col_w260 fp_box">
                	<h2>City Packages</h2>
                    <p>If you are on a tight travel plan and obsessed with what to see,you can follow these carefully designed single city packages to make the best use of your time to visit the major highlights.
</p>
                    <!--<a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="col_w260 fp_box col_last">
                	<h2>Destinations</h2>
                    <p>Comprehensive Blue Wave travel information on destinations, attractions, transportation, weather, maps to help you achieve an unforgettable trip.</p>
                   <!-- <a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="cleaner"></div>
            </div>
            
            <div class="col_w880 portfolio">
			
            	<h2>Portfolio</h2>
            	<div class="col_w260">
                	<h6>Non Stop Services</h6>
                        <img src="images/leftside.jpg" width="250" height="140" alt="Image 01" />
                	<p>Superfast trains are express rail services of the Blue Wave railways. They make few stops, unlike other Mail/Express trains, achieving somewhat shorter journey times. Tickets cost more than Mail Express rates. </p>
                   <!-- <a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="col_w260">
                	<h6>Regular Service</h6>
                        <img src="images/center.gif" width="250" height="140" alt="Image 02" />
                    <p>365 days a year, usually from 6 a.m. until past midnight although all routes do not operate seven days a week.Weekday rush hours from 7 a.m. ? 9 a.m. and 3:30 p.m. ? 5:30 p.m., providing the most service available.</p>
                    <!--<a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="col_w260 col_last">
                	<h6>Weekly Service</h6>
                        <img src="images/rightside.jpg" width="250" height="140" alt="Image 03" />
                    <p>Arriva is here to help you get around the Medway Towns and the surrounding area.

Our buses run across the region, with frequent services linking estates and residential areas to the town centres and to Hempstead Valley Shopping Centre.

</p>
                   <!-- <a class="more" href="#">Learn more</a>-->
                </div>
                
                <div class="cleaner"></div>
            </div>
        
        </div> <!-- end of content -->
        
    </div>	<!-- end of main -->
    
    <div id="tooplate_footer">
     
        Copyright � 2015 <a href="#">My Company</a>
    
    </div> <!-- end of tooplate_footer -->

</div> <!-- end of wrapper -->
<!--   Free Website Template by t o o p l a t e . c o m   -->
<%
}else{
response.sendRedirect("index.html");
}
%>
</body>
</html>