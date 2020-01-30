//練習問題 5 - 3
//次のプログラムを作成しなさい。

//10 個の数値を入力する。
//入力された数値を偶数と奇数に分類して表示する。
//表示例：
//偶数：42 54 32 8
//奇数：7 35 71 13 21 45

import java.util.*;
public class Lesson5_3{
	public static void main(String[] args){
		final int num=10;//何回入力するかを定数で宣言
		//実際に入力された値が入る配列numsを定数num分の要素数で宣言
		int nums[]=new int[num];
		int even[]=new int[num];//偶数を入れる配列
		int odd[]=new int[num];//奇数を入れる配列

		//num回入力してもらいたのでfor文
		for(int i=0;i<num;i++){//定数の数値分回る
			System.out.print("数値を入力>");
			nums[i]=new Scanner(System.in).nextInt();
		}

		System.out.println("数値を偶数と奇数に分けて出力");
		int eCount=0;//偶数がいくつかを数える
		int oCount=0;//奇数がいくつかを数える
		//偶数と奇数の数をカウントするのは後の出力のため
		for(int i=0;i<num;i++){//定数numの数値分回る
			if(nums[i]%2==0){//2で割り切れたら偶数
				even[eCount]=nums[i];//配列evenに偶数を入れていく
				eCount++;//偶数の数をインクリメントする
			}else{//それ以外は奇数
				odd[oCount]=nums[i];//配列oddに奇数を入れていく
				oCount++;//奇数の数をインクリメントする
			}
		}

		System.out.print("偶数:");//偶数の表示
		for(int i=0;i<eCount;i++){//eCount分回す
			System.out.printf("%d ",even[i]);
		}
		System.out.println();//出力を終えたら改行

		System.out.print("奇数:");//奇数の表示
		for(int i=0;i<oCount;i++){//oCount分回す
			System.out.printf("%d ",odd[i]);
		}
		System.out.println();//出力を終えたら改行
	}
}
