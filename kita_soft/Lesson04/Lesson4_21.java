import java.util.*;
public class Lesson4_21{
  public static void main(String[] args){
    System.out.print("サイズ>");
    int size=new Scanner(System.in).nextInt();
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
	if(i==j || (size-i-1)==j){
	  System.out.print("X");
	}else{
	  System.out.print(" ");
	}
      }
	System.out.println();
    }
  }
}
