import java.util.*;
public class Day25{
	public static void main(String[] args){
		System.out.print("今日の年は？>");
		int todayYear=new Scanner(System.in).nextInt();
		System.out.print("今日の月は？");
		int todayMonth=new Scanner(System.in).nextInt();
		System.out.print("今日の日は？");
		int toDay=new Scanner(System.in).nextInt();
		System.out.print("誕生の年は？");
		int birthYear=new Scanner(System.in).nextInt();
		System.out.print("誕生日の月は？");
		int birthMonth=new Scanner(System.in).nextInt();
		System.out.print("誕生日の日は？");
		int birthDay=new Scanner(System.in).nextInt();

		System.out.printf("あなたの年齢は%d歳です。",ageOf(todayYear,birthYear,todayMonth,birthMonth,toDay,birthDay));
	}
	public static int ageOf(int numY,int numBy,int numM,int numBm,int numD,int numBd){
		int ans=numY-numBy;
		//月が同じでかつ現在の日より誕生日が進んでいるか現在の月より誕生月の方が進んでいる場合
		if((numM==numBm && numD<numBd) || numM<numBm){
			return ans-=1;//その場合は年を1減らす
		}else{
			return ans;
		}
	}
}
