import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count;
      for(int i=1;i<=n;i++)
      {
        count=0;
        for(int j=2;j<=i/2;j++)
        {
          if(i%j==0)
          {
            count++;
            break;
          }
        }
        if((count==0) &&(i!=1))
        {
          System.out.println(i);
        }
      }
          
	}
}