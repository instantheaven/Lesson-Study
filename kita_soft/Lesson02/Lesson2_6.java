import java.util.*;
public class Lesson2_6{
  public static void main(String[] args){
    System.out.print("あなたの年齢を入力してください>");
    int age=new Scanner(System.in).nextInt();
    int days=age*365;
    System.out.println("あなたの生まれてから現在までのおおよその日数は"+days+"日です");
  }
}
