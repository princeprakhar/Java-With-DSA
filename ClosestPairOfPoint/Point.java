package ClosestPairOfPoint;

public class Point {
    int x;
    int y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }

    public static  int compare(Point t, Point t1) {
        return t.x-t1.x;
    }
}
