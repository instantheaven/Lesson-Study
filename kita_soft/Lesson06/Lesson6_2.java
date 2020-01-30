public class Lesson6_2{
	public static void main(String[] args){
		int num1=70; int num2=80;
		System.out.printf("%dと%dの平均値は%dです",num1,num2,ave(num1,num2));
	}
	public static int ave(int x,int y){
		int ans=(x+y)/2;
		return ans;
	}
}
