import java.util.*;
public class ZombieApp{
	public static void main(String[] args){
		Random rand=new Random();
		Person[] persons=new Person[100];//100人
		for(int i=0;i<persons.length;i++){
			int hp=rand.nextInt(99)+1;//人間のHP
			persons[i]=new Person(hp);
		}
		Zombie[] teamA=new Zombie[3];
		Zombie[] teamB=new Zombie[3];
		char s='A';
		teamA[0]=new Zombie(50,s++);//hpとsuffix(teamAゾンビリーダー)
		char sb='a';
		teamB[0]=new Zombie(50,sb++);//hpとsuffix(teamBゾンビリーダー)
		for(int i=0;i<4;i++){
			if(i<2){
				teamA[i+1]=teamA[0].bitePerson(persons[i],s++);
			}else{
				teamB[i-1]=teamB[0].bitePerson(persons[i],sb++);
			}
		}
		for(Zombie z:teamA){
			z.created();
		}
		for(Zombie z:teamB){
			z.created();
		}
	}

}
class Zombie{
	int hp;
	int mp=10;
	char suffix;
	Zombie(int hp){//コンストラクタ
		this.hp=hp;
	}
	Zombie(int hp,char suffix){//コンストラクタ
		this(hp);//自分のクラスにある他のコンストラクタの呼び出し
		this.suffix=suffix;
	}
	//Zombieが戻り値
	//かじったPersonのHPをもとにゾンビが生成される
	Zombie bitePerson(Person p,char suffix){//メソッド
		p.bite();
		Zombie z=new Zombie(p.hp,suffix);
		return z;
	}
	void created(){
		System.out.printf("うぉ～(%s,%d)%n",this.suffix,this.hp);
	}
}
class Person{
	int hp;
	boolean isAlive=true;
	Person(int hp){
		this.hp=hp;
	}
	void bite(){
		System.out.println("ぎゃー");
		this.isAlive=false;
	}
}
