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
public class DaoEmpleado_C {
    private String error;
    private boolean isError;
    
    
    public int iniciarS (String id_empleadoa, String contraseña){
        int resultado=0;
        clean();
        
        try{
            Connection con =DBConnection.getConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT count(*) as login FROM empleado_c where id_empleado_c='"+id_empleadoa+"'and contraseña='"+contraseña+"';");
            rs.next();
            resultado=rs.getInt("login");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        
        }
        return resultado;
    }
    
    
    
    //Metodo para limpiar 
    
   public void clean(){
       this.error="";
       this.isError=false;
   }
   
   public String getError (){
       return error;
   }
   
   public boolean isIsError(){
       return isError;
   }
   
   public void setError(String error){
       this.error=error;
   }
   
   public void setIsError(boolean isError){
       this.isError=isError;
   }
    
}
