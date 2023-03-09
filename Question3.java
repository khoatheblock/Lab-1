import java.util.Random;
import java.lang.Math;
class Point
{
    Random random = new Random();
    private double x;
    private double y;        
    public Point()
    {  
        x = random.nextDouble();
        y = random.nextDouble();     
    }
    public void distance(double a, double b)          
    {
        double dis =  Math.sqrt(Math.pow((a - x), 2) + Math.pow((b - y), 2));
        System.out.println("The distance d is between " + "(" + x + ", " + y + ") and " + "(" + a + ", " + b + ") is "  + dis);         
    }  
    public static void main(String[] args)
    {
        Point A = new Point();
        A.distance(8, 6);
    }
}  

