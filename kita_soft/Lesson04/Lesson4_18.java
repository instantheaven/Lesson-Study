import java.util.*;
public class Lesson4_18{
  public static void main(String[] args){
    int num=0;
    int sum=0;
    do{
      System.out.print("数値を入力(0で終了)>");
      num=new Scanner(System.in).nextInt();
      sum+=num;
    }while(num!=0);
    System.out.printf("合計は%dです%n",sum);
  }
}
