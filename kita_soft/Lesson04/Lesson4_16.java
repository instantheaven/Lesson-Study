import java.util.*;
public class Lesson4_16{
  public static void main(String[] args){
    System.out.print("2以上の数値>");
    int n=new Scanner(System.in).nextInt();
    for(int x=2;n>1;x++){
      while((n%x)==0){
	System.out.print(x+" ");
	n/=x;
      }
    }
    System.out.println();
  }
}
