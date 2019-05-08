package pkg02_colecciones;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Cliente {
    
    private long id;
    private String nombre;
    private String email;
    private boolean activo;
    
    
    public Cliente(long id, String Nombre, String email) {
        this.id = id;
        this.nombre = Nombre;
        this.email = email;
        this.activo = true;
    }
    
    
    public long getId(){
        return this.id;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    


    
    
    
    
    
    
    
}
