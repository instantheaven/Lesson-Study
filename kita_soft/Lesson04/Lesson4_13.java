import java.util.*;
public class Lesson4_13{
  public static void main(String[] args){
    int countS=0;
    int countB=0;
    int num=0;
    while(countS<3 && countB<4){
      System.out.print("ストライク=1 or ボール=2 ?>");
      num=new Scanner(System.in).nextInt();
      if(num==1){
	countS++;
      }
      if(num==2){
	countB++;
      }
    }
    System.out.printf("%dボール,%dストライク%n",countB,countS);
  }
}
