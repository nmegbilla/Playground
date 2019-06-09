import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int count=1;
      for(int r=1;r<=n;r++)
      {
        for(int c=1;c<=r;c++)
        {
          if(count%2==1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
          count=count+1;
        }
          System.out.print("\n");
        }
    }
}