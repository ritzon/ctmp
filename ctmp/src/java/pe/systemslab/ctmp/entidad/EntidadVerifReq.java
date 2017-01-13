/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.systemslab.ctmp.entidad;

import java.util.Date;

/**
 *
 * @author Laravel
 */
public class EntidadVerifReq 
{
    private Date fechaCurso;
    private String Observacion;
    private int checkObs;
    private int idPersonal;
    private int idRequisito;
    private int idPostulante;
    private String EstDoc;
    private int nroExpediente;
    private String NroOficio;

    public int getNroExpediente() {
        return nroExpediente;
    }

    public void setNroExpediente(int nroExpediente) {
        this.nroExpediente = nroExpediente;
    }

    public String getNroOficio() {
        return NroOficio;
    }

    public void setNroOficio(String NroOficio) {
        this.NroOficio = NroOficio;
    }
    
    public EntidadVerifReq() {
    }

    public Date getFechaCurso() {
        return fechaCurso;
    }

    public void setFechaCurso(Date fechaCurso) {
        this.fechaCurso = fechaCurso;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public int getCheckObs() {
        return checkObs;
    }

    public void setCheckObs(int checkObs) {
        this.checkObs = checkObs;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(int idRequisito) {
        this.idRequisito = idRequisito;
    }

    public int getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(int idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getEstDoc() {
        return EstDoc;
    }

    public void setEstDoc(String EstDoc) {
        this.EstDoc = EstDoc;
    }
    
}
