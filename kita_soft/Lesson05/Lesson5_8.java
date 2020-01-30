//練習問題 5 - 8
//整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。

import java.util.*;
public class Lesson5_8{
  public static void main(String[] args){
		final int count=10;//定数countを宣言して入力回数を管理
		int nums[]=new int[count];//count分の要素数の配列numsを宣言

		for(int i=0;i<count;i++){//定数count分回して入力してもらう
			System.out.printf("整数を入力してください(あと%d回)>",count);
			//入力された整数を配列numsに入れていく
			nums[i]=new Scanner(System.in).nextInt();
			count--;//あと〇回の表示の為にデクリメント
		}
		printOf(nums);//元々入力された並び
		sort(nums);//sortメソッドに引数numsを渡す
		printOf(nums);//小さい順に表示
	}

	public static void sort(int[] n){
		int temp=0;//入れ替えをするために変数tempを宣言
		for(int i=0;i<n.length-1;i++){//インデックス分回す
			for(int j=n.length-1;j>i;j--){//最後のインデックスから見ていく
				if(n[j-1]>n[j]){//一個前と今見ている(隣同士)のを比べて
					temp=n[j-1];//大きければ入れ替える
					n[j-1]=n[j];
					n[j]=temp;
				}
			}
		}
	}
	public static void printOf(int[] n){
		for(int i=0;i<n.length;i++){//全部出力するので要素数分、回す
			System.out.print(n[i]);//数値を出力
			System.out.print(i==n.length-1?"\n":",");
			//最後だったら改行 そうでなければ,
			//三項演算子
		}
	}
}