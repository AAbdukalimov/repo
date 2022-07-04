package kz.almaty.github.geometricfigures.rectangle;


public class Square extends Rectangle {

    public Square(double sideA, double sideB) {

        super(sideA, sideB, 0);
    }

    @Override
    public double toFindTheDiagonal() {

        return Math.sqrt(2) * getSideA();
    }

    @Override
    public double toFindThePerimeter() {

        return getSideA() * 4;
    }

    @Override
    public double toFindTheArea() {

        return Math.pow(toFindTheDiagonal(), 2) / 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }



}
