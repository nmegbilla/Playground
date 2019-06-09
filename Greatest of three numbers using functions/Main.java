import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int max=great(a,b,c);
      System.out.print(max);
	}
  public static int great(int a,int b,int c)
  {
    if((a>b) && (a>c))
    {
      return a;
    }
    if((b>a) && (b>c))
    {
      return b;
    }
    if((c<a) && (c>b))
    {
      return c;
    }
    return 0;
  }
    
}