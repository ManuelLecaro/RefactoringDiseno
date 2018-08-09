/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.divergent.rextractlass;

import java.util.Date;

/**
 *El code smell es divergent hange esto es porque esta clase esta sobrecargada y 
 *viola el principio SOLID ya que la clase realiza mas de una tarea, esto se lo 
 * soluciona usando extract class de modo que se divide el comportamiento ahora 
 * con Cobro y MedioPago
 * @author MNLL
 */
public class Cobro {
    private double cantidad;
    private Date fecha;
    private MedioPago medioPago;
    
    public  MedioPago getMedioPago(){
        return medioPago;
    }
    
    
}
