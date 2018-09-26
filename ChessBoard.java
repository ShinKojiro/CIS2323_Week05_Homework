public class ChessBoard extends ChessPiece{
    private int vPos = 0;
    private int hPos = 0;
    //private char vPosChar = '';
    private final int BOARD_SQUARES = 8;
    private int b = 0;
    private Boolean isFilled = false;
    ChessBoard[][] newBoard = new ChessBoard[BOARD_SQUARES][BOARD_SQUARES];
    

    public void initializeBoard(){
        while (b < BOARD_SQUARES) {
            newBoard[hPos][vPos] = new ChessBoard();
            //for(j )
            for (int i = 0; i < BOARD_SQUARES; i++) {
                newBoard[BOARD_SQUARES][BOARD_SQUARES].setPosition(i);
                System.out.println("H Position is " + hPos);
                hPos++;
            }
            for (int i = 0; i < BOARD_SQUARES; i++) {
                vPos++;
                System.out.println("V Position is " + vPos);
            }

        }
    }
}