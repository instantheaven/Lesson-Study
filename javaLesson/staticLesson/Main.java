public class Main{
	public static void main(String[] args){
		Hero.showNo();//Heroクラスを検知したらstaticメンバのロードが始まる
		Hero h1=new Hero("John");
		h1.showInfo();
		Hero h2=new Hero("Paul");
		h2.showInfo();
		Hero.showNo();
	}
}
class Hero{
	static int no;	//staticフィールド(いくつインスタンスが作られたか)
	int id;			//インスタンスフィールド
	String name;
	
	Hero(String name){//コンストラクタ
		Hero.no++;//staticフィールドに1増やす
		this.id=Hero.no;//上を元にid
		this.name=name;
	}
	void showInfo(){//インスタンスメソッド
		System.out.printf("name:%s id:%d%n",this.name,this.id);
	}
	//staticフィールドを表示するメソッド
	//staticメソッドの中からインスタンスメソッドを呼んだりしたらエラー
	static void showNo(){//staticメソッド
		System.out.println(Hero.no);//この場合Heroは省略可能
	}
}
