/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.longparameter;

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
        int basePrice = quantity * itemPrice;
        int discountLevel;
        if (quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
