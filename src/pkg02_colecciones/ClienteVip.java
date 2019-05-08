/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

/**
 *
 * @author Admin
 */
public class ClienteVip extends Cliente {
    private String beneficio;

   

    public ClienteVip(String beneficio, long id, String Nombre, String email) {
        super(id, Nombre, email);
        this.beneficio = beneficio;
    }

    
    
    
    
    
    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
    
    
    
    
    
}
