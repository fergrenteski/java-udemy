
package entities;

public class Rectangle implements Shape{

    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidht() {
        return width;
    }

    public void setWidht(Double widht) {
        this.width = widht;
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
