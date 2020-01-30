public class Calc{
	public static void main(String[] args){
		int a=10; int b=2;
		int total=CalcLogic.tasu(a,b);
		int delta=CalcLogic.hiku(a,b);
		//Math.max(a,b),Math.min(a,b),Integr.parseInt("10")
		//Arrays.toString(arr)
		System.out.println("足すと"+total+"、引くと"+delta);
	}
}
