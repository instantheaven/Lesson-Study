import java.util.*;
public class Day8_Q3{
	public static void main(String[] args){
		int[] nums1=new int[5];
		for(int i=0;i<nums1.length;i++){
			nums1[i]=new Random().nextInt(100)+1;
		}
		System.out.println("***nums1***");
		for(int n:nums1){
			System.out.println(n);
		}
		int[] nums2=new int[5];
		for(int i=0;i<nums2.length;i++){
			nums2[i]=nums1[i]*3;
		}
		System.out.println("***nums2***");
		for(int n:nums2){
			System.out.println(n);
		}
	}
}
