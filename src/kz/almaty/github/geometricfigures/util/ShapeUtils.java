package kz.almaty.github.geometricfigures.util;

import kz.almaty.github.geometricfigures.GeometricFigures;
import kz.almaty.github.geometricfigures.rectangle.Rectangle;
import kz.almaty.github.geometricfigures.triangle.Triangle;

public final class ShapeUtils {

    private ShapeUtils() {}

    public static boolean defineRectangle (GeometricFigures figure) {
        return figure instanceof Rectangle;
    }
    public static boolean defineTriangle (GeometricFigures figure) {
        return figure instanceof Triangle;
    }
}
