import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s=n*n;
    return(s);
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int square_root=square(n);
      System.out.print(square_root);
	} 
}