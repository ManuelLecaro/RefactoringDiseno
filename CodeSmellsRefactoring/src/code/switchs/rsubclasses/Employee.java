/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.switchs.rsubclasses;

/**
 *
 * @source https://dzone.com/articles/code-smells-part-ii
 */
abstract public class Employee 

{ 

    protected float salary;    

    protected float bonusPercentage;    

    public Employee(float salary, float bonusPercentage)    

    {        

        this.salary = salary;        

        this.bonusPercentage = bonusPercentage;    

    }    

    abstract public float CalculateSalary();

    public float CalculateYearBonus()     

    {

        return 0.0F;    

    }

}
