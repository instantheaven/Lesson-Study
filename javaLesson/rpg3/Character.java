public abstract class Character{
	String name;
	int hp;
	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
	public abstract void attack(Matango m);//抽象メソッド
}
abstract class Dancer extends Character{
	public void dance(){
		System.out.println("ダンスで魅了した");
	}
}
class SalsaDancer extends Dancer{
	@Override
	public void attack(Matango m){
		this.dance();
		System.out.println("マタンゴはつられて踊った");
	}
}
//abstractクラスにするかattackメソッドを完成させないとコンパイルエラー
//インスタンスを作りたいクラスか途中のクラスかで判断する
class Hero extends Character{
	@Override
	public void attack(Matango m){
		System.out.println("マタンゴに攻撃した");
		m.hp-=10;
	}
}
