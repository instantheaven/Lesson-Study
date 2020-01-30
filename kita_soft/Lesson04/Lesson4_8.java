import java.util.*;
public class Lesson4_8{
  public static void main(String[] args){
    int max=0;
    int num=0;
    for(int i=0;i<10;i++){
      System.out.print("正の整数>");
      num=new Scanner(System.in).nextInt();
      if(num>max){
	max=num;
      }
    }
    System.out.printf("最大値は%d%n",max);
  }
}
