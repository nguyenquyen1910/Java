package dientichdagiac;

public class Polygon {
    Point[] points;
    private double dienTich;
    public Polygon(Point[] points) {
        this.points = points;
        this.dienTich = tinhDienTich();
    }

    private double tinhDienTich() {
        int n = points.length;
        double dt = 0.0;
        for(int i=0;i<n;i++) {
            Point p1 = points[i];
            Point p2 = points[(i+1)%n];
            dt += p1.getX()*p2.getY() - p1.getY()*p2.getX();
        }
        return Math.abs(dt) / 2;
    }

    @Override
    public String toString() {
        return String.format("%.3f", dienTich);
    }
}
