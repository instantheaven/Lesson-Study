public class Book{
	String title;
	int price=0;
	Book(){//引数なし
		this("未定");
	}
	Book(String title){//引数String型ひとつ
		this.title=title;
	}
	Book(String title,int price){//引数String型ひとつとint型ひとつ
		this(title);
		this.price=price;
	}
	void showStatus(){
		System.out.printf("タイトル:%s,価格:%d%n",this.title,this.price);
	}
}
