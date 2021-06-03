package javaapplication44;
public class programOfPoint {
    public static void main(String[] args) {
        Point p1=new Point(9,5);
        Point p2=new Point(6,9);

        System.out.println("distance: "+p1.distance(p2));
        System.out.println("distance:  "+Point.distance(p1, p2));
        System.out.println("slope: "+p1.slope(p2));
    }    
}
