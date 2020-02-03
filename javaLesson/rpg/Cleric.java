import java.util.*;
public class Cleric{
	String name;
	int hp=50;
	final int MAX_HP=50;
	int mp=10;
	final int MAX_MP=10;

	public void selfAid(){
		System.out.println(this.name+"はセルフエイドを唱えた！");
		this.hp=this.MAX_HP;//最大HPまで回復
		this.mp-=5;//MPを5消費
		System.out.println("HPが最大まで回復した");
	}
	public void aid(Hero h){
		System.out.println(this.name+"はエイドを唱えた！");
		h.hp+=10;//勇者のHPを10回復
		this.mp-=5;
		System.out.println(h.name+"のHPが10回復した");
	}
	public int pray(int sec){
		System.out.println(this.name+"は"+sec+"秒間天に祈った！");
		int recoverMp=sec+new Random().nextInt(3);
		if(this.mp+recoverMp>MAX_MP){//最大MPを超えてしまった場合
			recoverMp=MAX_MP-this.mp;//回復量
		}
		this.mp+=recoverMp;
		System.out.println("MPが"+recoverMp+"回復した");
		return recoverMp;
	}
}
