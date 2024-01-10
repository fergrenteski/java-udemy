/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author luiz.grenteski
 */
public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(Double healthExpenditures, String name, Double anualIncome) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        
        double basicTax = (getAnualIncome() < 20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
