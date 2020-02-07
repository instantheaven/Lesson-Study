import java.util.*;
public class PairPro0205A{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		final int Q_COUNT=3;
		final int Q_WORD=10;
		int count=0;
		long start=0; long end=0;
		char[] alp={//アルファベットの配列
			'a','b','c','d','e','f','g',
			'h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u',
			'v','w','x','y','z',
		};

		while(true){
			for(int i=0;i<Q_COUNT;i++){
				char[] qAns=randomQ(alp);
				String ans=scan.nextLine();
				start=System.currentTimeMillis();
				char[] cAns=ans.toCharArray();
				for(int j=0;j<Q_WORD;j++){
					if(alp[i]==cAns[i]){
						count++;
					}else{
						System.out.println("ミス");
					}
				}
				if(count==3){
					end=System.currentTimeMillis();
				System.out.println((end-start)+"(ms)");
					break;
				}
			}
		}
	}
	public static char randomQ(char[] c){//シャッフル
		char[] ran=new char[c.length];
		for(int i=0;i<c.length;i++){
			int index=new Random().nextInt(26);
			ran[i]=c[index];
		}
		for(char r:ran){
			return System.out.print(ran[r]);
		}
	}
}
