import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int r=0;
    while(num!=0)
    {
    int digit=num%10;
    r=r*10+digit;
    num=num/10;
    }
    System.out.println(r);
  }
}