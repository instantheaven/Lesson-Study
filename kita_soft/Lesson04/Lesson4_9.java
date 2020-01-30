import java.util.*;
public class Lesson4_9{
  public static void main(String[] args){
    int max=0;
    int min=0;
    int num=0;
    for(int i=0;i<10;i++){
      System.out.print("整数>");
      num=new Scanner(System.in).nextInt();
      if(i==0){
	max=num;
	min=num;
      }
      if(num>max){
	max=num;
      }
      if(num<min){
	min=num;
      }
    }
    System.out.printf("最大値は%d,最小値は%d%n",max,min);
  }
}
