import java.util.*;
public class Lesson3_5{
  public static void main(String[] args){
      System.out.print("正の整数値>");
    int num=new Scanner(System.in).nextInt();
    if(num%2==0){
      System.out.println("偶数です");
    }else{
      System.out.println("奇数です");
    }
  }
}
