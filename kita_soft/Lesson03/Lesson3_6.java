import java.util.*;
public class Lesson3_6{
  public static void main(String[] args){
    System.out.print("整数値>");
    int num=new Scanner(System.in).nextInt();
    if(num>=0){
      if(num%2==0){
	System.out.println("正の偶数です");
      }else{
	System.out.println("正の奇数です");
      }
    }else{
      if(num%2==0){
	System.out.println("負の偶数です");
      }else{
	System.out.println("負の奇数です");
      }
    }
  }
}
