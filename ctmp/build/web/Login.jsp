<%-- 
    Document   : Login
    Created on : 28/12/2016, 05:35:35 PM
    Author     : Laravel
--%>

<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html lang="es">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		
		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="Library/css/bootstrap.min.css" />
		<link rel="stylesheet" href="Library/font-awesome/4.2.0/css/font-awesome.min.css" />
		<!-- text fonts -->
		<link rel="stylesheet" href="Library/fonts/fonts.googleapis.com.css" />
		<!-- ace styles -->
		<link rel="stylesheet" href="Library/css/ace.min.css" />
		<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="Library/css/ace-rtl.min.css" />	
		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
            <script type="text/javascript" src="Library/plugins/Jquery/jquery-3.1.1.min.js"></script> 
            <script type="text/javascript" src="Library/plugins/Bootstrap/css/bootstrap.min.css"></script>
            <script type="text/javascript" src="Library/plugins/Bootstrap/js/bootstrap.min.js"></script>
        <title>Login Page - Ace Admin</title>
        <script >
           $(document).ready(function()
           {
              
              
            
                $("#ValidarUsuario").submit(function()
                 {
                     
                    $.post("ValidarUsuario",$("#ValidarUsuario").serialize(),function(data)
                    {
                        perfil = jQuery.trim(data);
                       
                    if(perfil == "1") document.location.href = "index.jsp";
                    else if(perfil == "Nok") $("#mensaje-ingreso").html("<h1>Usuario o clave no valido</h1>");
                    else $("#mensaje-ingreso").html("<h1>Error en la conexion</h1>");
                    });

                    return false;
                 });
            });
        </script>
                
	</head>
	<body class="login-layout light-login"> <!-- fondo de la pagina   -->
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
									<i class="ace-icon fa fa-bolt green"></i>
									<span class="red">Colegio Tecnólogo Médico del Perú</span>
								</h1>
								<!-- <h4 class="blue" id="id-company-text">&copy; GoFact</h4>  -->
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee green"></i>
												Por favor ingrese sus datos
											</h4>
											<div class="space-6"></div>

                    <form class="form-horizontal" method="POST" action="ValidarUsuario" id="ValidarUsuario" name="ValidarUsuario">                 
                        <div class="form-group">                          
                            <label for="usuario" class="col-md-4 control-label">Usuario</label>
                            <div class="col-md-6">
                                <input id="usuario" type="text" class="form-control" name="usuario" value="" required autofocus>
                                    <span class="help-block">                             
                                    </span>
                            </div>
                        </div> 

                        <div class="form-group">
                            <label for="pass" class="col-md-4 control-label">Contraseña</label>

                            <div class="col-md-6">
                                <input id="pass" type="password" class="form-control" name="pass" required>
                                    <span class="help-block">
                                       
                                    </span>
                            </div>
                         </div>   

                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-4">
                                <!-- <button type="submit" class="btn btn-primary">
                                    Acceder
                                </button> -->
                               <!-- <a type="sumbit" id="acceder" name="acceder"  class="btn btn-primary"> Acceder</a>-->
                                <input type="submit" value="Ingresar"  name="Ingresar" />
                            </div>
                        </div>
                    </form>
                    <div id="mensaje-ingreso"></div>
                                                                                        
                    
                                                    <!--
    													<label class="block clearfix">
    														<span class="block input-icon input-icon-right">
    															<input type="email" id="email" class="form-control" placeholder="Email" value="{{ old('email') }}" required autofocus />
                                                              
    															<i class="ace-icon fa fa-user"></i>
    														</span>
    													</label>
                                                    
                                                    
    													<label class="block clearfix">
    														<span class="block input-icon input-icon-right">
    															<input type="password" id="password" class="form-control" placeholder="Password" required/>
                                                          
    															<i class="ace-icon fa fa-lock"></i>
    														</span>
    													</label>
                                                   

													<div class="space"></div>

													<div class="clearfix">
                                                        <div class="form-group">
															<button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
																	<i class="ace-icon fa fa-key"></i>
																	<span class="bigger-110" >Login</span>	
															</button>
                                                        </div>
													</div>

													<div class="space-4"></div>
													-->

											<div class="social-or-login center">
												<span class="bigger-110"></span>
											</div>
											<div class="space-6"></div>
										</div><!-- /.widget-main -->

										<div class="toolbar clearfix">
											<div>
											<div>												
											</div>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->
								

								
							</div><!-- /.position-relative -->
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="Library/js/jquery.2.1.1.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) 
                        {
			 $(document).on('click', '.toolbar a[data-target]', function(e) {
				e.preventDefault();
				var target = $(this).data('target');
				$('.widget-box.visible').removeClass('visible');//hide others
				$(target).addClass('visible');//show target
			 });
			});						
		</script>
	</body>
</html>
