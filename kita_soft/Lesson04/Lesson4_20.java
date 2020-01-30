import java.util.*;
public class Lesson4_20{
  public static void main(String[] args){
    System.out.print("サイズ>");
    int size=new Scanner(System.in).nextInt();
    for(int i=0;i<=size;i++){
      for(int j=0;j<i;j++){
	System.out.print("$");
      }
      System.out.println();
    }
    System.out.println();
  }
}
