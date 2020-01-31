public class Main2{
	public static void main(String[] args){
		Hero h=new Hero("ミナト");//直接入れられる
		//h.name="ミナト"; コンストラクタを作るとこれがいらなくなる
		h.hp=100;
		Hero h2=new Hero("ジェシカ");
		Hero h3=new Hero("カイル");
		h3.hp=200;

		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		Matango m2=new Matango();
		m2.hp=48;
		m2.suffix='B';

		h.slip();
		m1.run();
		m2.run();
		h.run();
		h2.run();
		h3.run();
	}
}
