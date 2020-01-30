import java.util.*;
public class Lesson3_8{
  public static void main(String[] args){
    System.out.print("中間試験の点数>");
    int MidTest=new Scanner(System.in).nextInt();
    System.out.print("期末試験の点数>");
    int FinTest=new Scanner(System.in).nextInt();
    int sum=MidTest+FinTest;
    if(sum>=100 && (MidTest>=90 || FinTest>=90)){
      System.out.println("合格");
    }else if(sum>=130){
      System.out.println("合格");
    }else if(MidTest>=60 && FinTest>=60){
      System.out.println("合格");
    }else{
      System.out.println("不合格");
    }
  }
}
