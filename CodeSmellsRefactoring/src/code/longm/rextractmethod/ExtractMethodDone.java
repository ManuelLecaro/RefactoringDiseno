/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.longm.rextractmethod;

import java.util.ArrayList;

/**
 *Ejemplo conseguido de 
 * @author https://github.com/RefactoringGuru/refactoring-examples
 */
public class ExtractMethodDone {
    private String name;
    
    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    void printBanner() {
        System.out.println("*****************************");
        System.out.println("****** Customer totals ******");
        System.out.println("*****************************");
    }

    void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    double getOutstanding() {
        int outstanding=0;
        ArrayList<Integer> elements = new ArrayList();
        for(int i=0;i<5;i++)
            elements.add(i);
        while (!elements.isEmpty()) {
            outstanding += elements.remove(0);
        }
        return outstanding;
    }
}
