package kz.almaty.github.geometricfigures.circles;

import kz.almaty.github.geometricfigures.FindArea;
import kz.almaty.github.geometricfigures.FindPerimeter;
import kz.almaty.github.geometricfigures.GeometricFigures;

import java.util.Objects;

public class Ellipse extends GeometricFigures implements FindPerimeter, FindArea {

    protected double semiAxisShort;
    protected double semiAxisLong;

    @Override
    public double toFindThePerimeter() {

        return 2 * Math.PI * Math.sqrt((Math.pow(getSemiAxisShort(), 2) + Math.pow(getSemiAxisLong(), 2)) / 2);
    }

    @Override
    public double toFindTheArea() {

        return Math.PI * getSemiAxisShort() * getSemiAxisLong();
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "semiAxisShort=" + semiAxisShort +
                ", semiAxisLong=" + semiAxisLong +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.semiAxisShort, semiAxisShort) == 0 && Double.compare(ellipse.semiAxisLong, semiAxisLong) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(semiAxisShort, semiAxisLong);
    }

    public double getSemiAxisShort() {
        return semiAxisShort;
    }

    public void setSemiAxisShort(double semiAxisShort) {

        this.semiAxisShort = semiAxisShort;
    }

    public double getSemiAxisLong() {

        return semiAxisLong;
    }

    public void setSemiAxisLong(double semiAxisLong) {

        this.semiAxisLong = semiAxisLong;
    }
}
