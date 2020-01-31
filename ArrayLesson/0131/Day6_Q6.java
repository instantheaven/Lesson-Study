import java.util.*;
public class Day6_Q6{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++){
			Random random=new Random();
			int ran=random.nextInt(101);
			nums[i]=ran;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
