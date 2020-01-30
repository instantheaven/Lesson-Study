import java.util.*;
public class Lesson5_8{
  public static void main(String[] args){
		int count=10;
		int nums[]=new int[count];

		for(int i=0;i<10;i++){
			System.out.printf("整数を入力してください(%d)>",count);
			nums[i]=new Scanner(System.in).nextInt();
			count--;
		}
		printOf(nums);
		sort(nums);
		printOf(nums);
	}
	public static void sort(int[] n){
		int temp;
		for(int i=0;i<n.length-1;i++){
			for(int j=n.length-1;j>i;j--){
				if(n[j-1]>n[j]){
					temp=n[j-1];
					n[j-1]=n[j];
					n[j]=temp;
				}
			}
		}
	}
	public static void printOf(int[] n){
		for(int i=0;i<n.length;i++){
			if(i==n.length-1){
				System.out.println(n[i]);
			}else{
				System.out.print(n[i]+",");
			}
		}
	}
}
