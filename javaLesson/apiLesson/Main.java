import java.util.*;
public class Main{
	public static void main(String[] args){
		String s1="Java and JavaScript";
		if(s1.contains("Java")){ //この文字列が含まれているかどうか
			System.out.println("含まれています");
		}
		String s2=s1.substring(0,4); //3文字取得
		System.out.println(s2); //Java
		String s3=s1.substring(5,8); //3文字取得
		System.out.println(s3); //and
		sop("Java");
		sop(100);

		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		sb.append(" World");
		sb.append(System.lineSeparator());//改行
		sb.append("Bye!");
		sop(sb.toString());

		String name="B334890Z";
		if(isValidPlayerName(name)){
			sop(name+"はOK");
		}
		String name2=name.replaceAll("\\d","x");
		//(Bx{6}Z); こんな風に考えたけど全然間違ってた
		sop(name2);

		int result=sumOf(1,2);
		sop(result);
		result=sumOf(3,5,2,1,5,1,5,4);
		sop(result);
		int[] ret=createArr(1,2,3,4);
		sop(Arrays.toString(ret));
	}
	static void sop(Object obj){
		System.out.println(obj);
	}
	static boolean isValidPlayerName(String name){
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	static int sumOf(int a,int b,int... nums){
		int sum=a+b;
		for(int n:nums){
			sum+=n;
		}
		return sum;
	}
	static int[] createArr(int... nums){
		return nums;
	}
}
