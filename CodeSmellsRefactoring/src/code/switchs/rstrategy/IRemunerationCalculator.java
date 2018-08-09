/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.switchs.rstrategy;

/**
 *
 * @source https://dzone.com/articles/code-smells-part-ii
 */
public interface IRemunerationCalculator     

{        

    float CalculateSalary(float salary);     

    float CalculateYearBonus(float salary);  

}
