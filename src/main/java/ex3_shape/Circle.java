package ex3_shape;

public class Circle extends Shape {
    private float radius;

    Circle() {
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

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a subclass of %S", radius, super.toString());
    }
}
