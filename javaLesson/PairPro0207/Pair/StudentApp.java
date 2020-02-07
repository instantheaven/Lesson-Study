import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("生徒は何人>");
		int HowManyNum=scan.nextInt();scan.nextLine();
		Student[] Student=new Student[HowManyNum];
		String name="";
		int score=0;
		for(int i=0;i<HowManyNum;i++){
			System.out.printf("%d人目の名前>",i+1);
			name=scan.nextLine();
			System.out.printf("%d人目の点数>",i+1);
			score=scan.nextInt();scan.nextLine();
			Student s1=new Student(i,name,score);
			Student[i]=s1;
		}
		for(int i=0;i<HowManyNum;i++){
			Student[i].showInfo();
		}
	}
}
