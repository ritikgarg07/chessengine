package engine.src.engine;

/*	Player is an abstract class encapsulating the functionality of the ai, user
	getMove should return a Move object
	@getMove should also ensure the Move returned is legal
*/
abstract class Player{
	Colour colour;

	Player(Colour colour){
		this.colour = colour;
	}
	
	final public void setColour(Colour colour){
		this.colour = colour;
	}
	
	final public Colour getColour(){
		return this.colour;
	}
	abstract public Move getMove();
}

/*	User extends the Player and represents a human/non-ai player
	getMove calls the I/O to obtain a user move
	returns an object out of that Move
	@TODO legalmove check
*/
class User extends Player{
	User(Colour colour){
		super(colour);
	}
	public Move getMove() {
		// will call I/O class to obtain the user's move
		// tempoarily calls a1 to a1 move always
		final Move userMove = Move.newMove("a1a1");
		// ensure userMove is legal
		return userMove;
	}
}

/* 	AI extends the PLayer and represent the game AI
	getMove calls the evaluate/search function and returns a move
	@TODO legalmove check
*/
class AI extends Player {
	AI(Colour colour){
		super(colour);
	}
	public Move getMove() {
		// will call the search function
		// temporarily calls e1 to e2
		final Move aiMove = Move.newMove("e1e2");
		// ensure aiMove is legal
		return aiMove;
	}
}
