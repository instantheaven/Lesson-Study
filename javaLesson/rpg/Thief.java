public class Thief{
	String name;
	int hp=40;//初期値 後から上書きできる 教科書には初期値なし
	int mp=5;
	//教科書P364の通り
	/*public Thief(String name,int hp,int mp){
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	public Thief(String name,int hp){
		this(name,hp,5);
	}
	public Thief(String name){
		this(name,40);
	}*/

	//通常のやり方(書き方)
	public Thief(String name){
		this.name=name;
	}
	public Thief(String name,int hp){//名前を指定してHPを上書きしたいなら
		this(name);
		this.hp=hp;
	}
	public Thief(String name,int hp,int mp){//HPもMPも上書きしたいなら
		this(name,hp);
		this.mp=mp;
	}
}
