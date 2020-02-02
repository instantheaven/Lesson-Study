public class Lesson6_8{
	int count=0;//配列numsの為に用意
	int[] nums=new int[20];//出来上がった数字を入れておく用
	public static void main(String[] args){
		this.nums[0]=0;//nums[1],nums[2]は最初の数字を代入してる
		this.nums[1]=1;
		this.count=1;//0と1で1までindexを使っているから
		add(0,1);
		for(int i=11-1;i<=20-1;i++){//11番目から20番目 indexがひとつずれている為
			System.out.printf("%d ",this.nums[i]);
		}
		System.out.println();
	}
	public void add(int a,int b){
		if(this.count>20-1){//index分
			return;
		}
		int c=a+b;//足したいものが3つ目になるから
		this.count++;
		this.nums[this.count]=c;//出来上がったフィボナッチ数列を代入している
		add(b,c);//また呼び出した時に2つ目と3つ目となってずれていく
	}

	//public static void main(String[] args){
	//	for(int n=11;n<=20;n++){
	//		System.out.print(Fibonacci(n)+" ");
	//	}
	//}
	//static int Fibonacci(int n){
	//	if(n==0){
	//		return 0;
	//	}else if(n==1){
	//		return 1;
	//	}else{
	//		return Fibonacci(n-2)+Fibonacci(n-1);
	//	}
	//}
}
