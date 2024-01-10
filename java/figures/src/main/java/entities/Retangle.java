/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import Enum.Color;

/**
 *
 * @author luiz.grenteski
 */
public class Retangle extends Shape{
    
    private Double width;
    private Double height;
    
    public Retangle(){
        super();
    }

    public Retangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    
    @Override
    public double area() {
        return width * height;
    }
    
}
