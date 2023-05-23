/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jotruvel
 */
public class DaoEmpleados {
    private String error;
    private boolean isError;
    
    //METODO PARA INICIAR SESIÓN
    
    public int iniciarSesion (String id_empleado, String contraseña){
        int resultado = 0;
        clean();
        
        try{
            
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("SELECT count(*) as login FROM empleados where id_empleado='"+id_empleado+"'and contraseña='"+contraseña+"';");
            rs.next();
            resultado=rs.getInt("login");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        
        return resultado;
    }

    // Metodo para limpiar 
    
    public void clean (){
        this.error="";
        this.isError=false;
    }
    
    

    public String getError() {
        return error;
    }

    public boolean isIsError() {
        return isError;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }

    
    
}
