public class Lesson1_7{
  public static void main(String[] args){
    int x=3;
    int y=7;
    int temp=0;

    temp=x;//3
    x=y;//x==7
    y=temp;
    
    System.out.println("x="+x+",y="+y);
  }
}
