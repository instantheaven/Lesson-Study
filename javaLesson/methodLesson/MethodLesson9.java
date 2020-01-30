import java.util.*;
public class MethodLesson9{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double weight=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=new Scanner(System.in).nextDouble();
		double bmi=calcBMI(weight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",weight,height,bmi);
	}
	static double calcBMI(double weightKg,double heightCm){
		double heightM=heightCm/100;
		double bmi=weightKg/(heightM*heightM);//体重(kg)/(身長(m)*身長(m))
		return bmi;
		//return weightKg/(heightCm/100)*(heightCm/100);
	}
}
