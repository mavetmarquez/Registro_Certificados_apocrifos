/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

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
public class DaoReportes {
    private String error;
    private boolean isError;
    
    
    public void buscartabla(JTable tabla_envio) {

        clean();

        DefaultTableModel model = (DefaultTableModel) tabla_envio.getModel();

        try {
            Connection con = DBConnection.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios_escolares.reporte_apocrifo");

            Object row[] = new Object[17];

            while (rs.next()) {
                row[0] = rs.getString("matricula");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("documento");
                row[3] = rs.getString("id_escuela_f");
                row[4]= rs.getString("nombre_escuela");
                row[5]=rs.getString("id_carrera_f");
                row[6]= rs.getString("nombre_carrera");
                row[7] = rs.getString("id_escuela_pro_f");
                row[8]= rs.getString("nombre_escuela_p");
                row[9]= rs.getString("observaciones");
                row[10]= rs.getString("fecha_escaneo");
                row[11]= rs.getString("fecha_bloqueo");
                row[12]= rs.getString("fecha_revision");
                row[13]= rs.getString("predictamen");
                row[14]= rs.getString("oficio");
                row[15]= rs.getString("curp");
                row[16]= rs.getString("ciclo_ingreso");
                

                model.addRow(row);
            }

            tabla_envio.setModel(model);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar");
            this.error = ex.getMessage();
            this.isError = true;
        }

    } 
    
    
    
    //METODO CLEAN LIMPIAR VARIABLES
    
    public void clean (){
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
