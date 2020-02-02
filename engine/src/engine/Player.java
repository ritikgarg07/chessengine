package engine;
enum Colour{
	WHITE,BLACK;
}
public class Player {
	
	private Colour colour;
	
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	public Colour getColour() {
		return this.colour;
	}
}
