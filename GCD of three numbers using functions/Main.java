import java.util.Scanner;
public class Main{
  public static int great(int x,int y,int z)
{
if((x>=y) && (x>=z))
{
return x;
}
else if((y>=x) && (y>=z))
{
return y;
}
else if((z>=x) && (z>=y))
{
return z;
}
return 0;
}
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int gcd;
for(gcd=great(x,y,z);gcd>=1;gcd--)
{
if((x%gcd==0) && (y%gcd==0) && (z%gcd==0))
{
break;
}
}
System.out.print(gcd);
	}
}