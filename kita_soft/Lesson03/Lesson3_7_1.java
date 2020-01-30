import java.util.*;
public class Lesson3_7_1{
  public static void main(String[] args){
    System.out.print("試験の点数>");
    int score=new Scanner(System.in).nextInt();
    if(score>=60){
      System.out.println("合格");
    }else{
      System.out.println("不合格");
    }
  }
}
