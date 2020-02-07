import java.util.*;
public class Monkey{
	Scanner scan=new Scanner(System.in);
	String name;
	int age;
	Monkey(){//初期化のところで値をいれる処理(mainで決める必要がない)
		System.out.print("おさるの名前を決めてください:>");
		this.name=scan.nextLine();
		System.out.print("おさるの年齢を決めてください:>");
		this.age=scan.nextInt();
	}
	public void action(){
		while(true){
			System.out.print("おさるに何をさせますか？");
			System.out.print("1...挨拶、2...竹馬、3...逆立ち、4...終了>");
			int action=scan.nextInt();
			switch(action){
				case 1:
					System.out.println("こんにちは"+this.name+"("+this.age+"才)"+"です。よろしく！");
					break;
				case 2:
					System.out.println(this.name+"は上に竹馬に乗った！");
					break;
				case 3:
					System.out.println(this.name+"はひょいと逆立ちをした");
					break;
				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
