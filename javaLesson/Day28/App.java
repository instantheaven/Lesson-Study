import java.util.*;
public class App{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int bookPage=scan.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int bookPrice=scan.nextInt();
		System.out.print("ノートのページ数を入力して下さい >");
		int notePage=scan.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		int notePrice=scan.nextInt();

		Book b1=new Book(bookPage,bookPrice);
		NoteBook n1=new NoteBook(notePage,notePrice);

		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4. 終了 >");
			int action=scan.nextInt();
			switch(action){
				case 1:
					b1.pagesAndPrice();
					break;
				case 2:
					n1.pagesAndPrice();
					break;
				case 3:
					n1.writing();
					break;
				case 4:	
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
