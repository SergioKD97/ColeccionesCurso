/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class PruebasColecciones {
    
    static void ejemploHashMap(){
        HashMap<String, Cliente> diccClientes;
        diccClientes = new HashMap<String, Cliente>();
       
        
        Cliente ana = new Cliente(1, "Ana", null);
        Cliente luis = new Cliente(2, "Luis", null);
        Cliente bea = new Cliente(3, "Bea", null);
                
       diccClientes.put("a1", ana);
       diccClientes.put("b2", luis);
       diccClientes.put("c3", bea);
               
       
       
        System.out.println("Bea" + diccClientes.get("c3").getNombre());
       
        if ( ! diccClientes.containsKey("c3")){
        diccClientes.put("c3", new Cliente(4, "Pedro", null));
        }
        System.out.println("Bea" + diccClientes.get("c3").getNombre());
        
        for (Map.Entry<String, Cliente> parClaveValor 
                : diccClientes.entrySet())
        {
            System.out.println("Cliente " + parClaveValor.getKey());
            Cliente cliente = parClaveValor.getValue();
            System.out.println("Nombre " + cliente.getNombre());
        }
        
        
    } 
    
    static void ejemploListas(){
        
         // No genérico(no usar)
        ArrayList<Cliente> ListaClientes;
        ListaClientes = new ArrayList();
        
        ListaClientes.add(new Cliente(1, "Ana",null));
        ListaClientes.add(new Cliente(2, "Luis",null));
        ListaClientes.add(new Cliente(3, "Bea",null));
        
        ListaClientes.remove(1);
        Cliente bea = ListaClientes.get(1);
        bea.setEmail("bb@bb.com");
        
        
        for (int i=0; i < ListaClientes.size(); i++){
            System.out.println("El Cliente " + (i+1) + " con ID: " + ListaClientes.get(i).getId() + 
                    ", se llama: " + ListaClientes.get(i).getNombre() 
                    + ", con Email: " + ListaClientes.get(i).getEmail()
                    
                    );
            //System.out.println("Id Cliente " + i + ":" + ListaClientes.get(i).getId() + "Cliente " + i + ": " + ListaClientes.get(i).getNombre());
        }        
        
        
        for (Cliente cliente : ListaClientes) {
            
            System.out.println("Cliente: "
            + cliente.getNombre());
            
            
        }
    }
    
    
    
    
}
