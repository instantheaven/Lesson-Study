import java.util.*;
public class MethodLesson13{
	public static void main(String[] args){
		int[] arr1={1,2,3};
		int[] arr2={4,5,6,7};
		int[] arr3=arrMerge(arr1,arr2);//arrMargeメソッドにarr1,arr2を渡してる
		System.out.println(Arrays.toString(arr3));
	}
	public static int[] arrMerge(int[] arr1,int[] arr2){
		int[] retArr=new int[arr1.length+arr2.length];//arr1とarr2の要素数を足した要素数の配列
		for(int i=0;i<retArr.length;i++){//上記要素数の配列分回す
			if(i<arr1.length){
				retArr[i]=arr1[i];
			}else{
				retArr[i]=arr2[i-arr1.length];//arr2を0番目から入れるために
			}
		}
		return retArr;
	}
}
