public class Book{
	String name;

	public String toString(){
		return "名前:"+this.name;
	}
	@Override
	public boolean equals(Object o){
		if(this==o){return true;}//同じアドレスだったらreturn true
		if(o instanceof Book){//Bookクラスのインスタンスかどうか
			Book b=(Book)o;//ダウンキャストしてObjectからBookに
			if(this.name.equals(b.name)){//nameフィールドの内容がまったく同じなら
				return true;
			}
		}
		return false;
	}
}
