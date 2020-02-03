public class Main3{
	public static void main(String[] args){
		Hero h1=new Hero("ミナト");
		Hero h2=new Hero("ジェシカ");
		h1.sleep();//眠ってHP100＋
		h2.sleep();
		Matango m1=new Matango();
		m1.suffix='A';
		Cleric c=new Cleric();
		c.name="アラン";
		h1.slip();
		h2.slip();
		m1.run();
		c.aid(h1);//回復
		c.pray(3);//祈り
		Sword sword=new Sword();
		sword.name="炎の剣";
		sword.damage=10;
		h1.sword=sword;//剣を装備
		Sword sword2=new Sword();
		sword2.name="氷の剣";
		sword2.damage=8;
		h2.sword=sword2;
		h1.attack(m1);//m1を攻撃
		h2.attack(m1);
		h1.run();
		h2.run();
	}
}
