import java.util.*;
public class Lesson2_4{
  public static void main(String[] args){
    System.out.print("xの数値を入力>");
    int x=new Scanner(System.in).nextInt();
    System.out.print("yの数値を入力>");
    int y=new Scanner(System.in).nextInt();
    System.out.println("xとyの和は"+(x+y));
    System.out.println("xとyの差は"+(x-y));
    System.out.println("xとyの積は"+(x*y));
    System.out.println("xとyの商は"+(x/y)+" 余りは"+(x%y));
  }
}
