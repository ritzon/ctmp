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
public class EntidadPersonal 
{
    private String dni;
    private String Nombres;
    private String Ap;
    private String Am;    
    private String genero;
    private int idRegion;
    private int idCargo;
    private String correo;
    private String telefono;
    private String Direccion;

    public EntidadPersonal(String dni, String Nombres, String Ap, String Am, String genero, int idRegion, int idCargo, String correo, String telefono, String Direccion) 
    {
        this.dni = dni;
        this.Nombres = Nombres;
        this.Ap = Ap;
        this.Am = Am;
        this.genero = genero;
        this.idRegion = idRegion;
        this.idCargo = idCargo;
        this.correo = correo;
        this.telefono = telefono;
        this.Direccion = Direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getAp() {
        return Ap;
    }

    public void setAp(String Ap) {
        this.Ap = Ap;
    }

    public String getAm() {
        return Am;
    }

    public void setAm(String Am) {
        this.Am = Am;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
   
}
