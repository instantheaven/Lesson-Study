import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		String str="リンゴ,ゴリラ,ラッパ";
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
		String str2="リンゴとゴリラとラクダ";
		String[] data2=str2.split("と");
		System.out.println(Arrays.toString(data2));
		//表記の揺れに対応
		//正規表現
		String str3="Mac,Win、Linux";
		String[] data3=str3.split("[,、]");//[]で囲うとこれまたはこれに
		System.out.println(Arrays.toString(data3));
	}
}
