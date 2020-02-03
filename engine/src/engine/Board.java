package engine;


public class Board {
	Piece board [] = new Piece[64];
	Player user1, user2;
	/*
	 * Board(FEN){
	 * }
	 */
	Board(Player user1, Player user2){
		
		for(int i=8;i<16;i++) {
			board[i] = new Piece(Type.PAWN, i, user1);
			board[i+40] = new Piece(Type.PAWN, i+40, user2);
		}
		board[0] = new Piece(Type.ROOK, 0, user1);
		board[1] = new Piece(Type.KNIGHT, 1, user1);
		board[2] = new Piece(Type.BISHOP, 2, user1);
		board[3] = new Piece(Type.QUEEN, 3, user1);
		board[4] = new Piece(Type.KING, 4, user1);
		board[5] = new Piece(Type.BISHOP, 2, user1);
		board[6] = new Piece(Type.KNIGHT, 1, user1);
		board[7] = new Piece(Type.ROOK, 0, user1);
		board[0+56] = new Piece(Type.ROOK, 0+56, user2);
		board[1+56] = new Piece(Type.KNIGHT, 1+56, user2);
		board[2+56] = new Piece(Type.BISHOP, 2+56, user2);
		board[3+56] = new Piece(Type.QUEEN, 3+56, user2);
		board[4+56] = new Piece(Type.KING, 4+56, user2);
		board[5+56] = new Piece(Type.BISHOP, 2+56, user2);
		board[6+56] = new Piece(Type.KNIGHT, 1+56, user2);
		board[7+56] = new Piece(Type.ROOK, 0+56, user2);
	}
	
	public void displayBoard(){
		System.out.println();
		for(int row=7;row>=0;row--) {
			System.out.print(row+1+" ");
			for(int col=0;col<8;col++) {
				if(board[row*8+col]!=null) {
					System.out.print(board[row*8+col].getType()+" ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.print(" ");
		for(int i=0;i<8;i++) {
			System.out.print(" "+(char)('a'+i));
		}
	}
	
	public void updateBoard(Move move) {
		board[move.dest] = board[move.source];
		board[move.source] = null;
	}
}
