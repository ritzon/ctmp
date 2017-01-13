<%-- 
    Document   : RegistrarPersonal
    Created on : 07/01/2017, 02:40:40 PM
    Author     : Laravel
--%>
<%@page import="pe.systemslab.ctmp.entidad.EntidadPersonal"%>
<%@page import="pe.systemslab.ctmp.entidad.EntidadUsuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="pe.systemslab.ctmp.negocio.NegocioPersonal"%>
<%@page import="pe.systemslab.ctmp.negocio.NegocioUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../utilitarios/LibHeader.jsp"></jsp:include>
        <title>JSP Page</title>
        <script src="../Library/plugins/Jquery/jquery-3.1.1.min.js"></script> 
       <script type="text/javascript">
           var dni = document.getElementById("Dni");
           
            $(document).ready(function()
            {
                /*$("#registrar").click(function()
                {
                    $("#myModal").modal("show");
                });*/
                
                   $("#myModal").modal("show");
               
            });
         </script>
       
    </head>
    
    
    <body class="no-skin">
         <jsp:include page="../utilitarios/Header.jsp"></jsp:include>      
    <div class="main-container" id="main-container">
        <jsp:include page="../utilitarios/SideBar.jsp"></jsp:include>
       
     
        <% /*declaramos entidades*/
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
                  Mensaje= Mensaje + "<p>usuario: <strong> "+nombre.trim().toLowerCase().replace(" ", "").substring(0, 1)+Ap.trim().toLowerCase().replace(" ", "")+"</strong></p>";
                  Mensaje= Mensaje + "<p>contraseña: <strong>"+dni.trim()+"</strong>.</p>";
             }
             else 
             {
                 val=1;
                 Mensaje="<p>el Dni:"+dni + " ya se encuentra registrado.</p>";
             }
            
                 
         }
        %>
        <!---------------***formulario de registrar personal***------------->
        <div class="container">
           <div class="row">
               <div class="col-md-8 col-md-offset-2">
                   <div class="panel panel-default">

                       <div class="panel-heading"><h3><strong>Registrar Personal</strong></h3></div>
                       <div class="panel-body">
                           <form class="form-horizontal" role="form" method="POST" action="RegistrarPersonal.jsp" name="RegistrarPesonal" id="RegistrarPesonal">


                               <div class="form-group">
                                   <label for="Dni" class="col-md-4 control-label">Dni</label>

                                   <div class="col-md-6">
                                       <input type="text" class="form-control" id="Dni" name="Dni" value="" required autofocus>


                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="email" class="col-md-4 control-label">Nombres</label>

                                   <div class="col-md-6">
                                       <input id="Nombres" type="text" class="form-control" name="Nombres" value="" required>


                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="password" class="col-md-4 control-label">Apellido Paterno</label>

                                   <div class="col-md-6">
                                       <input id="password" type="text" class="form-control" name="Ap" required>

                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="txtAm" class="col-md-4 control-label">Apellido Materno</label>

                                   <div class="col-md-6">
                                       <input id="txtAm" type="text" class="form-control" name="Am" required>
                                   </div>
                               </div>
                               
                              

                               <div class="form-group">
                                   <label for="Genero" class="col-md-4 control-label">Género</label>

                                   <div class="col-md-6">
                                      <select id="Genero" class="form-control" name="Genero" required="required">
                                       <option value="Femenino">Femenino</option>
                                       <option value="Masculino">Masculino</option>
                                   </select>
                                   </div>
                               </div>
                                <div class="form-group">
                                   <label for="Region" class="col-md-4 control-label">Región</label>

                                   <div class="col-md-6">
                                       <!--<input id="Region" type="text" class="form-control" name="Region" required>-->
                                       <select name="Region" id="Region" class="form-control" required="required">
                                       <% 
                                            ResultSet rs;
                                            rs=miNegocio.ListarRegiones();
                                            while (rs.next()){
                                       %>
                                           <option value="<%=rs.getInt("idRegion")%>"><%=rs.getString("Region")%></option>
                                        <% }%>
                                       </select>
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label for="Cargo" class="col-md-4 control-label">Cargo</label>

                                   <div class="col-md-6">
                                   <select id="Cargo" class="form-control" name="Cargo" required="required">
                                        <% ResultSet rs1; 
                                           rs1= miNegocio.ListarCargos();
                                            while (rs1.next()){
                                        %>
                                       <option value="<%=rs1.getInt("idCargo")%>"><%=rs1.getString("NomCargo")%></option>
                                        <% }%>
                                   </select>
                                      <!--  <input id="password-confirm" type="password" class="form-control" name="password_confirmation" required> -->
                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="Telefono" class="col-md-4 control-label">Teléfono</label>

                                   <div class="col-md-6">
                                       <input id="Telefono" type="text" class="form-control" name="Telefono" >
                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="Correo" class="col-md-4 control-label">Correo</label>

                                   <div class="col-md-6">
                                       <input id="Correo" type="text" class="form-control" name="Correo" placeholder="example@ctmp.com" >
                                   </div>
                               </div>

                               <div class="form-group">
                                   <label for="Direccion" class="col-md-4 control-label">Dirección</label>

                                   <div class="col-md-6">
                                       <input id="Direccion" type="text" class="form-control" name="Direccion" required>
                                   </div>
                               </div>


                               <div class="form-group">
                                   <div class="col-md-6 col-md-offset-4">
                                       <button type="submit" name="registrar" id="registrar" class="btn btn-primary">
                                           Registrar
                                       </button>
                                   </div>
                                   
                                  
                               </div>

                           </form>
                       </div>
                   </div>
               </div>
                                   
            
          
        <!---------------***//formulario de registrar personal***------------->
      
       <!-- ventana modal cuando hay advertencias de campos obligatorios -->
             
           <% if(val==0 || val==1){%>
              <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                    <div class="modal-dialog" role="document">
                      <div class="modal-content MO">
                        <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                          <h4 class="modal-title"  id="exampleModalLabel">Aviso</h4>
                        </div>
                        <div class="modal-body">
                            <span id="BodyText">
                               <%=Mensaje%>
                            </span>
                        </div>

                      </div>
                    </div> 
              </div>
           <% val=-1;}%>
        <!--//ventana modal cuando hay advertencias de campos obligatorios-->   
        
        
       </div>  
        
      <jsp:include page="../utilitarios/Footer.jsp"></jsp:include>
      
    </div>
         <jsp:include page="../utilitarios/LibFooter.jsp"></jsp:include>
    </body>
</html>
