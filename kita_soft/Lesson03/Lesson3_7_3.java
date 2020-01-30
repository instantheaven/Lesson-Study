import java.util.*;
public class Lesson3_7_3{
  public static void main(String[] args){
    System.out.print("試験の点数>");
    int score=new Scanner(System.in).nextInt();
    if(score>=80){
      System.out.println("優");
    }else if(score>=70){
      System.out.println("良");
    }else if(score>=60){
      System.out.println("可");
    }else{
      System.out.println("不可");
    }
  }
}
