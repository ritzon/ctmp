package org.apache.jsp.FrmPersonal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pe.systemslab.ctmp.entidad.EntidadPersonal;
import pe.systemslab.ctmp.entidad.EntidadUsuario;
import java.sql.ResultSet;
import pe.systemslab.ctmp.negocio.NegocioPersonal;
import pe.systemslab.ctmp.negocio.NegocioUsuario;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/LibHeader.jsp", out, false);
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"../Library/plugins/Jquery/jquery-3.1.1.min.js\"></script> \n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("           var dni = document.getElementById(\"Dni\");\n");
      out.write("           \n");
      out.write("            $(document).ready(function()\n");
      out.write("            {\n");
      out.write("                /*$(\"#registrar\").click(function()\n");
      out.write("                {\n");
      out.write("                    $(\"#myModal\").modal(\"show\");\n");
      out.write("                });*/\n");
      out.write("                \n");
      out.write("                   $(\"#myModal\").modal(\"show\");\n");
      out.write("               \n");
      out.write("            });\n");
      out.write("         </script>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body class=\"no-skin\">\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/Header.jsp", out, false);
      out.write("      \n");
      out.write("    <div class=\"main-container\" id=\"main-container\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/SideBar.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("     \n");
      out.write("        ");
 /*declaramos entidades*/
            NegocioPersonal miNegocio= new NegocioPersonal();
            int val =-1;
            String Mensaje ="";
         boolean registrar = false;
         if(request.getParameter("registrar")!=null) registrar = true;
         
         if(registrar)
         {
             String dni="";
             String nombre="";
             String Ap="";
             String Am="";
             String Genero="";
             int region=0;
             int cargo=0;
             String Telefono="";
             String Correo="";
             String Direccion="";
            
             dni =request.getParameter("Dni");
             nombre =request.getParameter("Nombres");
             Ap =request.getParameter("Ap");
             Am =request.getParameter("Am");
             Genero =request.getParameter("Genero");
             region = Integer.parseInt(request.getParameter("Region"));
             cargo =Integer.parseInt(request.getParameter("Cargo"));
             Telefono =request.getParameter("Telefono");
             Correo =request.getParameter("Correo");
             Direccion =request.getParameter("Direccion");
             
             EntidadPersonal ep = new EntidadPersonal(dni, nombre, Ap, Am, Genero, region, cargo, Correo, Telefono, Direccion);
             NegocioUsuario  nu = new NegocioUsuario();
             
             if(miNegocio.ExistePersonal(dni)==0)
             {
                  miNegocio.InsertarPersonal(ep);
                  val=0;
                  Mensaje="<p>El personal se registró correctamente.</p>";
                  Mensaje= Mensaje + "<p>usuario: <strong> "+nombre.trim().toLowerCase().replace(" ", "").substring(1, 1)+Ap.trim().toLowerCase().replace(" ", "")+"</strong></p>";
                  Mensaje= Mensaje + "<p>contraseña: <strong>"+dni.trim()+"</strong>.</p>";
             }
             else 
             {
                 val=1;
                 Mensaje="<p>el Dni:"+dni + " ya se encuentra registrado.</p>";
             }
            
                 
         }
        
      out.write("\n");
      out.write("        <!---------------***formulario de registrar personal***------------->\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                   <div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("                       <div class=\"panel-heading\"><h3><strong>Registrar Personal</strong></h3></div>\n");
      out.write("                       <div class=\"panel-body\">\n");
      out.write("                           <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"RegistrarPersonal.jsp\" name=\"RegistrarPesonal\" id=\"RegistrarPesonal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Dni\" class=\"col-md-4 control-label\">Dni</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input type=\"text\" class=\"form-control\" id=\"Dni\" name=\"Dni\" value=\"\" required autofocus>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"email\" class=\"col-md-4 control-label\">Nombres</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"Nombres\" type=\"text\" class=\"form-control\" name=\"Nombres\" value=\"\" required>\n");
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
      out.write("                               \n");
      out.write("                              \n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Genero\" class=\"col-md-4 control-label\">Género</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                      <select id=\"Genero\" class=\"form-control\" name=\"Genero\" required=\"required\">\n");
      out.write("                                       <option value=\"Femenino\">Femenino</option>\n");
      out.write("                                       <option value=\"Masculino\">Masculino</option>\n");
      out.write("                                   </select>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Region\" class=\"col-md-4 control-label\">Región</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <!--<input id=\"Region\" type=\"text\" class=\"form-control\" name=\"Region\" required>-->\n");
      out.write("                                       <select name=\"Region\" id=\"Region\" class=\"form-control\" required=\"required\">\n");
      out.write("                                       ");
 
                                            ResultSet rs;
                                            rs=miNegocio.ListarRegiones();
                                            while (rs.next()){
                                       
      out.write("\n");
      out.write("                                           <option value=\"");
      out.print(rs.getInt("idRegion"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("Region"));
      out.write("</option>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                       </select>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Cargo\" class=\"col-md-4 control-label\">Cargo</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                   <select id=\"Cargo\" class=\"form-control\" name=\"Cargo\" required=\"required\">\n");
      out.write("                                        ");
 ResultSet rs1; 
                                           rs1= miNegocio.ListarCargos();
                                            while (rs1.next()){
                                        
      out.write("\n");
      out.write("                                       <option value=\"");
      out.print(rs1.getInt("idCargo"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("NomCargo"));
      out.write("</option>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                   </select>\n");
      out.write("                                      <!--  <input id=\"password-confirm\" type=\"password\" class=\"form-control\" name=\"password_confirmation\" required> -->\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Telefono\" class=\"col-md-4 control-label\">Teléfono</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"Telefono\" type=\"text\" class=\"form-control\" name=\"Telefono\" >\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Correo\" class=\"col-md-4 control-label\">Correo</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"Correo\" type=\"text\" class=\"form-control\" name=\"Correo\" placeholder=\"example@ctmp.com\" >\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <label for=\"Direccion\" class=\"col-md-4 control-label\">Dirección</label>\n");
      out.write("\n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <input id=\"Direccion\" type=\"text\" class=\"form-control\" name=\"Direccion\" required>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                   <div class=\"col-md-6 col-md-offset-4\">\n");
      out.write("                                       <button type=\"submit\" name=\"registrar\" id=\"registrar\" class=\"btn btn-primary\">\n");
      out.write("                                           Registrar\n");
      out.write("                                       </button>\n");
      out.write("                                   </div>\n");
      out.write("                                   \n");
      out.write("                                   <div class=\"col-md-6\">\n");
      out.write("                                       <button type=\"button\" name=\"Limpiar\" id=\"Limpiar\" class=\"btn btn-primary\">\n");
      out.write("                                           Limpiar\n");
      out.write("                                       </button>\n");
      out.write("                                   </div>\n");
      out.write("                               </div>\n");
      out.write("\n");
      out.write("                           </form>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("                                   \n");
      out.write("                                   <!-- Small modal -->\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">Small modal</button>\n");
      out.write("\n");
      out.write("            <div class=\"modal fade bd-example-modal-sm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog modal-sm\">\n");
      out.write("                  <div class=\"modal-content\">\n");
      out.write("                    ...\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("        <!---------------***//formulario de registrar personal***------------->\n");
      out.write("      \n");
      out.write("       <!-- ventana modal cuando hay advertencias de campos obligatorios -->\n");
      out.write("             \n");
      out.write("           ");
 if(val==0 || val==1){
      out.write("\n");
      out.write("              <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\">\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                      <div class=\"modal-content MO\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                          <h4 class=\"modal-title\"  id=\"exampleModalLabel\">Aviso</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <span id=\"BodyText\">\n");
      out.write("                               ");
      out.print(Mensaje);
      out.write("\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                    </div> \n");
      out.write("              </div>\n");
      out.write("           ");
 val=-1;}
      out.write("\n");
      out.write("        <!--//ventana modal cuando hay advertencias de campos obligatorios-->   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       </div>  \n");
      out.write("        \n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/Footer.jsp", out, false);
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/LibFooter.jsp", out, false);
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
