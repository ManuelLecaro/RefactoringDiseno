/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.innapro.rhidedelegate;


/**
 * El siguiente code smell es innapropriate intimacy, la clase worker maneja 
 * metodos de la clase office y worker puede acceder a los m[etodos de office
 * para esto cambios y usamos hide-delegate por lo cual se crea el m[etodo getChief
 * donde se retorna un valor a partir de los atributos del objeto
 * @author MNLL
 */
public class Worker {
    private String name;
    private Office of;
    
     public Office getOffice() {
    return of;
  }
  public void setOffice(Office of) {
    this.of =of;
  }
  
  public Worker  getChief(){
      return of.getChief();
  }
    
}
