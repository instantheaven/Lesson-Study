public class BookApp{
	public static void main(String[] args){
		Book book1=new Book();
		book1.showStatus();
		Book book2=new Book("頭の体操");
		book2.showStatus();
		Book book3=new Book("君の名は",1200);
		book3.showStatus();
	}
}
