import java.util.*;
public class ObjectArr{
	public static void main(String[] args){
		//int[] arr={3,5,7};
		Sword s1=new Sword("炎の剣",20);//Swordクラスのインスタンスをメモリ空間に
		Sword s2=new Sword("氷の剣",18);
		Sword s3=new Sword("ヒノキの剣",10);
		Sword s4=new Sword("こんぼう",5);
		/*
		Sword[] swords=new Sword[4];
		swords[0]=s1;
		swords[1]=s2;
		swords[2]=s3;
		swords[3]=s4;
		*/
		Sword[] swords2={//Sword型の配列のsword2(変数)というのはインスタンスの住所を入れられる
			new Sword("雷神の剣",100),//Sword型のインスタンスをメモリ空間に新しく確保
			new Sword("はやぶさの剣",50),
			new Sword("土の剣",8),
			s1,s2,s3,s4
		};
		showSwords(swords2);
		System.out.print("どの武器を装備しますか>");
		int num=new Scanner(System.in).nextInt();
		Sword sword=swords2[num];
		//Sword sword=swords2[new Random().nextInt(swords2.length)];
		Hero h1=new Hero("ミナト");
		h1.equip(sword);
		//h1.sword=sword;
		Matango m1=new Matango();
		m1.suffix='A';
		h1.attack(m1);
		m1.run();

	}
	public static void showSwords(Sword[] sw){//Swordインスタンスが入ってる配列
		for(int i=0;i<sw.length;i++){
			System.out.printf("%d...%s(%d)%n",i,sw[i].name,sw[i].damage);
		}
	}
}
