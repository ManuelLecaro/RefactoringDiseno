/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.longMethod;

import java.util.ArrayList;

/**
 * Ejemplo conseguido de
 * @author  https://github.com/RefactoringGuru/refactoring-examples
 * 
 * El code smell encontrado aqui es Long method por lo que para cambiarlo 
 * aplicamos ExtractMethod de modo que dividimos al metodo en otros que realicen
 * una tarea mas especifica y asi reducir el tamano de el metodo original
 */
public class ExtractMethod {
    private String name;
    
    void printOwing() {
        ArrayList<Integer> elements = new ArrayList();
        for(int i=0;i<5;i++)
            elements.add(i);
        
        double outstanding = 0.0;

        // print banner
        System.out.println("*****************************");
        System.out.println("****** Customer totals ******");
        System.out.println("*****************************");

        // print owings
        while (!elements.isEmpty()) {
            outstanding += elements.remove(0);
        }

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
    
}
