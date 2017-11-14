

public class Card {
	enum Suit{Clubs,Hearts,Diamonds,Spades}
	//private static final Object Clubs = null;
	//private static final Object Diamonds = null;
	//private static final Object Hearts = null;
	//private static final Object Spades = null;
	 Suit a;

	//class Card {
		//private int suit; // Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3,
							// Spades=4
		private int rank; // 1~13
		
		/**
		 * @param s
		 *            suit
		 * @param r
		 *            rank
		 */
		public Card(Suit s, int vaule) {
			 a=s;
			rank = vaule;
		}

		// TODO: 1. Please implement the printCard method (20 points, 10 for suit,
		// 10 for rank)

		public void printCard() {
			// Hint: print (System.out.println) card as suit,rank, for example:
			// print 1,1 as Clubs Ace

			if (getSuit().equals(a.Clubs))

				System.out.print(" Clubs, ");
			if (getSuit().equals(a.Diamonds))

				System.out.print(" Diamonds, ");
			if (getSuit().equals(a.Hearts))
				System.out.print(" Hearts, ");
			if (getSuit().equals(a.Spades))
				System.out.print(" Spades, ");
			if (getRank() == 1)
				System.out.println("Ace");
			if (getRank() == 2)
				System.out.println("2");
			if (getRank() == 3)
				System.out.println("3");
			if (getRank() == 4)
				System.out.println("4");
			if (getRank() == 5)
				System.out.println("5");
			if (getRank() == 6)
				System.out.println("6");
			if (getRank() == 7)
				System.out.println("7");
			if (getRank() == 8)
				System.out.println("8");
			if (getRank() == 9)
				System.out.println("9");
			if (getRank() == 10)
				System.out.println("10");
			if (getRank() == 11)
				System.out.println("Jack");
			if (getRank() == 12)
				System.out.println("Queen");
			if (getRank() == 13)
				System.out.println("King");
		}

		public Suit getSuit() {//Suit被enum變成一種資料型態
			return a;
		}

		public int getRank() {
			return rank;
		}
	


	}


