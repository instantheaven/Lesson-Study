import java.util.*;
public class Lesson4_7{
  public static void main(String[] args){
    String teamA="巨人";//チーム名
    String teamB="阪神";
    int scoreA=0;//teamAの点数を数えている
    int scoreB=0;//teamBの点数を数えている

    for(int i=1;i<=9;i++){//1回から9回までの分を回す
      System.out.printf("%d回表、%sの得点は？ ",i,teamA);
      //scoreAに入力された数値を足して代入
      scoreA+=new Scanner(System.in).nextInt();

      System.out.printf("%d回裏、%sの得点は？ ",i,teamB);
      //scoreBに入力された数値を足して代入
      scoreB+=new Scanner(System.in).nextInt();
    }
    //両チームの点数を表示
    System.out.printf("%s:%d点,%s:%d点%n",teamA,scoreA,teamB,scoreB);

    if(scoreA>scoreB){//scoreAの値がscoreBより大きい場合
      System.out.printf("%sの勝ち%n",teamA);
    }else if(scoreB>scoreA){//scoreBの値がscoreAより大きい場合
      System.out.printf("%sの勝ち%n",teamB);
    }else{//上記条件のどちらでもない場合
      System.out.println("引き分けです");
    }
  }
}
