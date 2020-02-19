public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h){
		int basePoint=10;
		int recovPoint=(int)(basePoint*this.wand.getPower());
		h.setHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した!");
	}
	public void setName(String name){
		if(name.lenght()<3){
			throw new IllegalArgumentException("名前は3文字以上");
		}
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("杖が装備されていません");
		}
	}
	public void setHp(int hp){
		if(hp<0){
			this.hp=0;
		}else{
			this.hp=hp;
		}
	}
	public void setMp(int mp){
		if(mp<0){
			this.mp=0;
		}else{
			this.mp=mp;
		}
	}
}
