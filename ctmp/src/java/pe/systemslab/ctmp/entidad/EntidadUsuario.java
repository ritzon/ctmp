/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.entidad;

/**
 *
 * @author Laravel
 */
public class EntidadUsuario 
{
    private String user;
    private String pass;
    private String region;
    private String rol;
    
    
    
    public EntidadUsuario(String user,String pass,String region,String rol)
    {
        this.user = user;
        this.pass=pass;
        this.rol = rol;
        this.region = region;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
