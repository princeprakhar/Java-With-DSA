package Dsa_by_coding_ninjas;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class ClosestPairOfPoint {
    public static double dist(Point p2,Point p3)
    {
        return Math.sqrt(Math.pow((p2.getX()-p3.getX()),2)+Math.pow((p2.getY()-p3.getY()),2));
    }

    public static double  bruteForce(Point []p,int n)
    {
        double min=Double.MAX_VALUE;
        int i;
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(min>dist(p[i],p[j]))
                {
                    min=dist(p[i],p[j]);
                }
            }
        }
        return min;
    }
    public static double closestSplit(Point []p,int l,int n)
    {

        if(n-l<=3)
        {
            return bruteForce(p,n);
        }
        int mid=l+(n-l)/2;
        Point pBAR=p[mid];
        double dl=closestSplit(p,l,mid);
        double dr=closestSplit(p,mid,n);
        double d=Math.min(dr,dl);
        Point []strip=new Point[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(Math.abs(p[i].x-pBAR.x)<d)
            {
                strip[j++]=p[i];
            }
        }
        return Math.min(d,stripClosest(strip,j,d));

    }
    public static double stripClosest(Point []strip,int n,double d)
    {
        double min=d;
        Arrays.sort(strip,0,n,new pointY());
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n && (strip[i].y-strip[j].y)<min;j++){
                if(dist(strip[i],strip[j])<min)
                {
                    min=dist(strip[i],strip[j]);
                }
            }
        }
        return min;
    }
    public static double closest(Point []p,int n)
    {

        Arrays.sort(p,Point::compareTo);
        return closestSplit(p,0,n);
    }

    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of point in the plane: ");
        n =sc.nextInt();
        Point []p=new Point[n];
        int x,y;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            p[i]=new Point(x,y);
        }
        System.out.println(closest(p,n));
    }
}
class pointY implements Comparator<Point> {
    public int compare(Point p2, Point p3)
    {
        return Integer.compare(p2.y,p3.y);
    }
}
