public class SuperHero extends Hero{
	boolean flying;
	public SuperHero(){
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	public void fly(){
		this.flying=true;
		System.out.println("飛び上がった！");
	}
	public void land(){
		this.flying=false;
		System.out.println("着地した！");
	}
	@Override
	public void run(){
		System.out.println(this.name+"は撤退した");
		//このクラスにはネームフィールドがないけど
		//継承してるからいきなりthis.nameを書いている
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
