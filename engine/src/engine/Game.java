package engine;

// import engine.Colour;

/*	Wrapper class for each game instance
*/

// currently instantiates two users

public class Game {
	
	Player user1, user2;

	public void setUserColour(Colour colour) {
		switch(colour) {
			case WHITE: user1 = new User(Colour.WHITE);
						user2 = new User(Colour.BLACK);
						break;
			case BLACK: user1 = new User(Colour.BLACK);
						user2 = new User(Colour.WHITE);
						break;			
		}
	}
	
	public static void main(String args[]) {
		Game game = new Game();

		// would ideally set User colour, for now it sets user1 colour;
		game.setUserColour(Colour.WHITE);
		Board currentBoard = new Board(game.user1, game.user2);
		currentBoard.displayBoard();
		Move move= Move.newMove(99,42);
		if(move!=null) {
			currentBoard.updateBoard(move);
		}
		else {
			System.out.print("\ninvalid!!\n");
		}
		currentBoard.updateBoard(Move.newMove(12, 28));
		currentBoard.displayBoard();
	}
}
