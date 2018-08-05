/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionusuarios;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Soulu
 */
public class ControlTablaUsuarios {
    private JTable tabla = null;
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ControlTablaUsuarios(JTable t, String[] columnas, ControlUsuarios u) {
        this.tabla = t;
        this.colocarColumnas(columnas);
        this.llenarFilas(u);
        this.tabla.setModel(modelo);
    }
    
    public void colocarColumnas(String [] columnas) {
        for(String c : columnas){
            modelo.addColumn(c);
        }
    }
    
    public void llenarFilas(ControlUsuarios us) {
        for(Usuario u : us.getArregloUsuarios()){
            Object [] fila = {u.getId(), u.getNombre(), u.getUserName(), u.getPasword(), u.getEdad()};
            modelo.addRow(fila);
        }
    }
    
    public void eliminarFila(int fila) {
        this.modelo.removeRow(fila);
    }
    
    
}
