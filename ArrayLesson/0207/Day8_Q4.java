import java.util.*;
public class Day8_Q4{
	public static void main(String[] args){
		int[] nums={3,8,10,5,4};
		for(int i=0;i<nums.length/2;i++){
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		for(int n:nums){
			System.out.println(n);
		}
	}
}
