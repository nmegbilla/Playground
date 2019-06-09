import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
        for(int c=(n-r);c>=1;c--)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=(r*2)-1;j++)
        {
          System.out.print("*");
        }
        System.out.print("\n");
      }
	}
}