import java.util.*;
public class Lesson6_4{
	public static void main(String[] args){
		//Scanner scan=new Scanner(System.in);
		//System.out.print("サイズ>");
		//int sizeNum=scan.nextInt();
		//triangle(sizeNum);
		triangle(3);
		System.out.println();
		triangle(4);
		System.out.println();
		triangle(5);
		System.out.println();
	}
	public static void triangle(int a){
		String str="$";//表示する記号
		for(int i=0;i<a;i++){//mainメソッドからの引数分
			for(int j=0;j<=i;j++){
				System.out.print(str);//記号を表示
			}
			System.out.println();
		}
	}
}
