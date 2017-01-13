// JavaScript Document
function ValidarDatos()
	{
		var contador = 0;
		var Mensaje ="";
			
			/*Datos Personales*/
			
			var DP_TipoDoc = document.getElementById("cboPostTipoDoc");
			var DP_NumDoc = document.getElementById("txtPostNumDoc");
			var DP_Nombres = document.getElementById("txtPostNombres");
			var DP_AP = document.getElementById("txtPostAp");
			var DP_AM= document.getElementById("txtPostAm");		
			var DP_Genero = document.getElementById("cboPostDPGenero");
			var DP_GSanguineo = document.getElementById("txtPostDPGSanguineo");
			var DP_Region = document.getElementById("cboPostDPRegion");
			var DP_FechaNac = document.getElementById("dPostFechNac");
			var DP_EstCivil= document.getElementById("cboPostEstaCivil");		
			var DP_NacDpto = document.getElementById("cboPostDeparto");
			var DP_NacDistrito = document.getElementById("txtNacDistrito");
			var DP_NacProv = document.getElementById("txtPostProvin");
			var DP_ResDpto = document.getElementById("cboPostResDeparto");
			var DP_ResProv = document.getElementById("txtPostResProvin");
			var DP_ResDistrito = document.getElementById("txtResDistrito");
			var DP_Direccion= document.getElementById("txtPostDireccion");	
			
			/*Datos Academicos*/
			var DA_FechBach = document.getElementById("dPostFechBach");
			var DA_FechIniCar = document.getElementById("dPostFechIniCar");
			var DA_FechFinCar = document.getElementById("dPostFechFinCar");
			var DA_Titulo = document.getElementById("cboPostTitulo");
			var DA_FechTitula = document.getElementById("dPostFechTitula");
			var DA_Univers= document.getElementById("cboPostUniversidad");	
			var DA_Especiali = document.getElementById("cboPostEspecialid");
			
			/*Datos Laborales*/
			var DL_CondActual = document.getElementById("cboPostCondActual");			
			var DL_Empresa = document.getElementById("txtPostEmpresa");
			var DL_DctoPlanillaSi = document.getElementById("rdbtnPostdsctSi");
			var DL_DctoPlanillaNo = document.getElementById("rdbtnPostdsctNo");
			var DL_NroPlanilla = document.getElementById("txtPostNroPlanilla");
			var DL_LaboraPublico = document.getElementById("rdbtnPostPublico");
			var DL_SectorPublic= document.getElementById("cboPostSPublic");	
			
		    /*validar datos personales*/
			if($("#txtPostNumDoc").val()=="")
			{
				contador = contador + 1; DP_NumDoc.style.background="#FFDDDD";			
			}else
			{DP_NumDoc.style.background="#FFFFFF";}

			if($("#txtPostNombres").val()=="")
			{
				contador = contador + 1; DP_Nombres.style.background="#FFDDDD";			
			}else
			{DP_Nombres.style.background="#FFFFFF";}

			if($("#txtPostAp").val()=="")
			{
				contador = contador + 1; DP_AP.style.background="#FFDDDD";			
			}else
			{DP_AP.style.background="#FFFFFF";}

			if($("#txtPostAm").val()=="")
			{
				contador = contador + 1; DP_AM.style.background="#FFDDDD";			
			}else
			{DP_AM.style.background="#FFFFFF";}

			if($("#cboPostDPGenero").val()=="")
			{
				contador = contador + 1; DP_Genero.style.background="#FFDDDD";			
			}else
			{DP_Genero.style.background="#FFFFFF";}

			if($("#txtPostDPGSanguineo").val()=="")
			{
				contador = contador + 1; DP_GSanguineo.style.background="#FFDDDD";			
			}else
			{DP_GSanguineo.style.background="#FFFFFF";}

			if($("#cboPostDPRegion").val()=="")
			{
				contador = contador + 1; DP_Region.style.background="#FFDDDD";			
			}else
			{DP_Region.style.background="#FFFFFF";}


			if($("#dPostFechNac").val()=="")
			{
				contador = contador + 1; DP_FechaNac.style.background="#FFDDDD";			
			}else
			{DP_FechaNac.style.background="#FFFFFF";}

			if($("#cboPostEstaCivil").val()=="")
			{
				contador = contador + 1; DP_EstCivil.style.background="#FFDDDD";			
			}else
			{DP_EstCivil.style.background="#FFFFFF";}

			if($("#cboPostResDeparto").val()=="")
			{
				contador = contador + 1; DP_ResDpto.style.background="#FFDDDD";			
			}else
			{DP_ResDpto.style.background="#FFFFFF";}


			if($("#txtPostResProvin").val()=="")
			{
				contador = contador + 1; DP_ResProv.style.background="#FFDDDD";			
			}else
			{DP_ResProv.style.background="#FFFFFF";}


			if($("#txtResDistrito").val()=="")
			{
				contador = contador + 1; DP_ResDistrito.style.background="#FFDDDD";			
			}else
			{DP_ResDistrito.style.background="#FFFFFF";}

			if($("#txtPostDireccion").val()=="")
			{
				contador = contador + 1; DP_Direccion.style.background="#FFDDDD";			
			}else
			{DP_Direccion.style.background="#FFFFFF";}
			 
			if(contador==0)
			{
				
			}else
			{ 
				Mensaje="Falta Completar campos obligatorios en Datos Personales ";
				
			}
			contador==0 ;

			if($("#dPostFechBach").val()=="")
			{
				contador = contador + 1; DA_FechBach.style.background="#FFDDDD";			
			}
			else
			{DA_FechBach.style.background="#FFFFFF";}

			if($("#dPostFechIniCar").val()=="")
			{
				contador = contador + 1; DA_FechIniCar.style.background="#FFDDDD";			
			}
			else
			{DA_FechIniCar.style.background="#FFFFFF";}

			if($("#dPostFechFinCar").val()=="")
			{
				contador = contador + 1; DA_FechFinCar.style.background="#FFDDDD";			
			}
			else
			{DA_FechFinCar.style.background="#FFFFFF";}

			if($("#cboPostTitulo").val()=="")
			{
				contador = contador + 1; DA_Titulo.style.background="#FFDDDD";			
			}
			else
			{DA_Titulo.style.background="#FFFFFF";}

			if($("#dPostFechTitula").val()=="")
			{
				contador = contador + 1; DA_FechTitula.style.background="#FFDDDD";			
			}
			else
			{DA_FechTitula.style.background="#FFFFFF";}

			if($("#cboPostUniversidad").val()=="")
			{
				contador = contador + 1; DA_Univers.style.background="#FFDDDD";			
			}
			else
			{DA_Univers.style.background="#FFFFFF";}
			
			if($("#cboPostEspecialid").val()=="")
			{
				contador = contador + 1; DA_Especiali.style.background="#FFDDDD";			
			}
			else
			{DA_Especiali.style.background="#FFFFFF";}


			if(contador==0)
			{
				
			}else
			{ 
				Mensaje= Mensaje + " Falta Completar campos obligatorios en Datos Academicos ";
				
			}
			contador==0 ;

			if($("#cboPostCondActual").val()=="")
			{
				contador = contador + 1; DL_CondActual.style.background="#FFDDDD";			
			}
			else
			{DL_CondActual.style.background="#FFFFFF";}


			if(Mensaje.length>1)
			{
				alert(Mensaje);
				return false;	
			}else
			{ 	
			}  
	}
	
	function ValRadioBotonesPlanilla()
	{
		//var DL_DctoPlanillaSin = document.getElementById("rdbtnPostdsctSi");
		var DL_DctoPlanillaNo = document.getElementById("rdbtnPostdsctNo");
		var DL_NroPlanilla = document.getElementById("txtPostNroPlanilla");

		
		if(DL_DctoPlanillaNo.checked ==true)
		{
			DL_NroPlanilla.disabled=true;
		}
		else
		{
			DL_NroPlanilla.disabled=false;
		}
		
		
	}
	//cboPostDentSPublic
	function ValRadioBotonesSector()
	{	var DL_LaboraPublico = document.getElementById("rdbtnPostPublico");
		var DL_SectorPublic= document.getElementById("cboPostSPublic");	
		var DL_DentroSecPub= document.getElementById("cboPostDentSPublic");	
		if(DL_LaboraPublico.checked ==true)
		{
			DL_SectorPublic.disabled=false;
			DL_DentroSecPub.disabled=false;
		}
		else
		{
			DL_SectorPublic.disabled=true;
			DL_DentroSecPub.disabled=true;
		}
	}
	
	function ValCheckBoxNacExtra()
	{	var DP_NacExtra = document.getElementById("chbxExtrajera");
		var DP_PaisNac= document.getElementById("cboPostPaisNac");
		    var DP_NacDpto = document.getElementById("cboPostDeparto");
			var DP_NacDistrito = document.getElementById("txtNacDistrito");
			var DP_NacProv = document.getElementById("txtPostProvin");	
			var ejem = document.getElementById("txtPostAm");	

		if(DP_NacExtra.checked ==true)
		{
			DP_PaisNac.disabled=false;
			DP_NacDpto.disabled = true;
			DP_NacProv.disabled = true;
			DP_NacDistrito.disabled = true;
			
		
		}
		else
		{
			DP_PaisNac.disabled=true;
			DP_NacDpto.disabled = false;
			DP_NacProv.disabled = false;
			DP_NacDistrito.disabled = false;
		
		}
	}
