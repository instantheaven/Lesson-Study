import java.util.*;
public class Lesson4_14{
  public static void main(String[] args){
    int strike=0;//ストライク
    int ball=0;//ボール
    int judge=0;//判定するために用意した変数

    //ストライクの値が3未満かつボールの値が4未満の時に繰り返す
    while(strike<3 && ball<4){
      System.out.print("ストライク=1 or ボール=2 or ファウル=3 ? >");
      //ストライクかボールかファウルかをjudgeで受け取る
      judge=new Scanner(System.in).nextInt();
      //judgeで受け取った値が3かつstrikeの値が２未満ならstrikeにインクリメント
      if(judge==3 && strike<2){
	       strike++;
      }
      //judgeの値が1ならばstrikeにインクリメント
      if(judge==1){
	       strike++;
      }
      //judgeの値が2ならばballにインクリメント
      if(judge==2){
	       ball++;
      }
    }
    System.out.printf("%dボール,%dストライク%n",ball,strike);//結果を出力
  }
}
