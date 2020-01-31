import java.util.*;
public class Lesson4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("数値入れてね");
		int n=scan.nextInt();scan.nextLine();
		System.out.print("名前入れてね");
		String name=scan.nextLine();
		System.out.printf("%sさんは%dと入れました",name,n);
		//空読みの処理をしていないとエラーが起きる。名前を入れられない
		//nextIntは次の数値を取ってくる、そのあとのエンターが改行コードに
		//だからnextLineが改行コードに反応して
		//名前を入れられず終わる
	}
}
