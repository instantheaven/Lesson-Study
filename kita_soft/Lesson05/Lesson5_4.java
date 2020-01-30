import java.util.*;
public class Lesson5_4{
  public static void main(String[] args){
		int sum=0;
		int count=0;
		int nums[]=new int[10];

		while(count<10 && sum<=100){
			System.out.print("数値を入力>");
			int num=new Scanner(System.in).nextInt();
			nums[count]=num;
			sum+=num;
			count++;
		}
		for(int i=0;i<count;i++){
			System.out.printf("%d ",nums[i]);
		}
		System.out.println();

		System.out.printf("合計:%d 回数:%d %n",sum,count);
  }
}
