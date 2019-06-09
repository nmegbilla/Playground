import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int op=sc.nextInt();
      switch(op)
      {
        case 1:
          int side=sc.nextInt();
          int c1=side*side;
          System.out.println(c1);
          break;
        case 2:
          int l=sc.nextInt();
          int b=sc.nextInt();
          int a=l*b;
          System.out.println(a);
          break;
        case 3:
          int base=sc.nextInt();
          int height=sc.nextInt();
          double c3=0.5*base*height;
          System.out.println(c3);
          break;
        case 4:
          int radius=sc.nextInt();
          double c4=3.14*radius*radius;
          System.out.println(c4);
          break;
      }  
    }
}