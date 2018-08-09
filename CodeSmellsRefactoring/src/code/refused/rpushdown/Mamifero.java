/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.refused.rpushdown;

import code.refusedbequest.*;

/**
 *El siguiente codigo representa el code smell de refusedbequest las subclases de
 * mamifero usaran algunos de los metodos de la clase padre, como Ballena no podra
 * usar volar asi como Murcielago no podra usar nadar, entonces se lo corrige con
 * pushdown de metodos
 * @author MNLL
 */
public class Mamifero {
    
    
    public void darlactar(){}
    
}
