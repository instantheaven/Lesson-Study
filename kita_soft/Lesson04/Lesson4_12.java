import java.util.*;
public class Lesson4_12{
  public static void main(String[] args){
    int sum=0;
    int num=0;
    while(sum<100){
      System.out.print("数値>");
      num=new Scanner(System.in).nextInt();
      sum+=num;
    }
    System.out.printf("合計は%dです%n",sum);
  }
}
