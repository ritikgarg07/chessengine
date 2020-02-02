package engine;

public class Game {
	
	Player user = new Player();
	Player ai = new Player();
	
	public void setUserColour(Colour colour) {
		switch(colour) {
			case WHITE: user.setColour(Colour.WHITE);
						ai.setColour(Colour.BLACK);
						break;
			case BLACK: user.setColour(Colour.BLACK);
						ai.setColour(Colour.WHITE);
						break;			
		}
	}
	
	public static void main(String args[]) {
		Game game =  new Game();
		game.setUserColour(Colour.WHITE);
		Board currentBoard = new Board(game.user, game.ai);
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
