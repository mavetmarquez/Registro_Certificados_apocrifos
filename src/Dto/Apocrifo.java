/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Apocrifo {
    
    private String matricula;
    private String nombre;
    private String documento;
    private String observaciones;
    private String fecha_escaneo;
    private String fecha_bloqueo;
    private String fecha_revision;
    private String predictamen;
    private String oficio;
    
    public Apocrifo(){
        
    }

    public Apocrifo(String matricula, String nombre, String documento, String observaciones, String fecha_escaneo, String fecha_bloqueo, String fecha_revision, String predictamen, String oficio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.documento = documento;
        this.observaciones = observaciones;
        this.fecha_escaneo = fecha_escaneo;
        this.fecha_bloqueo = fecha_bloqueo;
        this.fecha_revision = fecha_revision;
        this.predictamen = predictamen;
        this.oficio = oficio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha_escaneo() {
        return fecha_escaneo;
    }

    public void setFecha_escaneo(String fecha_escaneo) {
        this.fecha_escaneo = fecha_escaneo;
    }

    public String getFecha_bloqueo() {
        return fecha_bloqueo;
    }

    public void setFecha_bloqueo(String fecha_bloqueo) {
        this.fecha_bloqueo = fecha_bloqueo;
    }

    public String getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getPredictamen() {
        return predictamen;
    }

    public void setPredictamen(String predictamen) {
        this.predictamen = predictamen;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    

    
    
}
