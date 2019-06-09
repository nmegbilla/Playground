import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int exp=sc.nextInt();
    double pow=Math.pow(base,exp);
    System.out.print(pow);
  }
}
    
    