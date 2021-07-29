import java.util.*;
public class AreaCircle
{
   public static void main(String args[])
   {
      float rad;
      double area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius of circle:");
      rad=sc.nextInt();
      area=rad*rad*3.14;
      System.out.println("Area of circle:"+area);
   }
}
 
//OUTPUT
/*C:\Users\91773\Documents\Java Program>java AreaCircle
Enter radius of cirle:
2
Area of circle:12.56*/