/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.negocio;

import java.sql.Statement;
import pe.systemslab.ctmp.datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.systemslab.ctmp.entidad.EntidadPersonal;

/**
 *
 * @author Laravel
 */
public class NegocioPersonal {

    public NegocioPersonal() {

    }
    private Connection cnn = null;

    public ResultSet ListarRegiones() {
        try {
            Conexion miConexion = new Conexion();
            cnn = miConexion.GetConexion();
            String sql = "select idRegion,Region from regiones where CodBaja = 0";
            Statement st;
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ResultSet ListarCargos() {
        try {
            Conexion miConexion = new Conexion();
            cnn = miConexion.GetConexion();
            String sql = "select idCargo,NomCargo from cargos where CodBaja=0;";
            Statement st;
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void InsertarPersonal(EntidadPersonal ep) {
        Conexion micnn = new Conexion();
        cnn = micnn.GetConexion();
        try {

            if (ExistePersonal(ep.getDni()) == 0) 
            {
                String sql = "INSERT INTO personal"
                        + "(`Dni`,`Nombres`,`Ap`,`Am`,`Genero`,`Telefono`,`Correo`,`Direccion`,`idRegion`,`idCargo`,`idPersonal_fk`)"
                        + "values('" + ep.getDni() + "','" + ep.getNombres() + "','" + ep.getAp() + "','" + ep.getAm() + "','" + ep.getGenero() + "'"
                        + ",'" + ep.getTelefono() + "','" + ep.getCorreo() + "','" + ep.getDireccion() + "'," + ep.getIdRegion() + "," + ep.getIdCargo() + ",1);";

                Statement st;
                st = cnn.createStatement();
                st.execute(sql);
                cnn.close();
                micnn.GetConexion().close();
            } 
            

        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int ExistePersonal(String dni) {
        try {
            Conexion miConexion = new Conexion();
            cnn = miConexion.GetConexion();
            String sql = "select Dni  from personal where Dni ='" + dni + "' and CodBaja=0;";
            Statement st;
            st = cnn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            if (rs.next()) {
                //return rs.getString("nom");

                return 1;

            } else {
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(NegocioPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
