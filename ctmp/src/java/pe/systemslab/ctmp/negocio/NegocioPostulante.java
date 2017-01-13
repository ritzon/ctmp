
package pe.systemslab.ctmp.negocio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.systemslab.ctmp.datos.Conexion;
import pe.systemslab.ctmp.entidad.EntidadPostulante;
public class NegocioPostulante 
{

    public NegocioPostulante() {
    }
    
    private Connection cnn = null;
    public EntidadPostulante obtenerPostulante(String nroDoc)
    {  EntidadPostulante epost = new EntidadPostulante();
        try {
            Conexion miConexion = new Conexion();
            cnn = miConexion.GetConexion();
            String sql = "select codPostulante,TipoDoc,NroDoc,Nombre,Ap,Am from postulante where NroDoc ='"+nroDoc+"' and CodBaja=0;";
            Statement st;
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
           while(rs.next())
           {
              epost.setCodPostulante(rs.getString("codPostulante")); 
              epost.setTipodoc(rs.getString("TipoDoc"));
              epost.setNroDoc(rs.getString("NroDoc"));
              epost.setNombre(rs.getString("Nombre"));
              epost.setAp(rs.getString("Ap"));
              epost.setAm(rs.getString("Am"));

           }
           cnn.close();
           miConexion.GetConexion().close();
           return epost;
            
        } catch (SQLException ex) {
            Logger.getLogger(NegocioPostulante.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
