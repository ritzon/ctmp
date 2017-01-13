/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.systemslab.ctmp.datos.Conexion;
import pe.systemslab.ctmp.entidad.EntidadUsuario;

/**
 *
 * @author Laravel
 */
public class NegocioUsuario {

    public NegocioUsuario() {

    }

    private Connection cnn = null;

    public String ValidarUsuario(String user, String pass) {
        Conexion miConexion = new Conexion();
        try {

            cnn = miConexion.GetConexion();

            String sql = "select concat(am,' ',Ap,', ',Nombres) as nom from usuarios u "
                    + "inner join personal p on (u.Personal_idPersonal = p.idPersonal) "
                    + "where p.CodBaja = 0 and u.CodBaja=0 and u.Usuario = '" + user + "' and u.Password='" + pass + "'; ";
            Statement st;
            String Nombres = "";
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            if (rs.next()) {
                //return rs.getString("nom");
                Nombres = rs.getString("nom");
                return "1";

            } else {
                return "Nok";
            }

        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        } finally {
            try {
                cnn.close();
                miConexion.GetConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public EntidadUsuario ObtenerNewUsuario(String dni) {
        Conexion miConexion = new Conexion();
        EntidadUsuario usuario = new EntidadUsuario("", "", "", "");
        
        try {

            cnn = miConexion.GetConexion();

            String sql = "  select u.Usuario,u.Password  from personal p"
                    + " inner join usuarios u on (p.idPersonal= u.Personal_idPersonal)"
                    + " where p.Dni = '"+dni+"'; ";
            Statement st;
            String Nombres = "";
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            if (rs.next()) {
                //return rs.getString("nom");
               usuario.setUser(rs.getString("Usuario"));
               usuario.setPass(rs.getString("Password"));
               return usuario;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("rsv: " + ex.toString());
            return  null;
        }
    }
}
