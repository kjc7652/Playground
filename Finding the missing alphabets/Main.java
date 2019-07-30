import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in = new Scanner( System.in );
 // String str = in.nextLine();
  String str1 = in.nextLine();
 // str = str.trim();
//  int str_len = str.length();
  int str1_len = str1.length();
  int arr[] = new int[26];
  for( int i = 0; i <= 25; i++)
  {  
    arr[i] = 1;
  }
  int offset = 0;
    for( int i = 0; i <= (str1_len-1); i++)
  {
    char ch = str1.charAt(i);
    if( ch >= 'a' && ch <= 'z' )
    {
      offset = ch - 'a'; 
      offset = offset % 26;
      arr[offset]--;
    }
    else if( ch >= 'A' && ch <= 'Z' )
    {
      offset = ch - 'A'; 
      offset = offset % 26;
      arr[offset]--;
    }    
  }
    for( int i = 0; i <= 25; i++)
    {
      int ch = arr[i];
      if((ch == 1))
      {
        System.out.print( (char) (i + 'a') );
        System.out.print(" ");
      }
    }
}
}