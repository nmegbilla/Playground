import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=1;
      for(int i=1;i<=n;i++)
      {
        p=p*i;
      }
      System.out.println(p);
	}
}