import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int value=1;
      for(int r=1;r<=n;r++)
      {
        for(int sp=1;sp<=(n-r);sp++)
        {
          System.out.print(" ");
        }
        for(int c=1;c<=r;c++)
        {
          System.out.print(value+" ");
          value++;
        }
        System.out.print("\n");
      }
    }    
}