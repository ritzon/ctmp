/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laravel
 */
public class Conexion 
{
    Connection MiConnection = null;
	public Conexion()
	{
		
	}
	
	public Connection GetConexion()
	{
		try
		{
                     Class.forName("com.mysql.jdbc.Driver");
                     String db="jdbc:mysql://localhost:3306/sl_ctmp2";
		 //	Connection MiConnection = DriverManager.getConnection("jdbc:sqlserver://;servername =ISLIMPA0169:1433;instanceName=SQLEXPRESS;databaseName = SL_Farmacia;integratedSecurity=true");
			 MiConnection = DriverManager.getConnection(db,"root","");			
			
		}
		catch( Exception e)
		{
		 System.out.println("Error: " );
		 e.printStackTrace();
		}
		
		return MiConnection;	
	}
        
        public void CerrarConexion()
        {
            try {
                MiConnection.close();
               } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
