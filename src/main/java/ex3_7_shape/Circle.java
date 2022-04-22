package ex3_7_shape;

public class Circle extends Shape {
    private float radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public void resize(int percent) {
        this.radius *= (double)percent/100;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a subclass of %S", radius, super.toString());
    }
}
