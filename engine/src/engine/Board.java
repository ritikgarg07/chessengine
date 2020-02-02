package engine;

public class Board {
	Piece board [] = new Piece[64];
	Player user,ai;
	/*
	 * Board(FEN){
	 * }
	 */
	Board(Player user, Player ai){
		
		this.user = user;
		this.ai = ai;
		
		for(int i=8;i<16;i++) {
			board[i] = new Piece(Type.PAWN, i, ai);
			board[i+40] = new Piece(Type.PAWN, i+40, user);
		}
		board[0] = new Piece(Type.ROOK, 0, ai);
		board[1] = new Piece(Type.KNIGHT, 1, ai);
		board[2] = new Piece(Type.BISHOP, 2, ai);
		board[3] = new Piece(Type.QUEEN, 3, ai);
		board[4] = new Piece(Type.KING, 4, ai);
		board[5] = new Piece(Type.BISHOP, 2, ai);
		board[6] = new Piece(Type.KNIGHT, 1, ai);
		board[7] = new Piece(Type.ROOK, 0, ai);
		board[0+56] = new Piece(Type.ROOK, 0+56, user);
		board[1+56] = new Piece(Type.KNIGHT, 1+56, user);
		board[2+56] = new Piece(Type.BISHOP, 2+56, user);
		board[3+56] = new Piece(Type.QUEEN, 3+56, user);
		board[4+56] = new Piece(Type.KING, 4+56, user);
		board[5+56] = new Piece(Type.BISHOP, 2+56, user);
		board[6+56] = new Piece(Type.KNIGHT, 1+56, user);
		board[7+56] = new Piece(Type.ROOK, 0+56, user);
	}
	
	public void displayBoard(){
		for(int i=0;i<64;i++) {
			if(i%8==0) {
				System.out.print(8-i/8+" ");
			}
			if(board[i]!=null) {
				System.out.print(board[i].getType()+" ");
			}
			else {
				System.out.print("- ");
			}
			if(i%8==7) {
				System.out.println();
			}
		}
		System.out.print(" ");
		for(int i=0;i<8;i++) {
			System.out.print(" "+(char)('a'+i));
		}
	}
}
