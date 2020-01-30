import java.util.*;
public class Lesson3_12{
  public static void main(String[] args){
    System.out.printf("お好きな鮨ネタを選んでください%n1:まぐろ 2:漬けまぐろ 3:熟成まぐろ 4:中トロ 5:大トロ 6:鉄火巻き 7:備長まぐろ 8:カジキマグロ>%n");
    int sushi=new Scanner(System.in).nextInt();
    switch(sushi){
      case 1:
	System.out.println("可能性は無限大です");
	break;
      case 2:
	System.out.println("更なるステップアップが期待できます");
	break;
      case 3:
	System.out.println("洗練された技を見せつける時です");
	break;
      case 4:
	System.out.println("将来どうするかを迫られます");
	break;
      case 5:
	System.out.println("王様のような振る舞いに気をつけましょう");
	break;
      case 6:
	System.out.println("変わらない優しさが人々を安心させます");
	break;
      case 7:
	System.out.println("あなただけのカラーを大事にしてください");
	break;
      case 8:
	System.out.println("他と違うことがあなたの魅力です");
	break;
      default :
	System.out.println("まぐろ以外がお好きと見受けました");
	break;
    }
  }
}
