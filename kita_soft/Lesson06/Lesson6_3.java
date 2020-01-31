import java.util.*;
public class Lesson6_3{
	public static void main(String[] args){
		System.out.print("ひとつめの整数>");
		int x=new Scanner(System.in).nextInt();
		System.out.print("ふたつめの整数>");
		int y=new Scanner(System.in).nextInt();
		System.out.print("みっつめの整数>");
		int z=new Scanner(System.in).nextInt();
		int a=maxOf(x,y);
		System.out.printf("%dと%dと%dでは%dの方が最も大きい数値です",x,y,z,maxOf(a,z));
	}
	public static int maxOf(int x,int y){
		int ans=0;
		if(x>y){
			ans=x;
		}else if(x<y){
			ans=y;
		}
		return ans;
	}
}
