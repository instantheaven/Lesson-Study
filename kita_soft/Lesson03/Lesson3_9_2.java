import java.util.*;
public class Lesson3_9_2{
  public static void main(String[] args){
    System.out.printf("曜日の入力をしてください%n>0=日曜、 1=月曜、 2=火曜、 3=水曜、 4=木曜、 5=金曜、 6=土曜%n");
    int week=new Scanner(System.in).nextInt();
    System.out.printf("時間帯を入力してください%n>0=午前、 1=午後、 2=夜間%n");
    int time=new Scanner(System.in).nextInt();

    //1:診療中 0:休診
    int[][] open={
      {0,0,0},//日曜
      {1,1,1},//月曜
      {0,1,1},//火曜
      {1,1,0},//水曜
      {1,1,1},//木曜
      {0,1,1},//金曜
      {1,0,0},//土曜
    };
    
    if(open[week][time]==1){
      System.out.println("診療中");
    }else{
      System.out.println("休診");
    }
  }
}
