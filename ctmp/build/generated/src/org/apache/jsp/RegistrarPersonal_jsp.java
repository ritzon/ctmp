package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarPersonal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/LibHeader.jsp", out, false);
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"no-skin\">\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/Header.jsp", out, false);
      out.write("      \n");
      out.write("    <div class=\"main-container\" id=\"main-container\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/SideBar.jsp", out, false);
      out.write("\n");
      out.write("        <!---------------***formulario de registrar personal***------------->\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                   <div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("                       <div class=\"panel-heading\"><h3><strong>Registrar Personal</strong></h3></div>\n");
      out.write("                       <div class=\"panel-body\">\n");
      out.write("                           <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"name\" class=\"col-md-4 control-label\">Dni</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"name\" type=\"text\" class=\"form-control\" name=\"Dni\" value=\"\" required autofocus>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"email\" class=\"col-md-4 control-label\">Nombres</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"email\" type=\"text\" class=\"form-control\" name=\"Nombres\" value=\"\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"password\" class=\"col-md-4 control-label\">Apellido Paterno</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"password\" type=\"text\" class=\"form-control\" name=\"Ap\" required>\n");
      out.write("\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"txtAm\" class=\"col-md-4 control-label\">Apellido Materno</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"txtAm\" type=\"text\" class=\"form-control\" name=\"Am\" required>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"cboGenero\" class=\"col-md-4 control-label\">Género</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                      <select id=\"cboGenero\" class=\"form-control\" name=\"Genero\" required=\"required\">\n");
      out.write("                                       <option value=\"Femenino\">Femenino</option>\n");
      out.write("                                       <option value=\"Masculino\">Masculino</option>\n");
      out.write("                                   </select>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"cboCargo\" class=\"col-md-4 control-label\">Cargo</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                   <select id=\"cboCargo\" class=\"form-control\" name=\"Cargo\" required=\"required\">\n");
      out.write("                                       <option value=\"Recepcionista\">Recepcionista</option>\n");
      out.write("                                   </select>\n");
      out.write("                                      <!--  <input id=\"password-confirm\" type=\"password\" class=\"form-control\" name=\"password_confirmation\" required> -->\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"txtTelefono\" class=\"col-md-4 control-label\">Teléfono</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"txtTelefono\" type=\"text\" class=\"form-control\" name=\"Telefono\" >\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"txtCorreo\" class=\"col-md-4 control-label\">Correo</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"txtCorreo\" type=\"text\" class=\"form-control\" name=\"Correo\" placeholder=\"example@ctmp.com\" >\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"txtDireccion\" class=\"col-md-4 control-label\">Dirección</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"txtDireccion\" type=\"text\" class=\"form-control\" name=\"Direccion\" required>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <div class=\"col-md-6 col-md-offset-4\">\n");
      out.write("                                       <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                           Registrar\n");
      out.write("                                       </button>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                           </form>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("        <!---------------***//formulario de registrar personal***------------->\n");
      out.write("        \n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/Footer.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "utilitarios/LibFooter.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
