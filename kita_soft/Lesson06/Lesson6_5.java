import java.util.*;
public class Lesson6_5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("サイズ>");
		//次の入力がスキップしないようにnextLine()
		int sizeNum=scan.nextInt();scan.nextLine();
		System.out.print("記号>");
		String mark=scan.nextLine();
		triangle(sizeNum,mark);//サイズと記号を渡す/図形を受け取る
	}
	public static void triangle(int a,String b){//サイズと記号を受け取る
		for(int i=0;i<a;i++){//サイズ分回す
			for(int j=0;j<=i;j++){
				System.out.print(b);//記号を出力
			}
			System.out.println();
		}
	}
}
