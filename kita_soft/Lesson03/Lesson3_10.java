import java.util.*;
public class Lesson3_10{
  public static void main(String[] args){
    System.out.print("xの数値を入力>");
    int x=new Scanner(System.in).nextInt();
    System.out.print("yの数値を入力>");
    int y=new Scanner(System.in).nextInt();
    if(x<y && x%2==0 && y%2==0){
      System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
    }
    if(x==y && x<0 &&){
      System.out.println("xとyは等しく、かつ、負の数である。");
    }
    if(x<y || (x%2==0)){
      System.out.println("xはyより小さい、または、xは偶数である。");
    }
    if((x<=10 || x>=100) && (y>=10 && y<=100)){
      System.out.println("xは10以下または100以上で、yは10以上かつ100以下である。");
    }
    if(!(x<0 && y<0)){
      System.out.println("xもyも負の数である、ではない");
    }
  }
}
