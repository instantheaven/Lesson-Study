import java.util.*;
public class Lesson5_2{
  public static void main(String[] args){
    int nums[]=new int[10];
    for(int i=0;i<10;i++){
      System.out.print("数値を入力>");
      nums[i]=new Scanner(System.in).nextInt();
    }
    System.out.println("数値を逆順にして出力");
    for(int i=nums.length-1;i>=0;i--){
      System.out.println(nums[i]);
    }
  }
}
