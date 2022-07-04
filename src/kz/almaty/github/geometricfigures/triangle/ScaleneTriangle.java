package kz.almaty.github.geometricfigures.triangle;

import kz.almaty.github.geometricfigures.triangle.Triangle;

public class ScaleneTriangle extends Triangle {

    @Override
    public double toFindTheArea () {
        return Math.sqrt(semiPerimeter() * (semiPerimeter() - getSideA()) * (semiPerimeter() - getSideB()) * (semiPerimeter() - toFindSideC()));
    }

    @Override
    public String toString() {
        return "ScaleneTriangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
