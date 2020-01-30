import java.util.*;
public class Lesson3_7_2{
  public static void main(String[] args){
    System.out.print("試験の点数>");
    int score=new Scanner(System.in).nextInt();
    if(score>=80){
      System.out.println("たいへんよくできました。");
    }else if(score>=60){
      System.out.println("よくできました。");
    }else{
      System.out.println("ざんねんでした。");
    }
  }
}
