package oop.ex5_line;

import oop.ex1_point.Point2D;

public class Line {
    protected Point2D p1;
    protected Point2D p2;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.p1 = startPoint;
        this.p2 = endPoint;
    }

    public Line(float startX, float startY, float endX, float endY) {
        this.p1 = new Point2D(startX, startY);
        this.p2 = new Point2D(endX, endY);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public float getLength() {
        double diffX = (p1.getX() - p2.getX());
        double diffY = (p1.getY() - p2.getY());
        return (float) Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }

    public Point2D getMidPoint(){
        return new Point2D((p1.getX()+ p2.getX())/2 , (p1.getY()+ p2.getY())/2);
    }
}
