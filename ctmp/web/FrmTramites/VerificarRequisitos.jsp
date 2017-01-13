<%@page import="pe.systemslab.ctmp.entidad.EntidadVerifReq"%>
<%@page import="pe.systemslab.ctmp.negocio.NegocioPostulante"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="pe.systemslab.ctmp.negocio.NegocioVerificarRequisito"%>
<%@ page language="java" pageEncoding="UTF-8" session="false"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="../utilitarios/LibHeader.jsp"></jsp:include>
            <title>CTMP</title>
            <script src="../Library/plugins/Jquery/jquery-3.1.1.min.js"></script> 
            <script type="text/javascript">
                /*var obs1 = document.getElementById("observacion1");
              
                 $(document).ready(function()
                 { 
                 $("#chkVerificar1").click(function()
                 {
                 if($("#chkVerificar1").val()=="")
                 {
              
              
                 }
                 else
                 {
                 alert("ok");
                 obs1.disabled=true;
                 }
                 });
              
              
              
                 });*/
            </script>

        </head>

        <body class="no-skin">
        <jsp:include page="../utilitarios/Header.jsp"></jsp:include>      
            <div class="main-container" id="main-container">       
            <jsp:include page="../utilitarios/SideBar.jsp"></jsp:include>
            <%
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
                        if (!valCodReq9.equalsIgnoreCase("9")) {
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


            %>  
            <!---------------***formulario de verificar requisitos***------------->
            <div class="main-content">
                <div class="main-content-inner">
                    <br>


                    <div class="form-group" align="center" >
                        <p><h3><strong>Verificar Requisito del Postulante:</strong></h3></p>
                    </div>
                    <form id="BuscarPostulante" class="form-horizontal" method="GET">
                        <br>
                        <div class="form-group">


                            <div class="col-md-3 col-md-offset-1">
                                <input class="form-control" type="text" name="dni" id="dni" placeholder="Ingresar DNI" required="required" value = "">
                            </div>
                            <div class="col-md-4" >
                                <button type="submit" onclick="" class="btn btn-primary" name="buscar" id="buscar" >Buscar</button>
                            </div>

                        </div>
                    </form>
                    <br>
                    <br>
                    <script src="../Library/plugins/UtilSystem/js/VerificarReq.js"></script>

                    <form id="VerificarRequisitos" name="VerificarRequisitos" class="form-horizontal" method="post" action="VerificarRequisitos.jsp">


                        <div class="form-group">

                            <label for="lblCodPost" class="control-label col-md-3 col-lg-2 col-lg-offset-1">Codigo Postulante:</label>
                            <div class="col-md-2 col-lg-1">
                                <input class="form-control" type="text" name="codPost" id="txtCodPostu" required="required" disabled="true" value = "<%=codPost%>">
                            </div>
                            <!-- para enviar datos -->
                            <input type="hidden" name="codPost" value = "<%=codPost%>">
                            <label for="lblNroDni" class="control-label col-md-3 col-lg-2">Nro Documento:</label>
                            <div class="col-md-2 col-lg-2">
                                <input class="form-control" type="text" name="dni" id="txtPostNumDoc" required="required" disabled="true" value = "<%=dni%>">

                            </div>
                        </div> 
                        <div class="form-group">
                            <label for="lblNomApel" class="control-label col-md-2 col-lg-2 col-lg-offset-1">Nombres y Apellidos:</label>
                            <div class="col-md-3 col-lg-5">
                                <input class="form-control" type="text" name="Nombre" id="txtNomApell" required="required" disabled="true" value = "<%=Nombres%>">

                                <p> 
                                </p>                    
                            </div>
                        </div>
                        <div class="form-group" align="center">
                            <div class="col-md-7 col-lg-9 col-lg-offset-2">
                                <table width="100" align="center" border="1" id="tbVerificarRq" class="table table-bordered">
                                    <thead>
                                    <th  class="col-md-2 col-lg-2">Cod Requisito</th>
                                    <th class="col-md-6 col-lg-7">Descripción</th>
                                    <th class="col-md-3 col-lg-1">Verificar</th>
                                    <th class="col-md-3 col-lg-2">Estado de Documento</th>
                                    </thead>
                                    <tbody>
                                        <%

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
                                        %>

                                        <tr >
                                            <td align="center"> <%= rs.getString("CodRequisito")%>
                                                <input type="hidden" name="<%=codRe%>" id="<%=codRe%>" value="<%= rs.getString("idRequisito")%>">
                                            </td>
                                            <td><%= rs.getString("Nombre")%></td>
                                            <td align="center"><input type="checkbox" name="<%=chbk%>" id="<%=chbk%>" checked="true" ></td>
                                            <td align="center"><input type="text" name="<%=obs%>" id="<%=obs%>"></td>
                                        </tr>

                                        <%}
                                    rs.close();%>


                                    </tbody>
                                </table>
                            </div>
                        </div>

                        <div class="form-group">
                            <label  for="txtFechaCurso" class="control-label col-md-3">FechaCurso</label>
                            <div class="col-md-1 col-lg-2">
                                <input id="txtFechaCurso"  type="text" name="FechaCurso" class="form-control" value="<%=codPos2%>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label  for="lbObservacion" class="control-label col-md-3">Observación</label>
                            <div class="col-md-1">
                                <input id="chbxObservacion"  type="checkbox" onclick="">
                            </div>
                        </div>



                        <!--Botones-->
                        <div class="form-group">
                            <br>
                            <div class="col-md-4" align="center"  >
                                <button type="submit" onclick="" class="btn btn-primary" name="btnValidar" id="btnValidar" >Validar</button>
                                <button type="submit" class="btn btn-primary" onclick="" id="btnCancelar">Cancelar</button>       
                                <button type="button" class="btn btn-primary" onclick="Checks()" name="btnLimpiar" id="btnLimpiar">Limpiar</button>

                            </div>
                        </div>
                        <!--//Botones-->

                        <!--Ventana modal Buscar Postulante-->
                        <!-- <div class="modal fade" id="modalBusPost" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"> -->
                        <div class="modal fade" id="modalBusPost" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content ">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="exampleModalLabel">Mensaje</h4>
                                    </div>
                                    <div class="modal-body">

                                        <div class="container">
                                            <p align="left">  <strong>se registro correctamente</strong> </p>
                                        </div> 
                                    </div>
                                    <div class="modal-footer">


                                    </div>

                                </div>
                            </div> 
                        </div>
                        <!--//Ventana modal Buscar Postulante-->

                    </form>



                </div>
            </div>
            <!---------------***//formulario de verificar requisitos***------------->
            <jsp:include page="../utilitarios/Footer.jsp"></jsp:include>
            </div>
        <jsp:include page="../utilitarios/LibFooter.jsp"></jsp:include>
    </body>
</html>