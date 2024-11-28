package J04001_khaibaoloppoint;

import static java.lang.Math.*;

public class Point {
    private double x,y;
    private float distance;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point p){
        return sqrt(pow(this.x-p.x,2)+pow(this.y-p.y,2));
    }
}
