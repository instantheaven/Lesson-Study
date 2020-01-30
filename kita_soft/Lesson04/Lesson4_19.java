import java.util.*;
public class Lesson4_19{
  public static void main(String[] args){
    int num=0;
    int sum=0;
    int count=0;
    do{
      System.out.print("数値を入力(0で終了)>");
      num=new Scanner(System.in).nextInt();
      sum+=num;
      if(num!=0){
	count++;
      }
    }while(num!=0);
    sum/=count;
    System.out.printf("平均値は%dです%n",sum);
  }
}
