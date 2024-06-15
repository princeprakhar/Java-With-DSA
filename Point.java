package Dsa_by_coding_ninjas;

    public class Point implements Comparable<Point> {
    public int x;
    public int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

        public Point(int x,int y) {
        this.x=x;
        this.y=y;
        }



        @Override
        public int compareTo(Point o) {
            return this.x-o.x;
        }

    }
