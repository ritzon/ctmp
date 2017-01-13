// JavaScript Document
function ValidarDatos()
	{
		var contador = 0;
			
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
			var DP_NacProv = document.getElementById("cboPostProvin");
			var DP_ResDpto = document.getElementById("cboPostResDeparto");
			var DP_ResProv = document.getElementById("cboPostResProvin");
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
			
		
			if($("#txtNacDistrito").val()=="")
			{
				contador = contador + 1;
				DP_NacDistrito.style.background="#FFDDDD";			
			}
			if($("#cboPostCondActual").val()=="")
			{
				contador = contador + 1;
				DL_CondActual.style.background="#FFDDDD";			
			}
			 
			
			
			if(contador==0)
			{
				alert("es");
				DL_CondActual.style.background="#FFFFFF";
				DP_NacDistrito.style.background="#FFFFFF";	
			}else
			{ 
				
				return false;
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
			var DP_NacProv = document.getElementById("cboPostProvin");	

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
