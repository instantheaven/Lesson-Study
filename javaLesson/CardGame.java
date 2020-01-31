import java.util.*;
public class CardGame {

	public static void main(String[] args) {
		String[] suits={"♠","♦","♥","♣"};
		//フォントの関係で表示に不具合が出る場合は下の配列を使う
		//String[] suits={"S","D","H","C"};
		String[] nums={"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] deck=createDeck(suits,nums);
		showCards(deck);
		shuffleDeck(deck);
		String[] hands=createHands(0,5,deck);
		//hands=new String[]{"♠1","♠K","♠10","♠Q","♠J"};
		showHands(hands,suits);
		if(isRoyal(hands,suits)){
			System.out.println("ロイヤルストレートフラッシュです！");
		}else{
			System.out.println("ロイヤルストレートフラッシュではありません。");
		}
		//System.out.println(isFlash(new String[]{"♠1","♠1","♠1","♠1","♥1"}));
		//System.out.println(isStraightFlash(new String[]{"♠1","♠K","♠10","♠Q","♠J"},suits));
		getStraightFlushCount(deck,suits);
		
		
	}
	public static String[] createDeck(String[] suits,String[] nums){
		
		String[] deck=new String[suits.length*nums.length];
		for(int i=0;i<deck.length;i++){
			deck[i]=suits[i/nums.length]+nums[i%nums.length];
		}
		return deck;
	}
	public static void showCards(String[] cards){
		for(int i=0;i<cards.length;i++){
			System.out.printf("%-5s",cards[i]);
			if((i+1)%13==0){
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void shuffleDeck(String[] deck){
		for(int i=0;i<deck.length-1;i++){
			int index=new Random().nextInt(deck.length-i);
			String card=deck[index];
			deck[index]=deck[deck.length-1-i];
			deck[deck.length-1-i]=card;
		}
	}
	public static String[] createHands(int firstIndex,int cardCount,String[] deck){
		String[] hands=new String[cardCount];
		for(int i=firstIndex;i<firstIndex+cardCount;i++){
			hands[i]=deck[i];
		}
		return hands;
	}
	public static int getSuitIndex(String card,String[] suits){
		String suit=String.valueOf(card.charAt(0));
		int i;
		for(i=0;i<suits.length;i++){
			if(suit.equals(suits[i])){
				break;
			}
		}
		return i;
	}
	public static int getCardNum(String card){
		String strNum=card.substring(1,card.length());
		
		int num=0;
		switch(strNum){
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
			num=Integer.parseInt(strNum);
			break;
		case "J":
			num=11;
			break;
		case "Q":
			num=12;
			break;
		case "K":
			num=13;
		}
		return num;
	}
	public static void sortCards(String[] cards,String[] suits){
		for(int i=0;i<cards.length-1;i++){
			for(int j=i+1;j<cards.length;j++){
				if(
				getCardNum(cards[i])>getCardNum(cards[j])
				|| (getCardNum(cards[i])==getCardNum(cards[j]) && getSuitIndex(cards[i],suits) > getSuitIndex(cards[j],suits))
				){
					String card=cards[i];
					cards[i]=cards[j];
					cards[j]=card;
				}
			}
		}
	}
	public static void showHands(String[] hands,String[] suits){
		sortCards(hands,suits);
		showCards(hands);
	}
	public static boolean isFlush(String[] hands){
		char first=hands[0].charAt(0);
		int i;
		for(i=1;i<hands.length;i++){
			if(hands[i].charAt(0) != first){
				break;
			}
		}
		return i==hands.length;
	}
	public static boolean isRoyal(String[] hands,String[] suits){
		sortCards(hands,suits);
		if(!isFlush(hands)){
			return false;
		}
		String[] sample={"1","10","J","Q","K"};
		int i;
		for(i=0;i<hands.length;i++){
			String num=hands[i].substring(1,hands[i].length());
			if(!num.equals(sample[i])){
				break;
			}
		}
		return i==hands.length;
		
	}
	//ストフラが出るまで回し続け何回目で出たかを表示するメソッド
	public static void getStraightFlushCount(String[] deck,String[] suits){
		int count=0;
		while(true){
			count++;
			shuffleDeck(deck);
			String[] hands=createHands(0,5,deck);
			if(isRoyal(hands,suits)){
				showHands(hands,suits);
				System.out.println(count);
				break;
			}
		}
	}

}
