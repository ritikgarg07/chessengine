package engine;
import engine.Type;

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
		if(player.getColour()==Colour.WHITE) {
			return this.type.getUpperChar();
		}
		return this.type.getLowerChar();
	}
	
	int getPos() {
		return this.position;
	}
}

