import java.util.*;
public class Lesson4_5{
  public static void main(String[] args){
    int sum=0;
    int n=10;
    for(int i=0;i<n;i++){
      System.out.println("整数>");
      int num=new Scanner(System.in).nextInt();
      sum+=num;
    }
    sum/=n;
    System.out.println("平均値は"+sum+"です");
  }
}
