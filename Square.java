public class Square extends Shape {
    private double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    // square perimeter = 4 * side
    @Override
    public double perimeter() {
        return 4 * side;
    }

    // square area = side * side
    @Override
    public double area() {
        return side * side;
    }
}
