import java.util.*;
public class Day6_Q6{
	public static void main(String[] args){
		int[] nums=new int[5];
		Random random=new Random();
		for(int i=0;i<nums.length;i++){
			int ran=random.nextInt(101);
			nums[i]=ran;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
