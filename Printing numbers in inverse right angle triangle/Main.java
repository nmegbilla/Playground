import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int a=n;a!=0;a--)
      {
        for(int b=a;b!=0;b--)
        {
          System.out.print(b);
        }
        System.out.print("\n");
      }
	}
}