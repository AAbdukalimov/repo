package kz.almaty.github.geometricfigures.rectangle;

import kz.almaty.github.geometricfigures.FindArea;
import kz.almaty.github.geometricfigures.GeometricFigures;
import kz.almaty.github.geometricfigures.FindPerimeter;

import java.util.Objects;

public class Rectangle extends GeometricFigures  {

    protected double height;

public Rectangle (double sideA, double sideB, double height) {
   this.sideA = sideA;
   this.sideB = sideB;
   this.height = height;
}


    public double toFindTheDiagonal () {

        return  Math.sqrt((Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2)));
  }

    @Override
    public double toFindTheArea() {

        return getSideA() * Math.sqrt(Math.pow(toFindTheDiagonal(), 2) - Math.pow(getSideA(), 2));
    }


    @Override
    public double toFindThePerimeter() {

        return (getSideA() + getSideB()) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

    this.height = height;
    }
}
