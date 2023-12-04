/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy_Objetos.Produto;

/**
 *
 * @author luiz.grenteski
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity){
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Product(String name, double price){
        this.name =  name;
        this.price = price;
    }
    
    // Set and Get Name
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    //Set and Get Price
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double TotalValueInStock() {
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    
    public String toString() {
        return name
             + ", $"
             + String.format("%.2f", price)
             + ", "
             + quantity
             + " units, Total: $"
             + String.format("%.2f",TotalValueInStock());
    }
}
