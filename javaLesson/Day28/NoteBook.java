import java.util.*;
public class NoteBook extends Book{
	String words="";

	public NoteBook(){
		super();
	}
	public NoteBook(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void writing(){
		Scanner scan=new Scanner(System.in);
		System.out.print("書き込む内容を入力してください >");
		String word=scan.nextLine();
		words+=word;
	}
	public void pagesAndPrice(){
		super.pagesAndPrice();
		//System.out.println("ページ数:"+this.page);
		//System.out.println("価格:"+this.price);
		System.out.println("内容:"+words);
	}
}
