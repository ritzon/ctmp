// JavaScript Document


		 function AgregarCorreos(){
       // $("#add").click(function(){
            // Obtenemos el numero de columnas (td) que tiene la primera columna
            // (tr) del id "tabla"
			var Correos = document.getElementById("txtPostDPCorreos");
			//var Telefono = document.getElementById("txtPostDPNumTelefono");
			
			if(Correos.value == "")
			{
				
				Correos.style.background="#FFDDDD";
			}
			else
			{
			   var tds=$("#tbPostCorreos thead:first th").length;
			//alert(tds.toString());
            // Obtenemos el total de filas (tr) del id "tabla"
				var trs=$("#tbPostCorreos tr").length;
				var nuevaFila="<tr>";
           /* for(var i=0;i<tds;i++){
                // añadimos las columnas
                nuevaFila+="<td>columna "+(i+1)+" "+ TipoTelefono.value+" Añadida con jquery</td>";
            }*/
			 nuevaFila +="<td align='center'> " + trs + "</td>";
			 nuevaFila +="<td align='center'> " + Correos.value + "</td>";
			 //nuevaFila +="<td align='center'> " + Telefono.value + "</td>";
			
            // Añadimos una columna con el numero total de columnas.
            // Añadimos uno al total, ya que cuando cargamos los valores para la
            // columna, todavia no esta añadida
           // nuevaFila+="<td>"+(trs+1)+" columnas </td>";
            nuevaFila+="</tr>";
            $("#tbPostCorreos").append(nuevaFila);
			Correos.style.background="#FFFFFF";
			Correos.value="";
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
