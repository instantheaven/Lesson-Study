public class Book2{
	String title;
	int price=0;
	Book2(){
		this("未定");
	}
	Book2(String title){
		this.title=title;
	}
	Book2(String title,int price){
		this.title=title;
		this.price=price;
	}
	void showStatus(){
		System.out.printf("タイトル:%s,価格:%d%n",this.title,this.price);
	}
}
