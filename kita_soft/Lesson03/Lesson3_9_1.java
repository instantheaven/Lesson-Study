import java.util.*;
public class Lesson3_9_1{
  public static void main(String[] args){
    System.out.printf("曜日の入力をしてください%n>0=日曜、 1=月曜、 2=火曜、 3=水曜、 4=木曜、 5=金曜、 6=土曜%n");
    int week=new Scanner(System.in).nextInt();
    System.out.printf("時間帯を入力してください%n>0=午前、 1=午後、 2=夜間%n");
    int time=new Scanner(System.in).nextInt();
    if(week==1 || week==4){
      System.out.println("開いています");
    }else if((week==2 || week==5) && (time==1 || time==2)){
      System.out.println("開いています");
    }else if(week==3 && (time==0 || time==1)){
      System.out.println("開いています");
    }else if(week==6 && time==0){
      System.out.println("開いています");
    }else{
      System.out.println("休診です");
    }
  }
}
