//練習問題 6 - 7
//ある数が素数かどうかを判定するメソッドを作成しなさい。

//このメソッドを使用して 10000 以上 10100 未満のi
//素数をすべて表示するプログラムを作成しなさい。

import java.util.*;
public class Lesson6_7{
	public static void main(String[] args){
		for(int i=10000;i<10100;i++){//10000以上10100未満の素数を表示するため
			if(primeNumAns(i)==true){//戻り値がtrueならば素数
				System.out.printf("%d ",i);//出力
			}
		}
		System.out.println();
	}
	public static boolean primeNumAns(int a){
		//元の数の半分までの数で割り切れる数字があるかを調べれば素数かどうかがわかる
		//1はどの数字でも割り切れるから調べる必要がない(i=2)
		//(半分を超えると自身を割り切れることがない)
		for(int i=2;i<=a/2;i++){
			//2以上aの半分以下の数字で割り切れる数字があるか
			if(a%i==0){
				return false;//素数ではない
			}
		}
		return true;//素数である
	}
}
