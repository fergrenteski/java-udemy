
package entities;

public class Invoice {

    private Double basicPayment;
    private Double tax;
    
    public Invoice(){
        
    }

    public Invoice(Double payment, Double tax) {
        this.basicPayment = payment;
        this.tax = tax;
    }

    public Double getPayment() {
        return basicPayment;
    }

    public void setPayment(Double payment) {
        this.basicPayment = payment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
    public Double getTotalPayment() {
        return getPayment() + getTax();
    }
}
