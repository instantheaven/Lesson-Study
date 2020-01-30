import java.util.*;
public class Lesson5_1{
  public static void main(String[] args){
    int nums[]=new int[10];
    for(int i=0;i<10;i++){
      System.out.print("数値を入力>");
      nums[i]=new Scanner(System.in).nextInt();
    }
    System.out.println("数値を2倍にして出力");
    for(int i=0;i<10;i++){
      System.out.println(nums[i]*2);
    }
  }
}
