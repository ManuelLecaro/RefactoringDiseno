/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.innapropriateint;

/**
 * El siguiente code smell es innapropriate intimacy, la clase worker maneja 
 * metodos de la clase office y worker puede acceder a los m[etodos de office
 * @author MNLL
 */
public class Worker {
    public String name;
    public Office of;
    
     public Office getOffice() {
    return of;
  }
  public void setOffice(Office of) {
    this.of =of;
  }
    
}
