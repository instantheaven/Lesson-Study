import java.util.*;
public class Lesson2_5{
  public static void main(String[] args){
    System.out.print("整数(1つ目)を入力>");
    int x=new Scanner(System.in).nextInt();
    System.out.print("整数(2つ目)を入力>");
    int y=new Scanner(System.in).nextInt();
    int sum=x+y;
    int avg=sum/2;
    System.out.println("平均値は"+avg);
  }
}
