public class Day8_Q1{
	public static void main(String[] args){
		int[] nums={3,8,10,5,4};
		//for(int i=0;i<nums.length;i++){
		//	if(nums[i]%2!=0){
		//		System.out.println(nums[i]);
		//	}
		//}
		for(int n:nums){
			if(n%2!=0){
				System.out.println(n);
			}
		}
	}
}
