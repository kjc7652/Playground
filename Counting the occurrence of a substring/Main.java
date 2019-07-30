import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner in = new Scanner( System.in );
  String str = in.nextLine();
  String str_1 = in.nextLine();
  int str_len = str.length();
  int str_1_len = str_1.length();
  int matching_idx = -1;
  int count = 0;
  for(int i = 0; i <= (str_len - 1) - (str_1_len - 1); i++)
  {
    boolean is_matching = true;
    for(int j=0; j < str_1_len; j++)
    {
      if(str.charAt(i+j) != str_1.charAt(j))
      {
        is_matching = false;
      }
    }
    if(is_matching == true)
    {
      count++;
    }
  }
  System.out.print(count);
}
}