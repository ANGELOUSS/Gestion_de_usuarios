/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionusuarios;

/**
 *
 * @author Soulu
 */
public class Usuario {
    private int id = 0;
    private String nombre = "";
    private String username = "";
    private String password = "";
    private int edad = 0;

    public Usuario(String nombre, String username, String pass, int edad, int id){
        this.nombre = nombre;
        this.username = username;
        this.password = pass;
        this.edad = edad;
        this.id = id;
    }
    
    public Usuario(){}
    
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getUserName() {
        return this.username;
    }
    
    public String getPasword(){
        return this.password;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    public void setPassword(String pass) {
        this.password = pass;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
