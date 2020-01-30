import java.util.*;
public class Lesson3_2{
  public static void main(String[] args){
    System.out.print("1つ目の整数>");
    int num1=new Scanner(System.in).nextInt();
    System.out.print("2つ目の整数>");
    int num2=new Scanner(System.in).nextInt();
    if(num1>num2){
      System.out.println(num1);
    }else{
      System.out.println(num2);
    }
  }
}
