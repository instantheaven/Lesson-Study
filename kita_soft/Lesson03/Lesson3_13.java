import java.util.*;
public class Lesson3_13{
  public static void main(String[] args){
    System.out.printf("何月？>");
    int month=new Scanner(System.in).nextInt();
    switch(month){
      case 2:
	System.out.println("28日");
	break;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
	System.out.println("31日");
	break;
      case 4:
      case 6:
      case 9:
      case 11:
	System.out.println("30日");
	break;
      default :
	System.out.println("入力が間違っています");
	break;
    }
  }
}
