import java.util.*;
public class Day6_Q5{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean[] battle={true,false,false,true,true};
		System.out.print("第何戦の結果を調べますか(1~5)>");
		int num=scan.nextInt();
		if(battle[num-1]){
			System.out.printf("第%d戦は[勝ち]です。",num);
		}else{
			System.out.printf("第%d戦は[負け]です。",num);
		}
	}
}
