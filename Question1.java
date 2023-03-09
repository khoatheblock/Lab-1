import java.util.Random;
class Rectangle
{
   Random random = new Random();
   private int width = random.nextInt(50 - 0) + 0;
   private int height = random.nextInt(50 - 0) + 0; 
   public Rectangle()
   {       
      if (width <= 0)
      {
         System.out.println("Error message!");
         width = 1;
      }    
      if (height <= 0)
      {
         System.out.println("Error message!");
         height = 1;
      } 
   }
   public void Visualize()          
   {
      for(int i = 0; i < height; i++)   
         for(int j = 0; j < width; j++)       
            System.out.println("* ");                    
   } 
   public static void main(String[] args)
   {
      Rectangle Rec1 = new Rectangle();
      Rec1.Visualize();
      Rectangle Rec2 = new Rectangle();
      Rec2.Visualize();
      Rectangle Rec3 = new Rectangle();
      Rec3.Visualize();
      Rectangle Rec4 = new Rectangle();
      Rec4.Visualize();
      Rectangle Rec5 = new Rectangle();
      Rec5.Visualize();
   } 
}


