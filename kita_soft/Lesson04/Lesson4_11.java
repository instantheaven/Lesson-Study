import java.util.*;
public class Lesson4_11{
  public static void main(String[] args){
    System.out.print("何個？>");
    int x=new Scanner(System.in).nextInt();    
    for(int i=0;i<x;i++){
      System.out.print(i%10);
    }
    System.out.println();
  }
}
