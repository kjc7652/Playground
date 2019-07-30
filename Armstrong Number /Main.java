import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner( System.in );
      int n=in.nextInt();
      int temp=n;
      int i=0;
      int sum=0;
    /*  for(int i=0;n<=0;n=n/10)
      {
        i=n%10;
        sum=sum+(i^3);
      }
         */
      while(temp!=0)
      {
        i=temp%10;
        sum=sum+(i*i*i);
        temp=temp/10;
      }
         if(sum == n)
         System.out.println("Armstrong Number");
         else
         System.out.println("Not a Armstrong Number");
	}
}