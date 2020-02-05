public class Book{
	int page;
	int price;
	Book(){
	}
	public Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void pagesAndPrice(){
		System.out.println("ページ数:"+this.page);
		System.out.println("価格:"+this.price);
	}
}
