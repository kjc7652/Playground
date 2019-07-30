import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner( System.in );
      int n=in.nextInt();
      int sum=0,i=0;
      int temp=n;
     /* for(int i=0;n!=0;n=n/10)
      {
        i=n%10;
        
      } */
      while(temp!=0)
      {
        i=temp%10;
          int fact=1;
           while(i!=0)
           {
           fact=fact*i;
           i--;
           }
        sum=sum+fact;
        temp=temp/10;
      }
         if( sum==n )
         System.out.println("Yes");
         else
         System.out.println("No");
	}
}