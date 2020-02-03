package engine;

public enum Type{
	PAWN('P'),BISHOP('B'),ROOK('R'),KNIGHT('N'),KING('K'),QUEEN('Q');
	private char type;
	Type(char type){
		this.type=type;
	}
	char getLowerChar() {
		return Character.toLowerCase(type);
	}
	char getUpperChar() {
		return Character.toUpperCase(type);
	}
}
