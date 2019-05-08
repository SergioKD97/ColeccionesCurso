/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_colecciones;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class PruebaFechas {
    
    public static void probar(){
        FechaSinMinutos fecha = new FechaSinMinutos();
        fecha.set(2019, 5, 8);
        
        System.out.println("Fecha" + fecha.toString());
        Date fechaDate = fecha.getTime();
        
        System.out.println("Fecha: " + fechaDate.toString());
        
        FechaSinMinutos miCumple;
        miCumple = new FechaSinMinutos(2019, 5, 8);
        
        if (miCumple.getTimeWithoutSeconds().after(fecha.getTimeWithoutSeconds())){
            System.out.println("Aun no cumple");
        }else if(miCumple.getTimeWithoutSeconds().before(fecha.getTimeWithoutSeconds())){
            System.out.println("Ya cumpliste");
        }else if(miCumple.getTimeWithoutSeconds().equals(fecha.getTimeWithoutSeconds())){
            System.out.println("Cumpleaños Feliz");
        }
        System.out.println(miCumple.getTimeWithoutSeconds());
        System.out.println(fecha.getTimeWithoutSeconds());
        
    }
    
    
    
    
    
    
    
}
