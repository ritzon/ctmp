// JavaScript Document


		 function AgregarTelefono(){
       // $("#add").click(function(){
            // Obtenemos el numero de columnas (td) que tiene la primera columna
            // (tr) del id "tabla"
			var TipoTelefono = document.getElementById("cboPostTipoTelefono");
			var Telefono = document.getElementById("txtPostDPNumTelefono");
			
			if(TipoTelefono.selectedIndex == 0 || Telefono.value == "" )
			{
				
               if (TipoTelefono.selectedIndex == 0)
               {
                   TipoTelefono.style.background="#FFDDDD";
               } 
               if (Telefono.value == "")
               {
                   Telefono.style.background="#FFDDDD";
               }   
				
			}
			else
			{
			   var tds=$("#tbPostTelefonos thead:first th").length;
			//alert(tds.toString());
            // Obtenemos el total de filas (tr) del id "tabla"
				var trs=$("#tbPostTelefonos tr").length;
				var nuevaFila="<tr>";
           /* for(var i=0;i<tds;i++){
                // añadimos las columnas
                nuevaFila+="<td>columna "+(i+1)+" "+ TipoTelefono.value+" Añadida con jquery</td>";
            }*/
			 nuevaFila +="<td align='center'> " + trs + "</td>";
			 //nuevaFila +="<td align='center'> " + TipoTelefono.value + "</td>";
			 nuevaFila +="<td align='center'> ";
			 nuevaFila +=" <input type='hidden' name='telefonos[]' id='telefonos' value=" + TipoTelefono.value  + ">" + TipoTelefono.value + "</td>";
			 nuevaFila +="<td align='center'> ";
			 nuevaFila +=" <input type='hidden' name='' id='telefonos' value=" + Telefono.value  + ">" + Telefono.value + "</td>";
            // Añadimos una columna con el numero total de columnas.
            // Añadimos uno al total, ya que cuando cargamos los valores para la
            // columna, todavia no esta añadida
           /* nuevaFila+="<td>"+(trs+1)+" columnas </td>";*/
            nuevaFila+="</tr>";
            $("#tbPostTelefonos").append(nuevaFila);
			TipoTelefono.selectedIndex =0;
			TipoTelefono.style.background="#FFFFFF";
			Telefono.value="";
			Telefono.style.background="#FFFFFF";
			}
          
        //});
 
        /**
         * Funcion para eliminar la ultima columna de la tabla.
         * Si unicamente queda una columna, esta no sera eliminada
         */
       /* $("#del").click(function(){
            // Obtenemos el total de columnas (tr) del id "tabla"
            var trs=$("#tabla tr").length;
            if(trs>1)
            {
                // Eliminamos la ultima columna
                $("#tabla tr:last").remove();
            }
		
        });*/
		
		}
