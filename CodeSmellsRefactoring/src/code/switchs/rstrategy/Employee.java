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
public class Employee

{    

    private float salary;    

    private IRemunerationCalculator remunerationCalculator;    

    public Employee(float salary, IRemunerationCalculator remunerationCalculator)    

    {

        this.salary = salary;        

        this.remunerationCalculator = remunerationCalculator;    

    }    

    public float CalculateSalary()    

    {        

        return remunerationCalculator.CalculateSalary(salary);    

    }                

    public float CalculateYearBonus()     

    {        

        return remunerationCalculator.CalculateYearBonus(salary);    

    }

}
