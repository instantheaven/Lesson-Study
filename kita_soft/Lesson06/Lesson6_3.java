import java.util.*;
public class Lesson6_3{
	public static void main(String[] args){
		System.out.print("ひとつめの整数>");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("ふたつめの整数>");
		int num2=new Scanner(System.in).nextInt();
		System.out.printf("%dと%dでは%dの方が最も大きい数値です",num1,num2,maxOf(num1,num2));
	}
	public static int maxOf(int x,int y){
		if(x>y){
			return x;
		}else if(x<y){
			return y;
		}
	}
}
