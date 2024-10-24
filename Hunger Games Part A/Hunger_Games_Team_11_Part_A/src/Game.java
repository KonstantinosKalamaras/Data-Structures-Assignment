/*
 * ÁÍÅÓÔÇÓ ÊÁÚÌÁÊÁÌÉÄÇÓ‚ AÅÌ: 9627 ÔÇËÅÖÙÍÏ: 6980613638 webmail: anestisk@ece.auth.gr
 * ÊÙÍÓÔÁÍÔÉÍÏÓ ÊÁËÁÌÁÑÁÓ‚ ÁÅÌ:9716 ÔÇËÅÖÙÍÏ: 6974965296 webmail: kkalamar@ece.auth.gr
 */


public class Game {

	int round;
	
	// round: game round
	
	// Constructors
	Game(){
		this.round=0;
	}
	
	Game(int round){
		this.round=round;
	}
	
	// Getters/Setters	
	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	//main function
	public static void main(String[] args) {
		//initiate objects
		Game a = new Game(1);
		Board b = new Board(20, 20, 6, 10, 8);
		int [][] sw = {{-2,-2}, {2,-2}, {2,2}, {-2,2}}; //this list must be {{-,-}, {+,-}, {+,+}, {-,+}} in order to work properly
		b.setWeaponAreaLimits(sw);
		int[][] sf = {{-3,-3},{3,-3},{3,3},{-3,3}}; //this list must be {{-,-}, {+,-}, {+,+}, {-,+}} in order to work properly
		b.setFoodAreaLimits(sf);
		int[][] st = {{-4,-4},{4,-4},{4,4},{-4,4}}; //this list must be {{-,-}, {+,-}, {+,+}, {-,+}} in order to work properly
		b.setTrapAreaLimits(st);
		b.createBoard();
		Player p1 = new Player (1,"Player1",b,0,-10,-10,null,null,null);
		Player p2 = new Player (2,"Player2",b,0,10,10,null,null,null);
		String[][] s = new String[b.getN()][b.getM()];
		//game ends when board becomes 4X4
		while(b.getM() > 4 && b.getN() > 4) {
			System.out.println("It's round : " + a.round);
			//resize board every 3 rounds
			if(a.getRound() % 3 == 0 ) b.resizeBoard(p1, p2);
			//make move
			p1.move();
			p2.move();
			s = b.getStringRepresentation();
			//print board
			for(int i = 0; i < b.getN(); i++) {
				for(int j = 0; j < b.getM(); j++) {
					System.out.print(s[i][j]);
				}
				System.out.println();
			}
			System.out.println("P1-> " + p1.getX() + "," + p1.getY());
			System.out.println("P2-> " + p2.getX() + "," + p2.getY());
			System.out.println("P1 score: " + p1.getScore());
			System.out.println("P2 score: " + p2.getScore());
			//increase round
			a.setRound(a.getRound() + 1);	
		}
		System.out.println("P1 score: " + p1.getScore());
		System.out.println("P2 score: " + p2.getScore());
		if(p1.getScore() != p2.getScore()) System.out.println("Player" + (p1.getScore() > p2.getScore() ? p1.getId():p2.getId()) + " wins!");
		else System.out.println("It's a tie");
	}

}

