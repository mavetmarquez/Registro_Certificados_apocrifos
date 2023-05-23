/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Reportes {
    
    private String matricula;
    private String nombre;
    private String id_escuela;
    private String escuela;
    private String id_carrera;
    private String carrera;
    private String id_escuela_proce;
    private String observaciones;
    private String fecha_escaneo;
    private String fecha_bloqueo;
    private String fecha_revision;
    private String predictamen;
    private String oficio;
    private String curp;
    private String ciclo_ingreso;
    
    public Reportes (){
        
    }

    public Reportes(String matricula, String nombre, String id_escuela, String escuela, String id_carrera, String carrera, String id_escuela_proce, String observaciones, String fecha_escaneo, String fecha_bloqueo, String fecha_revision, String predictamen, String oficio, String curp, String ciclo_ingreso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.id_escuela = id_escuela;
        this.escuela = escuela;
        this.id_carrera = id_carrera;
        this.carrera = carrera;
        this.id_escuela_proce = id_escuela_proce;
        this.observaciones = observaciones;
        this.fecha_escaneo = fecha_escaneo;
        this.fecha_bloqueo = fecha_bloqueo;
        this.fecha_revision = fecha_revision;
        this.predictamen = predictamen;
        this.oficio = oficio;
        this.curp = curp;
        this.ciclo_ingreso = ciclo_ingreso;
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

    public String getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(String id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getId_escuela_proce() {
        return id_escuela_proce;
    }

    public void setId_escuela_proce(String id_escuela_proce) {
        this.id_escuela_proce = id_escuela_proce;
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

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCiclo_ingreso() {
        return ciclo_ingreso;
    }

    public void setCiclo_ingreso(String ciclo_ingreso) {
        this.ciclo_ingreso = ciclo_ingreso;
    }
    
    
    
    
    
    
}
