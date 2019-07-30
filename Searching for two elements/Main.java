import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
     int search_elem_1= in.nextInt();
     int search_elem_2= in.nextInt();
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         if(arr[idx]==search_elem_1)
         {
          // System.out.print("element_1_index = ");
           System.out.println(idx);
         }
        else if(arr[idx]==search_elem_2)
        {
       //   System.out.print("element_2_index = ");
          System.out.println(idx);
        }
      }
     if(search_elem_2==1000)
          System.out.println("-1");
   }
}