import java.util.ArrayList;
import java.util.Random;

public class Deck {

	
		
			private ArrayList<Card> cards;
			// TODO: Please implement the constructor (30 points)
			ArrayList<Card>usedCard;//發出去的排記錄在
			ArrayList<Card> store;
			public int nUsed;//發了幾張牌
			public Deck(int nDeck) {
				cards = new ArrayList<Card>();

				for (int i = 1; i <= nDeck; i++) {// 第一個迴圈是可以多副牌，設變數i。一開始為一副牌，慢慢可累加

					for (Card.Suit s:Card.Suit.values()){// 
						for (int rank = 1; rank<= 13; rank++) {// 第三個迴圈是牌組
							Card card = new Card(s, rank);
							cards.add(card);// 新的卡加到清單裡
						}
					}
				}shuffle();
				// 1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
				// Hint: Use new Card(x,y) and 3 for loops to add card into deck
				// Sample code start
				// Card card=new Card(1,1); ->means new card as clubs ace
				// cards.add(card);//新的卡加到清單裡
				// Sample code end

}

			
			public void shuffle(){
				store=new ArrayList<Card>();
			    for(int u=0;u<51;u++){
				Random rnd=new Random();
				int j=rnd.nextInt(52-u);//Arrary是0~51

				store.add(cards.get(j));//亂數抽出一張存在store裡，重複52次就有一副牌
				
				cards.remove(cards.get(j));//亂數有可能抽到重覆，所以要把抽過的刪掉
				//System.out.println(store.size());
			    }
				for(int t=0;t<51;t++){
					cards.add(store.get(t));
				}
				nUsed=0;//發了牌會有兩張存在裡面，所以要歸零
			    
			}
			public Card getOneCard(){
				Card out=new Card(cards.get(nUsed).getSuit(),cards.get(nUsed).getRank());
				usedCard=new ArrayList<Card>();
				usedCard.add(cards.get(nUsed));//將發出的牌存在usedCard
				nUsed++;//每放一次加一
				//System.out.println(nUsed);
				if(nUsed==52){
				//檢查牌發完
		        
				shuffle();
				nUsed=0;}
				return out;
			}

			// TODO: Please implement the method to print all cards on screen (10
			// points)
			public void printDeck() {

				// Hint: print all items in ArrayList<Card> cards,
				// TODO: please implement and reuse printCard method in Card class (5
				// points)
				int a = cards.size();// 設a為清單中的大小，這樣就算是多副牌也可以套進迴圈裡
				for (int j = 0; j <= a - 1; j++) {// j是位子 ex:new
													// Card(cards.get(0).getSuit(),
													// cards.get(0).getRank());拿出"第"(0,0)牌

					Card card = new Card(cards.get(j).getSuit(), cards.get(j).getRank());// Card是下面的//card是名稱
					card.printCard();//呼叫下面的printCard
				}
			}

			public ArrayList<Card> getAllCards() {
				return cards;

	}

}