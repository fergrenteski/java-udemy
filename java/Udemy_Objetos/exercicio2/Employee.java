/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy_Objetos.exercicio2;

/**
 *
 * @author luiz.grenteski
 */
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double NetSalary(){
        return grossSalary - tax;
    }
    
    public void IncreseSalary(double percentage){
        this.grossSalary = ((grossSalary * percentage)/100) + grossSalary;
    }
    
    @Override
    public String toString(){
        return name
             + ", $"
             + String.format("%.2f", NetSalary());
    }
}
