public class CarApp{
	public static void main(String[] args){
		new F1().run();//変数に入れずに直接
		new Truck().run();
	}
}
abstract class Car{//Carはインスタンスを作ることができない/抽象クラス
	String name;
	abstract void run();
}
class F1 extends Car{//具象クラス
	@Override
	void run(){
		System.out.println("ファーーーーン");
	}
}
class Truck extends Car{
	@Override
	void run(){
		System.out.println("ゴー");
	}
}
