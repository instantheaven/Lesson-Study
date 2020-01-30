import java.util.*;
public class Lesson3_1{
  public static void main(String[] args){
    System.out.print("xの数値>");
    int x=new Scanner(System.in).nextInt();
    System.out.print("yの数値>");
    int y=new Scanner(System.in).nextInt();
    if(x>y){
      System.out.println("xはyより大きい");
    }
  }
}
