import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp,rem,sum=0;
      temp=n;
      while(temp!=0)
      {
        rem=temp%10;
        sum=sum+(rem*rem*rem);
        temp=temp/10;
      }
      if(sum==n)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}