import java.util.*;
public class Lesson6_2{
	public static void main(String[] args){
		int num1=70; int num2=80;//適当な数値
		System.out.printf("%dと%dの平均値は%dです。%n",num1,num2,average(num1,num2));
	}
	public static int average(int x,int y){
		int ave=(x+y)/2;//mainメソッドのnum1,num2を使って平均値を計算
		return ave;
	}
}
