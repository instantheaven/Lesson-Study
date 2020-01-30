import java.util.*;
public class Lesson4_22{
  public static void main(String[] args){
    int x=0;
    int y=1;
    int sum=0;
    while(sum<=1000){
      System.out.print(sum+",");
      sum=x+y;
      x=y;
      y=sum;
    }
    System.out.println();
  }
}
