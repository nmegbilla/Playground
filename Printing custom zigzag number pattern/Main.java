import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      for(int i=0;i<n;i++)
      {
        if(i%2==0)
        {
          ++a;
          for(int j=0;j<n-1;j++)
          {
            System.out.print(a);
          }
          System.out.print(++a);
        }
        else
        {
          System.out.print(++a);
          --a;
          for(int j=0;j<n-1;j++)
          {
            System.out.print(a);
          }
        }
        System.out.print("\n");
      }
	}
}