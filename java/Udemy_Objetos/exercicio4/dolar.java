/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Udemy_Objetos.exercicio4;

/**
 *
 * @author luiz.grenteski
 */
public class dolar {
    public static final double IOF = 6.00;
    
    public static double real(double vDolar, double qDolar){
        return (qDolar + ((qDolar * 6.00) / 100)) * vDolar;
    }
}
