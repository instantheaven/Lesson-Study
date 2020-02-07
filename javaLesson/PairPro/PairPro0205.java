import java.util.*;
public class PairPro0205{
	public static void main(String[] args){
		int count=0;
		long start=0;
		long end=0;
		char[] alp={//アルファベットの配列
			'a','b','c','d','e','f','g',
			'h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u',
			'v','w','x','y','z',
		};
		char[] arrQ=new char[10];


		while(true){
			for(int i=0;i<arrQ.length;i++){
				int index=new Random().nextInt(alp.length);
				arrQ[i]=alp[index];
			}
			for(char c:arrQ){
				System.out.print(c);
			}
			System.out.println();

			String ans=new Scanner(System.in).nextLine();
			start=System.currentTimeMillis();
			char[] c=ans.toCharArray();
			for(int j=0;j<arrQ.length;j++){
				if(arrQ[j]==c[j]){
					count++;
					if(count==3){
						end=System.currentTimeMillis();
						System.out.println((end-start)+"(ms)");
						break;
					}
				}else{
					System.out.println("ミス");
				}
			}
			System.out.println();
		}
	}
}
