import java.util.*;
public class Lesson4_15{
  public static void main(String[] args){
    boolean flag=false;
    int num=0;
    System.out.print("4以上の整数>");
    num=new Scanner(System.in).nextInt();
    for(int i=2;i<=num/2;i++){
      if(num%i==0){
	flag=true;
	break;
      }
    }
    if(flag==true){
      System.out.println("素数ではない");
    }else{
      System.out.println("素数です");
    }
  }
}
