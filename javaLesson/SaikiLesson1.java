import java.util.*;
public class SaikiLesson1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("数字>");
		int num=scan.nextInt();
		sumOf(num);
	}
	static int sumOf(int n){
		if(n<=1){
			return n;
		}else{
			return n+sumOf(n-1)+3+sumOf(n)+2+sumOf(n);
		}
	}
}
