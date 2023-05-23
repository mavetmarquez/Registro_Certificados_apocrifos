/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author jotruvel
 */
public class Vista_alumnos {
    private String matricula;
    private String nombre;
    private String nombre_escuela;
    private String nombre_carrera;
    private String estatus;
    private String tipo_ingreso;
    private String nombre_escuela_p;
    private String telefono_part;
    private String tel_emergencia;
    private String celular;
    private String correo_p;
    private String correo_i;
    private String ciclo_ingreso;
    private String curp;
    private String domicilio;
    
    public Vista_alumnos(){
        
    }

    public Vista_alumnos(String matricula, String nombre, String nombre_escuela, String nombre_carrera, String estatus, String tipo_ingreso, String nombre_escuela_p, String telefono_part, String tel_emergencia, String celular, String correo_p, String correo_i, String ciclo_ingreso, String curp, String domicilio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.nombre_escuela = nombre_escuela;
        this.nombre_carrera = nombre_carrera;
        this.estatus = estatus;
        this.tipo_ingreso = tipo_ingreso;
        this.nombre_escuela_p = nombre_escuela_p;
        this.telefono_part = telefono_part;
        this.tel_emergencia = tel_emergencia;
        this.celular = celular;
        this.correo_p = correo_p;
        this.correo_i = correo_i;
        this.ciclo_ingreso = ciclo_ingreso;
        this.curp = curp;
        this.domicilio = domicilio;
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

    public String getNombre_escuela() {
        return nombre_escuela;
    }

    public void setNombre_escuela(String nombre_escuela) {
        this.nombre_escuela = nombre_escuela;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTipo_ingreso() {
        return tipo_ingreso;
    }

    public void setTipo_ingreso(String tipo_ingreso) {
        this.tipo_ingreso = tipo_ingreso;
    }

    public String getNombre_escuela_p() {
        return nombre_escuela_p;
    }

    public void setNombre_escuela_p(String nombre_escuela_p) {
        this.nombre_escuela_p = nombre_escuela_p;
    }

    public String getTelefono_part() {
        return telefono_part;
    }

    public void setTelefono_part(String telefono_part) {
        this.telefono_part = telefono_part;
    }

    public String getTel_emergencia() {
        return tel_emergencia;
    }

    public void setTel_emergencia(String tel_emergencia) {
        this.tel_emergencia = tel_emergencia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo_p() {
        return correo_p;
    }

    public void setCorreo_p(String correo_p) {
        this.correo_p = correo_p;
    }

    public String getCorreo_i() {
        return correo_i;
    }

    public void setCorreo_i(String correo_i) {
        this.correo_i = correo_i;
    }

    public String getCiclo_ingreso() {
        return ciclo_ingreso;
    }

    public void setCiclo_ingreso(String ciclo_ingreso) {
        this.ciclo_ingreso = ciclo_ingreso;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
}
