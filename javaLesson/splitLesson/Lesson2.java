import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		int sum=0;
		System.out.print("カンマ区切りで数字入れてね>");
	//	String[] nums=new String[new Scanner(System.in).nextLine().split(",")];
	//	System.out.println(Arrays.toString(str));
		String input=new Scanner(System.in).nextLine();
		String[] nums=input.split(",");
		for(String n:nums){
			sum+=Integer.parseInt(n);
		}
		System.out.printf("合計は%d",sum);
	}
}
