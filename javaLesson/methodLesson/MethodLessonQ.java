import java.util.*;
public class MethodLessonQ{
	static int calcTotalFee(int costExcludeTax,int tax){
		double totalFee=costExcludeTax*(1+tax/100d);
		return (int)totalFee;
	}

	public static void main(String[] args){
		int cost=0;
		int price;
		System.out.print("消費税は何%ですか>");
		int tax=new Scanner(System.in).nextInt();
		do{
			System.out.print("価格を入力(0でお会計)>");
			price=new Scanner(System.in).nextInt();
			cost+=price;
		}while(price !=0);
		int totalFee=calcTotalFee(cost,tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です。",totalFee);
	}
}
