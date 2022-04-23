package oop.ex6_movable;

import oop.ex3_7_shape.Circle;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint centerPoint;
    private float radius;

    public MovableCircle(float radius, MovablePoint centerPoint) {
        super(radius);
        this.centerPoint = centerPoint;
    }

    public MovableCircle(float radius, float x, float y, float xSpeed, float ySpeed) {
        super(radius);
        this.centerPoint = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCircle(String color, boolean isFilled, float radius, MovablePoint centerPoint) {
        super(color, isFilled, radius);
        this.centerPoint = centerPoint;
    }

    public MovablePoint getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(MovablePoint centerPoint) {
        this.centerPoint = centerPoint;
    }

    @Override
    public void moveUp() {
        centerPoint.moveUp();
    }

    @Override
    public void moveDown() {
        centerPoint.moveDown();
    }

    @Override
    public void moveLeft() {
        centerPoint.moveLeft();
    }

    @Override
    public void moveRight() {
        centerPoint.moveRight();
    }
}
