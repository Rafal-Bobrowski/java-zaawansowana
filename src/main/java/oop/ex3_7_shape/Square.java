package oop.ex3_7_shape;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return String.format("Square with size=%f which is a subclass of %s", width, super.toString());
    }
}
