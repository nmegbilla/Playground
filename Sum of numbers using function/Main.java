import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int sum1=0;
    for(int i=1;i<=n;i++)
    {
      sum1=sum1+i;
    }
    return sum1;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum_num=sum(n);
      System.out.print(sum_num);
	}
}