package javaapplication44;
public class Point {
    private int x;
    private int y;
    public Point(){
        
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;        
    }
    public void setPointx(int x1){
        this.x=x1;
    }
    public int getPointx(){
        return x;
    }
    public void setPointy(int y){
        this.y=y;
    }
    public int getPointy(){
        return y;
    }
    public double distance(Point p){
        double d=Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(y-p.y)));
        return d;
    }
    static double distance(Point p1,Point p2){
        double d=Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)));
        return d;
    }
    public double slope(Point p){
        double slope;
        slope=((double)(y-p.y)/(x-p.x));
        return slope;
    }
}
