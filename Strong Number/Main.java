import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp,remainder,sum=0,i,fact;
      temp=n;
      while(temp>0)
      {
        fact=1;
        i=1;
        remainder=temp%10;
        while(i<=remainder)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        temp=temp/10;
      }
      if(n==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      }
}