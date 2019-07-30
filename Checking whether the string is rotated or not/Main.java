import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
  //  StringBuilder sb_l = new StringBuilder(str); 
  //  StringBuilder sb_r = new StringBuilder(str1); 
  //  int str_len = sb_l.length();
    String temp = str.concat(str);
    if(temp.contains(str1))
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}