package dientichdagiac;

public class Polygon {
    Point[] points;
    private double area;
    public Polygon(Point[] points) {
        this.points = points;
        this.area=calculateArea();
    }

    public double calculateArea() {
        int n = points.length;
        double area = 0.0;
        for (int i = 0; i < n; i++) {
            Point p1 = points[i];
            Point p2 = points[(i + 1) % n];
            area += p1.getX() * p2.getY() - p2.getX() * p1.getY();
        }
        return Math.abs(area) / 2.0;
    }

    public String getArea() {
        return String.format("%.3f", area);
    }

}
