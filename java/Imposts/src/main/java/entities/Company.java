/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author luiz.grenteski
 */
public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(Integer numberOfEmployees, String name, Double anualIncome) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public Double tax() {         
        double basicTax = (getNumberOfEmployees() > 10) ? getAnualIncome() * 0.14 : getAnualIncome() * 0.14;
        return basicTax;
    }  
}
