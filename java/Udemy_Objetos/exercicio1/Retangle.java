/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy_Objetos.exercicio1;

/**
 *
 * @author luiz.grenteski
 */
public class Retangle {
    public double width;
    public double height;
    
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return width * 2 + height * 2;
    }
    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }
}
