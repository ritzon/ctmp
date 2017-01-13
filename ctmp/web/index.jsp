<%@ page language="java" pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <link href="Library/css/app.css" rel="stylesheet" />
         <link rel="stylesheet" href="Library/font-awesome/4.2.0/css/font-awesome.min.css" />
         <link rel="stylesheet" href="Library/fonts/fonts.googleapis.com.css" />
        <link rel="stylesheet" href="Library/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
        
        <meta charset="utf-8" />
        
        <meta name="description" content="overview &amp; stats" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <!-- CSRF Token -->
         <script src="Library/js/ace-extra.min.js"></script>
        <script type="text/javascript" src="Library/css/app.css"></script>
        <title>CTMP</title>
    </head>

    <body class="no-skin">
       <jsp:include page="utilitarios/Header.jsp"></jsp:include>
       
       <div class="main-container" id="main-container">
           
            <jsp:include page="utilitarios/SideBar.jsp"></jsp:include>
             
 
            
          <jsp:include page="utilitarios/Footer.jsp"></jsp:include>
       </div>
      
        
            <!--*********** publins agregados ********* -->
            <script src="Library/js/jquery.2.1.1.min.js"></script>
              <script type="text/javascript">
            window.jQuery || document.write("<script src='Library/js/jquery.min.js'>"+"<"+"/script>");
        </script>
        
         <script type="text/javascript">
            if('ontouchstart' in document.documentElement) document.write("<script src='Library/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
        </script>
            
         <script src="Library/plugins/Jquery/jquery-3.1.1.min.js"></script> 
         <script src="Library/plugins/Bootstrap/js/bootstrap.min.js"></script> 
       

        <script src="Library/js/jquery-ui.custom.min.js"></script>
        <script src="Library/js/jquery.ui.touch-punch.min.js"></script>
        <script src="Library/js/jquery.easypiechart.min.js"></script>
        <script src="Library/js/jquery.sparkline.min.js"></script>
        <script src="Library/js/jquery.flot.min.js"></script>
        <script src="Library/js/jquery.flot.pie.min.js"></script>
        <script src="Library/js/jquery.flot.resize.min.js"></script>

        <!-- ace scripts -->
         <script src="Library/js/ace-elements.min.js"></script>
        <script src="Library/js/ace.min.js"></script> 
        
    </body>
</html>
