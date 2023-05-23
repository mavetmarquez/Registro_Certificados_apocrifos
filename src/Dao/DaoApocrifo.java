/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dto.Apocrifo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jotruvel
 */
public class DaoApocrifo {
    
    private String error;
    private boolean isError;
    
    
    //METODO PARA INSERTAR DATOS
    
    public int insertar(Apocrifo a) {
        int resultado = 0;
        clean();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("INSERT INTO apocrifo VALUE('" + a.getMatricula() + "','"
                    + a.getNombre() + "','"
                    + a.getDocumento() + "','"
                    + a.getObservaciones()+ "','"
                    + a.getFecha_escaneo()+"','"
                    + a.getFecha_bloqueo()+"','"
                    + a.getFecha_revision()+"','"
                    + a.getPredictamen()+"','"
                    +a.getOficio()+"')");

        } catch (Exception ex) {
            this.error = ex.getMessage();
            this.isError = true;
        }
        return resultado;
    }
    
    
    // Metodo para mostrar tabla
    public void buscartabla(JTable tabla_apocrifo) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_apocrifo.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM apocrifo");

            Object row[] = new Object[6];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("fecha_escaneo");
                row[2] = rs.getString("fecha_bloqueo");
                row[3] = rs.getString("fecha_revision");
                row[4] = rs.getString("predictamen");
                row[5] = rs.getString("oficio");
                

                model.addRow(row);
            }

            tabla_apocrifo.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    // METODO PARA ACTUALIZAR UN REGISTRO
    
    public int actualizar (Apocrifo a){
        int resultado=0;
        clean();
        
        try{
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            resultado = st.executeUpdate("UPDATE apocrifo SET matricula='" +a.getMatricula()+
                    "', nombre='"+ a.getNombre()+
                    "', documento='"+ a.getDocumento()+
                    "', observaciones='" +a.getObservaciones()+
                    "', fecha_escaneo='" +a.getFecha_escaneo()+
                    "', fecha_bloqueo='" +a.getFecha_bloqueo()+
                    "', fecha_revision='" +a.getFecha_revision()+
                    "', predictamen='" +a.getPredictamen()+
                    "', oficio='" +a.getOficio()+
                    "' WHERE matricula='"+ a.getMatricula()+"'");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //METODO PARA ELIMAR UN REGISTRO DE APOCRIFOS
    public int eliminar (String matricula){
        int resultado=0;
        clean ();
        try{
            Connection con =DBConnection.getConexion();
            Statement st=con.createStatement();
            resultado=st.executeUpdate("DELETE FROM apocrifo WHERE matricula='"+matricula+"';");
            
        }catch (Exception ex){
            this.error=ex.getMessage();
            this.isError=true;
        }
        return resultado;
    }
    
    //METODO PARA BUSCAR UNA MATRICULA
    
    public void filtrarMatricula (JTable tabla, String m) {
        clean();

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM apocrifo WHERE matricula LIKE '%"+m+"%'" );

            Object row[] = new Object[6];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("fecha_escaneo");
                row[2] = rs.getString("fecha_bloqueo");
                row[3] = rs.getString("fecha_revision");
                row[4] = rs.getString("predictamen");
                row[5] = rs.getString("oficio");

                model.addRow(row);
            }

            tabla.setModel(model);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    }
    
    
    
    
    
    //METODO CLEAN
    
    public void clean(){
        this.error = "";
        this.isError = false;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isIsError() {
        return isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }
    
    
    
}
