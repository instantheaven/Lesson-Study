import java.util.*;
public class Lesson5_7{
  public static void main(String[] args){
		int kuku[][]=new int[9][];//二次配列の配列変数kukuは9行

		for(int i=0;i<9;i++){
			kuku[i]=new int[9];//9列
			for(int j=0;j<9;j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		
		System.out.print("1桁の数値（1〜9に限定)を2つ入力>");
		String[] strNum=new Scanner(System.in).nextLine().split(" ");
		int num1=Integer.parseInt(strNum[0]);
		int num2=Integer.parseInt(strNum[1]);

		System.out.printf("%d×%dは%2d%n",num1,num2,kuku[num1-1][num2-1]);
  }
}
