package ex3_7_shape;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    @Override
    public void resize(int percent) {
        this.length *= (double)percent/100;
        this.width *= (double)percent/100;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public double getPerimeter() {
        return (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f which is a subclass of %s", width, length, super.toString());
    }
}
