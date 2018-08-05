/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionusuarios;

import java.util.ArrayList;

/**
 *
 * @author Soulu
 */
public class ControlUsuarios {
    private ArrayList <Usuario> usuarios = new ArrayList <> ();
    
    public void agregarUsuario(Usuario us) {
        this.usuarios.add(us);
    }
    
    public boolean checarExistencia() {
        return this.usuarios.isEmpty();
    }
    
    public int getIdFinal() {
        return this.usuarios.get(this.usuarios.size()-1).getId();
    }
    
    
    public void eliminarUsuario(int id) {
        int indice = 0;
        for(Usuario u : this.usuarios){
            if(u.getId() == id){
                this.usuarios.remove(indice);
                break;
            }
            indice++;
        }
    }
    
    public Usuario buscarUsuario(int id) {
        int indice = 0;
        for(Usuario u : this.usuarios){
            if(u.getId() == id){
               return u;
            }
            indice++;
        }
        return null;
    }
    
    public Usuario verificarSesion(String username, String pass) {
        for(Usuario u : this.usuarios){
            if(u.getUserName().equals(username) && u.getPasword().equals(pass)){
               return u;
            }
        }
        return null;
    }
    
    public ArrayList<Usuario> getArregloUsuarios(){
        return this.usuarios;
    }
    
    
}
