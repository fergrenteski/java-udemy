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
    public String name;
    public double price;
    public int quantity;
    
    public Product(String name, double price, int quantity){
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
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
