import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		Fruits f1=new Fruits();//インスタンス生成
		//(Javaはドットでアクセス)
		System.out.println(f1.name);//情報にアクセスして名前を表示
		System.out.println(f1.price);//情報にアクセスして値段を表示
		f1.name="バナナ";
		f1.price=50;
		f1.showInfo();//メソッド呼び出し
		Fruits f2=new Fruits("リンゴ");
		f2.price=120;
		f2.showInfo();
		Fruits f3=new Fruits("イチゴ",400);
		f3.showInfo();
		Fruits f4=new Fruits("ナシ",100);
		Fruits f5=new Fruits("みかん",50);

		
		Fruits[] fruitsArr=new Fruits[5];
		fruitsArr[0]=f1;
		fruitsArr[1]=f2;
		fruitsArr[2]=f3;
		fruitsArr[3]=f4;
		fruitsArr[4]=f5;
		
		for(Fruits f:fruitsArr){
			f.showInfo();
		}
	

		//宣言と同時に住所を与えて配列を作ることができる
		//特別ルールでnewがいらない
		Fruits[] fa2={f1,f2,f3,f4,f5};

		//上はこれと同じ
		//Fruits[] fa2=new Fruits{f1,f2,f3,f4,f5};

		//いきなり配列内でインスタンスを作ることもできる
		Fruits[] fa3={
			new Fruits("パイン",200),
			new Fruits("スイカ",240),
			//最後のセミコロンはあってもなくてもいい
			//あるとコピペがしやすい
		};
		System.out.println(fa3[0].name);
		fa3[1].showInfo();

	}
}
class Fruits{//出てくるものに着目してクラスを作っていくのがオブジェクト指向
	String name;
	int price;
	Fruits(){//引数なしのコンストラクタ
	}
	Fruits(String name){//引数ひとつのコンストラクタ
		this.name=name;
	}
	Fruits(String name,int price){//引数みっつのコンストラクタ
		this(name);//コンストラクタをオーバーロード
		this.price=price;
	}
	void showInfo(){//インスタンスメソッド
		System.out.printf("%-10s...%4d",this.name,this.price);
	}
}
