public class HollowSquare extends Square implements Hollow {
    private double bWidth; // boundary width

    public HollowSquare(double x, double y, double side, double bWidth) {
        super(x, y, side);
        this.bWidth = bWidth;
    }

    @Override
    public double boundaryWidth() {
        return bWidth;
    }

    // need to add both outer and inner edges
    // inner side = side - 2 * boundaryWidth
    @Override
    public double perimeter() {
        double inner = getSide() - 2 * bWidth;
        return 4 * getSide() + 4 * inner;
    }

    // only the solid part counts
    // so outer area minus inner area
    @Override
    public double area() {
        double inner = getSide() - 2 * bWidth;
        return getSide() * getSide() - inner * inner;
    }
}
