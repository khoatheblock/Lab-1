import java.util.Random;
class Triangle
{           
    Random random = new Random();
    private int side1 = random.nextInt(50 - 0) + 0;
    private int side2 = random.nextInt(50 - 0) + 0; 
    private int side3 = random.nextInt(50 - 0) + 0; 
    public Triangle()
    {       
        if (side1 <= 0)
        {
            System.out.println("Error message!");
            side1 = 1;
        }    
        if (side2 <= 0)
        {
            System.out.println("Error message!");
            side2 = 1;
        } 
        if (side3 <= 0)
        {
            System.out.println("Error message!");
            side3 = 1;
        } 
    }
    public void verify()          
    {
        if ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side2 + side1)) && (side1 != side2) && (side2 != side3) && (side1 != side3))    
            System.out.println("It is a scalene triangle.");
        else if ((side1 == side2) && (side2 == side3) && (side1 == side3))
            System.out.println("It is an equilateral triangle.");
        else if ((side1 == side2) || (side2 == side3) || (side1 == side3))
            System.out.println("It is an isosceles triangle.");        
        else System.out.println("It is not triangle.");     
    }  
    public static void main(String[] args)
    {
        Triangle Tri1 = new Triangle();
        Tri1.verify();
    }
}
  

