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
public class EntidadPostulante 
{ 
    
    private String codPostulante;
    private String tipodoc;
    private String nroDoc;
    private String Nombre;
    private String Ap;
    private String Am;
    

    public EntidadPostulante() 
    {
    }

    public String getCodPostulante() {
        return codPostulante;
    }

    public void setCodPostulante(String codPostulante) {
        this.codPostulante = codPostulante;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    
}
