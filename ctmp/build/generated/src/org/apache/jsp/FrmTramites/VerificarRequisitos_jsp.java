package org.apache.jsp.FrmTramites;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pe.systemslab.ctmp.entidad.EntidadVerifReq;
import pe.systemslab.ctmp.negocio.NegocioPostulante;
import java.sql.ResultSet;
import pe.systemslab.ctmp.negocio.NegocioVerificarRequisito;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/LibHeader.jsp", out, false);
      out.write("\n");
      out.write("            <title>CTMP</title>\n");
      out.write("            <script src=\"../Library/plugins/Jquery/jquery-3.1.1.min.js\"></script> \n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                /*var obs1 = document.getElementById(\"observacion1\");\n");
      out.write("              \n");
      out.write("                 $(document).ready(function()\n");
      out.write("                 { \n");
      out.write("                 $(\"#chkVerificar1\").click(function()\n");
      out.write("                 {\n");
      out.write("                 if($(\"#chkVerificar1\").val()==\"\")\n");
      out.write("                 {\n");
      out.write("              \n");
      out.write("              \n");
      out.write("                 }\n");
      out.write("                 else\n");
      out.write("                 {\n");
      out.write("                 alert(\"ok\");\n");
      out.write("                 obs1.disabled=true;\n");
      out.write("                 }\n");
      out.write("                 });\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                 });*/\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"no-skin\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/Header.jsp", out, false);
      out.write("      \n");
      out.write("            <div class=\"main-container\" id=\"main-container\">       \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/SideBar.jsp", out, false);
      out.write("\n");
      out.write("            ");

                NegocioVerificarRequisito miRequisito = new NegocioVerificarRequisito();
                EntidadVerifReq evr = new EntidadVerifReq();
                NegocioPostulante negpost = new NegocioPostulante();
                boolean buscar = false;
                boolean registrar = false;
                boolean limpiar = false;
                String dni = "";
                String codPost = "";
                String codPos2 = "";
                String Nombres = "";

                if (request.getParameter("buscar") != null) {
                    buscar = true;
                }
                if (request.getParameter("btnValidar") != null) {
                    registrar = true;
                }
                if (request.getParameter("btnLimpiar") != null) {
                    limpiar = true;
                }

                if (buscar) {
                    dni = request.getParameter("dni");
                    negpost.obtenerPostulante(dni);
                    codPost = negpost.obtenerPostulante(dni).getCodPostulante();
                    Nombres = negpost.obtenerPostulante(dni).getNombre() + ", " + negpost.obtenerPostulante(dni).getAp()
                            + " " + negpost.obtenerPostulante(dni).getAm();
                }
                if (limpiar) {

                    codPos2 = request.getParameter("chkVerificar1");
                }

                if (registrar) {
                    int con = 0;
                    int chkobserv = 0;
                    for (int i = 1; i < 11; i++) {

                        String chb = "";
                        String codReq2 = "";
                        String valCodReq9="";
                        chb = "chkVerificar" + i;
                        codReq2 = "CodRequisito" + i;
                        valCodReq9 = request.getParameter(codReq2);
                        if (valCodReq9 != "9") {
                            if (request.getParameter(chb) == null) {
                                con = con + 1;
                            }
                        } else {
                            if (request.getParameter(chb) == null) {
                                chkobserv = 1;
                            }

                        }

                    }
                    if (con == 0) {
                        for (int i = 1; i < 11; i++) {
                            String obs = "";
                            String chb = "";
                            String codReq = "";
                            codReq = "CodRequisito" + i;
                            obs = "observacion" + i;
                            chb = "chkVerificar" + i;

                            if (i == 9) {
                                evr.setCheckObs(chkobserv);
                            } else {
                                evr.setCheckObs(0);
                            }

                            evr.setIdRequisito(Integer.parseInt(request.getParameter(codReq)));
                            evr.setIdPersonal(1);
                            evr.setIdPostulante(1);

                            evr.setEstDoc(request.getParameter(obs));
                            //evr.setEstDoc("ok");
                            miRequisito.GuardarRequisitosOK(evr);
                        }
                    }

                }


            
      out.write("  \n");
      out.write("            <!---------------***formulario de verificar requisitos***------------->\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"main-content-inner\">\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\" align=\"center\" >\n");
      out.write("                        <p><h3><strong>Verificar Requisito del Postulante:</strong></h3></p>\n");
      out.write("                    </div>\n");
      out.write("                    <form id=\"BuscarPostulante\" class=\"form-horizontal\" method=\"GET\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-3 col-md-offset-1\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"dni\" id=\"dni\" placeholder=\"Ingresar DNI\" required=\"required\" value = \"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\" >\n");
      out.write("                                <button type=\"submit\" onclick=\"\" class=\"btn btn-primary\" name=\"buscar\" id=\"buscar\" >Buscar</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <script src=\"../Library/plugins/UtilSystem/js/VerificarReq.js\"></script>\n");
      out.write("\n");
      out.write("                    <form id=\"VerificarRequisitos\" name=\"VerificarRequisitos\" class=\"form-horizontal\" method=\"post\" action=\"VerificarRequisitos.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <label for=\"lblCodPost\" class=\"control-label col-md-3 col-lg-2 col-lg-offset-1\">Codigo Postulante:</label>\n");
      out.write("                            <div class=\"col-md-2 col-lg-1\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"codPost\" id=\"txtCodPostu\" required=\"required\" disabled=\"true\" value = \"");
      out.print(codPost);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- para enviar datos -->\n");
      out.write("                            <input type=\"hidden\" name=\"codPost\" value = \"");
      out.print(codPost);
      out.write("\">\n");
      out.write("                            <label for=\"lblNroDni\" class=\"control-label col-md-3 col-lg-2\">Nro Documento:</label>\n");
      out.write("                            <div class=\"col-md-2 col-lg-2\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"dni\" id=\"txtPostNumDoc\" required=\"required\" disabled=\"true\" value = \"");
      out.print(dni);
      out.write("\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"lblNomApel\" class=\"control-label col-md-2 col-lg-2 col-lg-offset-1\">Nombres y Apellidos:</label>\n");
      out.write("                            <div class=\"col-md-3 col-lg-5\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"Nombre\" id=\"txtNomApell\" required=\"required\" disabled=\"true\" value = \"");
      out.print(Nombres);
      out.write("\">\n");
      out.write("\n");
      out.write("                                <p> \n");
      out.write("                                </p>                    \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" align=\"center\">\n");
      out.write("                            <div class=\"col-md-7 col-lg-9 col-lg-offset-2\">\n");
      out.write("                                <table width=\"100\" align=\"center\" border=\"1\" id=\"tbVerificarRq\" class=\"table table-bordered\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th  class=\"col-md-2 col-lg-2\">Cod Requisito</th>\n");
      out.write("                                    <th class=\"col-md-6 col-lg-7\">Descripción</th>\n");
      out.write("                                    <th class=\"col-md-3 col-lg-1\">Verificar</th>\n");
      out.write("                                    <th class=\"col-md-3 col-lg-2\">Estado de Documento</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");


                                            ResultSet rs = miRequisito.ObtenerRequisitos();
                                            int Cnt = 0;
                                            String codRe = "";
                                            String obs = "";
                                            String chbk = "";
                                            while (rs.next()) {
                                                Cnt = Cnt + 1;
                                                codRe = "CodRequisito" + Cnt;
                                                obs = "observacion" + Cnt;
                                                chbk = "chkVerificar" + Cnt;
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <tr >\n");
      out.write("                                            <td align=\"center\"> ");
      out.print( rs.getString("CodRequisito"));
      out.write("\n");
      out.write("                                                <input type=\"hidden\" name=\"");
      out.print(codRe);
      out.write("\" id=\"");
      out.print(codRe);
      out.write("\" value=\"");
      out.print( rs.getString("idRequisito"));
      out.write("\">\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>");
      out.print( rs.getString("Nombre"));
      out.write("</td>\n");
      out.write("                                            <td align=\"center\"><input type=\"checkbox\" name=\"");
      out.print(chbk);
      out.write("\" id=\"");
      out.print(chbk);
      out.write("\" checked=\"true\" ></td>\n");
      out.write("                                            <td align=\"center\"><input type=\"text\" name=\"");
      out.print(obs);
      out.write("\" id=\"");
      out.print(obs);
      out.write("\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
}
                                    rs.close();
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label  for=\"txtFechaCurso\" class=\"control-label col-md-3\">FechaCurso</label>\n");
      out.write("                            <div class=\"col-md-1 col-lg-2\">\n");
      out.write("                                <input id=\"txtFechaCurso\"  type=\"text\" name=\"FechaCurso\" class=\"form-control\" value=\"");
      out.print(codPos2);
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label  for=\"lbObservacion\" class=\"control-label col-md-3\">Observación</label>\n");
      out.write("                            <div class=\"col-md-1\">\n");
      out.write("                                <input id=\"chbxObservacion\"  type=\"checkbox\" onclick=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--Botones-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"col-md-4\" align=\"center\"  >\n");
      out.write("                                <button type=\"submit\" onclick=\"\" class=\"btn btn-primary\" name=\"btnValidar\" id=\"btnValidar\" >Validar</button>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" onclick=\"\" id=\"btnCancelar\">Cancelar</button>       \n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" onclick=\"Checks()\" name=\"btnLimpiar\" id=\"btnLimpiar\">Limpiar</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--//Botones-->\n");
      out.write("\n");
      out.write("                        <!--Ventana modal Buscar Postulante-->\n");
      out.write("                        <!-- <div class=\"modal fade\" id=\"modalBusPost\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"> -->\n");
      out.write("                        <div class=\"modal fade\" id=\"modalBusPost\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\">\n");
      out.write("                            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                <div class=\"modal-content \">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                                        <h4 class=\"modal-title\" id=\"exampleModalLabel\">Mensaje</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <p align=\"left\">  <strong>se registro correctamente</strong> </p>\n");
      out.write("                                        </div> \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        <!--//Ventana modal Buscar Postulante-->\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!---------------***//formulario de verificar requisitos***------------->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/Footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../utilitarios/LibFooter.jsp", out, false);
      out.write("\n");
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
