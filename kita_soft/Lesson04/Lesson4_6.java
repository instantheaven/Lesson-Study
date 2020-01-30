import java.util.*;
public class Lesson4_6{
  public static void main(String[] args){
    int WinCount=0;
    int LoseCount=0;
    for(int i=0;i<10;i++){
      System.out.print("整数 0か1>");
      int num=new Scanner(System.in).nextInt();
      if(num==0){
	LoseCount++;
      }
      if(num==1){
	WinCount++;
      }
    }
    System.out.println("勝ちの総数:"+WinCount+" 負けの総数:"+LoseCount);
  }
}
