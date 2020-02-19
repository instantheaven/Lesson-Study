public class BookApp2{
	public static void main(String[] args){
		Book2 book1=new Book2();
		book1.showStatus();
		Book2 book2=new Book2("頭の体操");
		book2.showStatus();
		Book2 book3=new Book2("君の名は",1200);
		book3.showStatus();
	}
}
