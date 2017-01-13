package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VerificarRequisitos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <link href=\"Library/css/app.css\" rel=\"stylesheet\" />\n");
      out.write("         <link rel=\"stylesheet\" href=\"Library/font-awesome/4.2.0/css/font-awesome.min.css\" />\n");
      out.write("         <link rel=\"stylesheet\" href=\"Library/fonts/fonts.googleapis.com.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Library/css/ace.min.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        \n");
      out.write("        <meta name=\"description\" content=\"overview &amp; stats\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("        <!-- CSRF Token -->\n");
      out.write("         <script src=\"Library/js/ace-extra.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Library/css/app.css\"></script>\n");
      out.write("        <title>CTMP</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"no-skin\">\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/Header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("       <div class=\"main-container\" id=\"main-container\">\n");
      out.write("           \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/SideBar.jsp", out, false);
      out.write("\n");
      out.write("             \n");
      out.write(" \n");
      out.write("            \n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/Footer.jsp", out, false);
      out.write("\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("            <!--*********** publins agregados ********* -->\n");
      out.write("            <script src=\"Library/js/jquery.2.1.1.min.js\"></script>\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("            window.jQuery || document.write(\"<script src='Library/js/jquery.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            if('ontouchstart' in document.documentElement) document.write(\"<script src='Library/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\n");
      out.write("        </script>\n");
      out.write("            \n");
      out.write("         <script src=\"Library/plugins/Jquery/jquery-3.1.1.min.js\"></script> \n");
      out.write("         <script src=\"Library/plugins/Bootstrap/js/bootstrap.min.js\"></script> \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <script src=\"Library/js/jquery-ui.custom.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.easypiechart.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.sparkline.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.flot.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.flot.pie.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/jquery.flot.resize.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- ace scripts -->\n");
      out.write("         <script src=\"Library/js/ace-elements.min.js\"></script>\n");
      out.write("        <script src=\"Library/js/ace.min.js\"></script> \n");
      out.write("        \n");
      out.write("    </body>\n");
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
