/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.longpar.replacepar;

/**
 *El code smell es el long parameter list debido a que usa en sus metodos muchos
 * mas parametros de lo esperado, esto se lo puede arreglar por medio de
 * reemplazar el parametro con una llamada del metodo 
 * 
 * @source https://github.com/RefactoringGuru/refactoring-examples/blob/master/interactive/java/replace-parameter-with-method-call.md
 */
class Orden {

    private int quantity;
    private int itemPrice;

    public double getPrice() {
        return discountedPrice();
    }

    private double discountedPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }
}
