public class ChessBoard{
    private int vPos;
    private int hPos;
    private char vPosChar;
    private String boardPosition;
    private String pieceName;
    // private final int BOARD_SQUARES = 8;
    // private int b = 0;
    private Boolean isFilled = false;
    private String[][] chessBoard = new String[8][8];


    // public void boardSize(int h, int v){
    //     chessBoard = new String[h][v];
    // }
    public void fillEmptyBoard(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                chessBoard[x][y] = "-";
            }
        }
        // // Rooks
        // chessBoard [0][0] = "R";
        // chessBoard [0][7] = "R";
        // chessBoard [7][0] = "R";
        // chessBoard [7][7] = "R";
 
        // // Knights
        // chessBoard [0][1] = "N";
        // chessBoard [0][6] = "N";
        // chessBoard [7][1] = "N";
        // chessBoard [7][6] = "N";
 
        // //Bishops
        // chessBoard [0][2] = "B";
        // chessBoard [0][5] = "B";
        // chessBoard [7][2] = "B";
        // chessBoard [7][5] = "B";
 
        // //Queens
        // chessBoard [0][3] = "Q";
        // chessBoard [7][3] = "Q";
 
        // //Kings
        // chessBoard [0][4] = "K";
        // chessBoard [7][4] = "K";
 
 
        // //Pawns
        // for (int i = 0; i < 8; i++) {
        //     chessBoard[1][i] = "P";
        //     chessBoard[6][i] = "P";
        // }
    }
    public void addPiece(int x, int y){
        //chessBoard[x][y] = piece;
        hPos = x;
        vPos = y;
        // switch(hPos){
        //     case 1:
        //     vPosChar = 'a';
        //     break;
        //     case 2:
        //     vPosChar = 'b';
        //     break;
        //     case 3:
        //     vPosChar = 'c';
        //     break;
        //     case 4:
        //     vPosChar = 'd';
        //     break;
        //     case 5:
        //     vPosChar = 'e';
        //     break;
        //     case 6:
        //     vPosChar = 'f';
        //     break;
        //     case 7:
        //     vPosChar = 'g';
        //     break;
        //     case 8:
        //     vPosChar = 'h';
        //     break;
        // }
    }
    public String getPiece(){
        String boardPosition = (hPos + "" + vPos);
        return boardPosition;
    }
    public void printBoard(int x, int y){
        System.out.print(" " + chessBoard[x][y]);
        //System.out.print(" " + getPiece());
    }
    
    // public void printBoard() {
    //     for (int i = 0; i < 8; i++) {
    //        for (int j = 0; j < 8; j++) {
    //             System.out.print(chessBoard[hPos][vPosChar]);
    //         }
    //         System.out.println();
    //     }
    // }

    /*public void filledSpot(Boolean f){
        isFilled = f;
        f = false
        if{
            c
        }
    }*/


    /* Hrm..
    ChessBoard[][] newBoard = new ChessBoard[BOARD_SQUARES][BOARD_SQUARES];
    

    public void initializeBoard(){
        while (b < BOARD_SQUARES) {
            newBoard[hPos][vPos] = new ChessBoard();
            //for(j )
            for (int i = 0; i < BOARD_SQUARES; i++) {
                System.out.println("H Position is " + hPos);
                hPos++;
            }
            for (int i = 0; i < BOARD_SQUARES; i++) {
                vPos++;
                System.out.println("V Position is " + vPos);
            }

        }
    }*/
}