package kz.almaty.github.geometricfigures.circles;

import kz.almaty.github.geometricfigures.FindArea;
import kz.almaty.github.geometricfigures.GeometricFigures;
import kz.almaty.github.geometricfigures.FindPerimeter;

import java.util.Objects;

public class Circle extends GeometricFigures implements FindPerimeter, FindArea {

    protected double radius;

    public double toFindTheDiameter() {
        return getRadius() * 2;
    }

    @Override

    public double toFindTheArea() {
        return Math.PI * (Math.pow(toFindTheDiameter(), 2) / 4);
    }

    @Override

    public double toFindThePerimeter() {

        return (getRadius() * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
