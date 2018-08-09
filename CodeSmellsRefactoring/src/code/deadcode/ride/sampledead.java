/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.deadcode.ride;


/**
 * El code smell es dead code, pero debido a que en una condicion nunca se
 * cumple un statement, esta linea comentada (21) la detecta el IDE y la muestra
 * como un error, la manera de resolver este error es eliminar el codigo que
 * ocasiona el problema
 *
 * @author MNLL
 */
public class sampledead {

    public static void main() {

        try {
            // TODO
        } catch (Exception exc) {

            System.out.println("LINEA"); // muestra error
        }
    }

}
