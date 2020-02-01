package engine;

enum Type{
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

public class Piece {
	
	Type type;
	
	Player player;
	
	private int position;
	
	Piece(Type type, int position,Player player){
		this.type = type;
		this.position = position;
		this.player = player;
	}
	
	void setPos(int position) {
		this.position = position;
	}
	
	void setType(Type type) {
		this.type = type;
	}
	
	char getType() {
		if(player.colour==Colour.WHITE) {
			return this.type.getUpperChar();
		}
		return this.type.getLowerChar();
	}
	
	int getPos() {
		return this.position;
	}
	
	public static void main(String args[]) {
		Player pl = new Player();
		Type t= Type.BISHOP;
		Piece p= new Piece(t,5,pl);
		System.out.println(p.getType());
	}
}

