package kz.almaty.github.geometricfigures;

import java.util.Objects;

public abstract class GeometricFigures implements FindPerimeter, FindArea {

    protected double sideA;
    protected double sideB;

    protected GeometricFigures() {
    }

    protected boolean compareTheAreas(GeometricFigures figures) {
        return this.toFindTheArea() == figures.toFindTheArea();
    }

    @Override
    public double toFindTheArea() {
        return 0;
    }

    @Override
    public double toFindThePerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "GeometricFigures{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricFigures that = (GeometricFigures) o;
        return Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

}
