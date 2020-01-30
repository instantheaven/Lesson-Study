import java.util.*;
public class Lesson4_A15{
  public static void main(String[] args){
    System.out.print("4以上の整数>");
    int value=new Scanner(System.in).nextInt();
    int n;

    for(n=2;n<=(value/2);n++){
      if((value%n)==0){
	break;
      }
    }

    if(n>(value/2)){
      System.out.printf("%dは素数です%n",value);
    }else{
      System.out.printf("%dは素数ではありません%n",value);
    }
  }
}
