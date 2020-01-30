import java.util.*;
public class Lesson5_5{
  public static void main(String[] args){
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int value=Integer.parseInt(br.readLine());
		System.out.print("数値を入力>");
		int value=new Scanner(System.in).nextInt();
		int binary[]=new int[16];
		//配列にbinaryに0か1を代入する

		for(int i=binary.length-1;i>=0;i--){
			binary[i]=value%2;//valueを2で割った余り(剰余)配列bainaryに代入
			value=value/2;//valueを2で割った商をvalueに代入
		}

		for(int i=0;i<16;i++){
			System.out.print(binary[i]);
		}
		System.out.println();
  }
}
