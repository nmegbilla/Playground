import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      int res=1;
      while(exp!=0)
      {
        res*=base;
        --exp;
      }
      System.out.print(res);
    }
}