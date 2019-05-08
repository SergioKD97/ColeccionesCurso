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
public class FechaSinMinutos extends GregorianCalendar{

    public FechaSinMinutos(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    FechaSinMinutos() {
        super();
    }

    



    //sobreescribir el metodo getTime()
    public Date getTimeWithoutSeconds(){
        Date fecha = new Date(((getTimeInMillis() + 86399) / 86400) * 8);
        fecha.setHours(0);
        fecha.setMinutes(0);
        fecha.setSeconds(0);
        
        return fecha;
    }
    
    
    
    
}
