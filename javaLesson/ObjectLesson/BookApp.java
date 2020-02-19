public class BookApp{
	public static void main(String[] args){
		Book b=new Book();
		b.name="ツレがウツになりまして";
		System.out.println(b.toString());
		//System.out.println(b);//結果が上と同じ
		Book b1=new Book();
		b1.name="ツレがウツになりまして";
		if(b.equals(b1)){
			System.out.println("同じ内容です");
		}else{
			System.out.println("違う内容です");
		}
	}
}
