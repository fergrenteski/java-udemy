/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application;

import Enum.Color;
import entities.Circle;
import entities.Retangle;
import entities.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Retangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            switch (ch) {
                case 'c' -> {
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    list.add(new Circle(radius, color));
                    break;
                }
                case 'r' -> {
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    list.add(new Retangle(width, height, color));
                    break;
                }
            }
        }
        
        System.out.println();
        System.out.println("Shapes Areas: ");
        for(Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));
        }
        
        sc.close();
    }
}
