package kz.almaty.github.geometricfigures.triangle;

import kz.almaty.github.geometricfigures.triangle.Triangle;

public class EquilateralTriangle extends Triangle {


    @Override
    public double toFindTheArea() {

        return (Math.pow(getSideA(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double toFindTheHeight() {
        return (getSideA() * Math.sqrt(3)) / 2;
    }

    public double toFindBisector () {
        return toFindTheHeight();
    }

    public double toFindMedian () {
        return toFindBisector();
    }

    @Override
    public double toFindThePerimeter() {
        return 2 * Math.sqrt(3) * toFindMedian();
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

}
