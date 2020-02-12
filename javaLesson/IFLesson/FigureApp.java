import java.util.*;
public class FigureApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=0;
		while(true){
		System.out.print("1.立方体 / 2.球 / 3.終了 >");
		num=scan.nextInt();
			switch(num){
				case 1:
					System.out.print("1辺の長さを入力して下さい >");
					double oneSide=scan.nextDouble();
					new Cube(oneSide).displayAreaInfo();
					break;
				case 2:
					System.out.print("半径を入力して下さい >");
					double radius=scan.nextDouble();
					new Sphere(radius).displayAreaInfo();
					break;
				case 3:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}

interface SolidFigure{
	void displayAreaInfo();
}

class Cube implements SolidFigure{
	double oneSide=0;//立方体1辺の長さ
	public Cube(double oneSide){
		this.oneSide=oneSide;
	}
	@Override
	public void displayAreaInfo(){
		double volume=Math.pow(oneSide,3);
		double surfaceArea=Math.pow(oneSide,2)*6;
		System.out.printf("立方体 1辺の長さ=%.2f 体積=%.2f 表面積=%.2f%n",this.oneSide,volume,surfaceArea);
	}
}

class Sphere implements SolidFigure{
	double radius=0;//球の半径
	public Sphere(double radius){
		this.radius=radius;
	}
	@Override
	public void displayAreaInfo(){
		double volume=4*Math.PI*Math.pow(radius,3)/3;
		double surfaceArea=4*Math.PI*Math.pow(radius,2);
		System.out.printf("球 半径=%.2f 体積=%.2f 表面積=%.2f%n",this.radius,volume,surfaceArea);
	}
}
