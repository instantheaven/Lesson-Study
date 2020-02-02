import java.util.*;
public class Lesson6_3{
	public static void main(String[] args){
		System.out.print("ひとつめの整数>");
		int x=new Scanner(System.in).nextInt();
		System.out.print("ふたつめの整数>");
		int y=new Scanner(System.in).nextInt();
		System.out.print("みっつめの整数>");
		int z=new Scanner(System.in).nextInt();
		int a=maxOf(x,y);//x,yの数値をaに代入することで3つ目のzと比較できるようにしている
		System.out.printf("%dと%dと%dの中で最も大きいのは%d%n",x,y,z,maxOf(a,z));
	}
	public static int maxOf(int a,int b){
		int ans;
		if(a>b){//aの方がbより大きい場合
			ans=a;//aをansに代入して
		}else{//そうでない場合
			ans=b;//bをansに代入して
		}
		return ans;//大きい数値を返す
	}
}
