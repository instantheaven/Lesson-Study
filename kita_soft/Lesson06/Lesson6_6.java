import java.util.*;
public class Lesson6_6{
	//public static void main(String[] args){
	//	Scanner scan=new Scanner(System.in);
	//	System.out.print("何の段(九九)>");
	//	int kukuNum=scan.nextInt();scan.nextLine();
	//	kukuAns(kukuNum);
	//}
	//public static void kukuAns(int a){
	//	for(int i=1;i<=9;i++){
	//			System.out.printf("%2d ",a*i);
	//	}
	//	System.out.println();
	//}
	public static void main(String[] args){
		for(int i=1;i<=9;i++){//1の段から9の段を繰り返す/行だけ
			kukuAns(i);//ひとつの段ずつ出力
		}
	}
	public static void kukuAns(int a){
		for(int i=1;i<=9;i++){//1*1などの列の部分
			System.out.printf("%2d ",a*i);//九九を計算
		}
		System.out.println();
	}
}
