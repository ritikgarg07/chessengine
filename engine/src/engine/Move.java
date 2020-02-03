package engine.src.engine;
/*Move represents a move on the chess board a s a pair of source and destination
 * 
 * @param source- source index in board 
 * @param dest- destination index in board
 * newMove is an overloaded static method that takes input for Move
 * It verifies input ranges
 * It calls the overloaded private constructor for move and creates a Move object 
*/

public class Move {
	int source;
	int dest;
	
	public static Move newMove(String input) {
		input.trim();
		int len = input.length();
		
		if(len!=4) {
			return null;
		}
		
		int char1 = input.charAt(0)-'a';
		int char2 = input.charAt(1)-'1';
		int char3 = input.charAt(2)-'a';
		int char4 = input.charAt(3)-'1';
		if(char2>7||char2<0||char4>7||char4<0||char1<0||char1>7||char3<0||char3>7) {
			return null;
		}
		return new Move(char2*8+char1,char4*8+char3);
	}
	
	public static Move newMove(int source, int dest) {
		
		if(source<64&&source>=0&&dest<64&&dest>=0) {
		return new Move(source, dest);
		}
		
		return null;
	}
	
	private Move(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
	
	private Move(char source_col, int source_row, char dest_col, int dest_row) {
		this.source= ((source_row-1)*8)+source_col-(int)'a';
		this.dest= ((dest_row-1)*8)+dest_col-(int)'a';
	}
}
