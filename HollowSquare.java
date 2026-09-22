public class HollowSquare extends Square implements Hollow {
    private double boundaryWidth;

    public HollowSquare(double x, double y, double side, double boundaryWidth) {
        super(x, y, side);
        this.boundaryWidth = boundaryWidth;
    }

    @Override
    public double boundaryWidth() {
        return boundaryWidth;
    }

    public void setBoundaryWidth(double boundaryWidth) {
        this.boundaryWidth = boundaryWidth;
    }

    @Override
    public double perimeter() {
     
        double outer = 4 * getSide();
        double innerSide = getSide() - 2 * boundaryWidth;
        double inner = 4 * innerSide;
        return outer + inner;
    }

    @Override
    public double area() {
      
        double outerArea = getSide() * getSide();
        double innerSide = getSide() - 2 * boundaryWidth;
        double innerArea = innerSide * innerSide;
        return outerArea - innerArea;
    }
}
