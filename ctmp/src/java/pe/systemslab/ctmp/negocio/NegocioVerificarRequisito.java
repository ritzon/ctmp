/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.negocio;

import pe.systemslab.ctmp.datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.systemslab.ctmp.entidad.EntidadVerifReq;

/**
 *
 * @author Laravel
 */
public class NegocioVerificarRequisito 
{
    public NegocioVerificarRequisito()
    {
        
    }
    private Connection cnn= null;
    public ResultSet ObtenerRequisitos()
    { 
        
        Conexion miConexion = new Conexion();
        try 
        {
           
            cnn = miConexion.GetConexion();
            String sql = "select idRequisito,CodRequisito,Nombre from Requisitos where CodBaja=0;";
            Statement st;
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            return rs;
            
           
        } 
       
        catch (SQLException ex) 
        {
            try {
                Logger.getLogger(NegocioVerificarRequisito.class.getName()).log(Level.SEVERE, null, ex);
                cnn.close();
                miConexion.GetConexion().close();
                
            } catch (SQLException ex1) {
                Logger.getLogger(NegocioVerificarRequisito.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return null;
        }
       
    }

    public void GuardarRequisitosOK(EntidadVerifReq vr)
    {
        
        try {
            Conexion micnn = new Conexion();
            cnn = micnn.GetConexion();
            String sql="Insert into postulante_requisitos(EstadoDocumento,chbObs,idPersonal,idRequisito,idPostulante)"+
                    " values('"+vr.getEstDoc()+ "',"+vr.getCheckObs() +","+vr.getIdPersonal()+
                    "," +vr.getIdRequisito() + "," +vr.getIdPostulante()+ ");";
            Statement  st;
            st = cnn.createStatement();
            st.execute(sql);
            cnn.close();
            micnn.GetConexion().close();
        } catch (SQLException ex) {
            System.out.println("rsv: "+ex.toString());
            Logger.getLogger(NegocioVerificarRequisito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
