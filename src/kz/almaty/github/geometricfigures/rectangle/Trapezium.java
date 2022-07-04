package kz.almaty.github.geometricfigures.rectangle;

import java.util.Objects;

public class Trapezium extends Rectangle {

protected double sideC;

    public Trapezium(double sideA, double sideB, double height, double sideC) {
        super(sideA, sideB, height);
        this.sideC = sideC;
    }

    public double findTheSideD() {

        return Math.sqrt(Math.pow(getSideC(), 2) - Math.pow((getSideA() - getSideB()), 2));
    }

    @Override
    public double toFindTheArea() {

        return ((getSideA() + getSideB()) / 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "sideC=" + sideC +
                ", height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezium trapezium = (Trapezium) o;
        return Double.compare(trapezium.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideC);
    }

    public double getSideC() {

        return sideC;
    }

    public void setSideC(double sideC) {

        this.sideC = sideC;
    }
}
