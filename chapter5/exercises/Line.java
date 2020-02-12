package chapter5.exercises;

/**
 * @author LanXue
 * @date 2020-02-12 19:30
 */
public class Line {

    private double m, b, a;

    public Line(double x, double y, double m) {
        this.m = m;
        this.b = y - m * x;
        this.a = 0;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.m = (x2 - x1) / (y2 - y1);
        this.b = y1 - m * x1;
        this.a  = 0;
    }

    public Line(double m, double b) {
        this.m = m;
        this.b = b;
        this.a = a;
    }

    public Line(double a) {
        this.a = a;
    }

    public boolean intersects(Line other) {
        return m != other.m;
    }

    public boolean equals(Line other) {
        return (m != 0 && m == other.m && b == other.b) || (m == 0 && a == other.a);
    }

    public boolean isParallel(Line other) {
        return (m == other.m && b != other.b) || a != other.a;
    }
}
