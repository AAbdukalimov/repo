package kz.almaty.github.geometricfigures.triangle;

import kz.almaty.github.geometricfigures.FindArea;
import kz.almaty.github.geometricfigures.GeometricFigures;
import kz.almaty.github.geometricfigures.FindPerimeter;

public class Triangle extends GeometricFigures  {

    public double toFindSideC() {
        return Math.sqrt(Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2));
    }

    @Override
    public double toFindThePerimeter() {
        return getSideA() + getSideB() + toFindSideC();
    }

    public double semiPerimeter() {
        return toFindThePerimeter() / 2;
    }

    public double toFindTheHeight() {
        return 2 * (Math.sqrt(semiPerimeter() * (semiPerimeter() - getSideA()) * (semiPerimeter() - getSideB()) * (semiPerimeter() - toFindSideC())));
    }

    @Override
    public double toFindTheArea () {
        return (getSideA() * toFindTheHeight()) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
