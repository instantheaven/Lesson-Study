import java.util.*;
public class TimeLesson{
	public static void main(String[] args){
		System.out.println("33+50=");
		long start=System.currentTimeMillis();
		int ans=new Scanner(System.in).nextInt();
		long end=0;
		if(ans==83){
			end=System.currentTimeMillis();
			System.out.println("回答までの時間は"+(end-start)+"(ms)");
		}else{
			System.out.println("答えが違います");
		}
	}
}
