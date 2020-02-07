public class Student{
	int id;
	String name;
	int score;
	public Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	public Student(int id,String name,int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	void showInfo(){
		System.out.printf("%s...%d点",this.name,this.score);
	}
}
