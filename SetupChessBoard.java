//k, i'm stumped :|

import java.util.*;
public class SetupChessBoard{
    public static void main(String[] args) {
        
        ChessBoard board = new ChessBoard();

        board.fillEmptyBoard();

        ChessPiece pawn = new ChessPiece();
        pawn.setPosition(2,2);
        pawn.printInfo();
        //pawn.setPosition(pawn, 2,2);
        //board.addPiece(pawn.getPieceNumber());
        ChessPiece rook = new ChessPiece();
        ChessPiece knight = new ChessPiece();
        ChessPiece bishop = new ChessPiece();
        ChessPiece king = new ChessPiece();
        ChessPiece queen = new ChessPiece();

        int a = 1;
        for (int i = 0; i < 8; i++) {
            System.out.print(a);
            a++;
            for (int j = 0; j < 8; j++) {
                board.printBoard(i,j);
            }
           System.out.println();
        }
        System.out.println("  a b c d e f g h");

        final int PIECES_PER_PLAYER = 16;
        final int PAWNS_PER_PLAYER = 8;
        final int ROOKS_PER_PLAYER = 2;
        final int KNIGHTS_PER_PLAYER = 2;
        final int BISHOPS_PER_PLAYER = 2;
        final int KING_OR_QUEEN_PER_PLAYER = 1;
        //int[] wChessPieces = new int[PIECES_PER_PLAYER];
        //int[] bChessPieces = new int[PIECES_PER_PLAYER];
        ChessPiece[] wChessPieces = new ChessPiece[PIECES_PER_PLAYER];
        ChessPiece[] bChessPieces = new ChessPiece[PIECES_PER_PLAYER];
        ChessPiece[][] wPawns = new ChessPiece[PAWNS_PER_PLAYER][PIECES_PER_PLAYER];
        ChessPiece[][] wKnights = new ChessPiece[KNIGHTS_PER_PLAYER][PIECES_PER_PLAYER];
        ChessPiece[][] wBishops = new ChessPiece[BISHOPS_PER_PLAYER][PIECES_PER_PLAYER];
        ChessPiece[][] wRooks = new ChessPiece[ROOKS_PER_PLAYER][PIECES_PER_PLAYER];
        ChessPiece[][] wKing = new ChessPiece[KING_OR_QUEEN_PER_PLAYER][PIECES_PER_PLAYER];
        ChessPiece[][] wQueen = new ChessPiece[KING_OR_QUEEN_PER_PLAYER][PIECES_PER_PLAYER];

        int i = 0;
        int x = 0;
        int l = 0;
        int y1 = 2;
        int y2 = 7;
        while(i < PIECES_PER_PLAYER){
            
            wChessPieces[i] = new ChessPiece();
            bChessPieces[i] = new ChessPiece();
            wChessPieces[i].setColor("White");
            bChessPieces[i].setColor("Black");
            wChessPieces[i].setPieceNumber(i);
            bChessPieces[i].setPieceNumber(i);
            wChessPieces[i].setPosition((x + 1) , y1);
            bChessPieces[i].setPosition((x + 1) , y2);
            x++;
            if (x == 8){
                x = 0;
                y1--;
                y2++;
            }
            i++;
        }
        
        while (i < PIECES_PER_PLAYER) {
            wPawns[i][l] = new ChessPiece();
            wPawns[i][l].setPosition((x + 1), y1);
            x++;
            if (x == 8){
                    x = 0;
                    y1--;
                    //y2++;
                }
        }
        // while(i < PAWNS_PER_PLAYER){
        //     ChessPiece pawn[i] = new ChessPiece(board);
        //     pawn[i].setPosition(board(2,2));
        // }
        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            System.out.println(" " + wChessPieces[j].printInfo());
            //System.out.println(bChessPieces[j].printInfo());
        }
        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            System.out.println(" " + bChessPieces[j].printInfo());
            //System.out.println(bChessPieces[j].printInfo());
        }
        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            for (int k = 0; k < PAWNS_PER_PLAYER; k++) {
                System.out.println(" " + wPawns[j][k].printInfo());
                //System.out.println(bChessPieces[j].printInfo());
            }

        }
        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            System.out.println(" " + bChessPieces[j].printInfo());
            //System.out.println(bChessPieces[j].printInfo());
        }
        // a = 1;
        // for (int k = 0; k < 8; k++) {
        //     System.out.print(a);
        //     a++;
        //     for (int j = 0; j < 8; j++) {
        //         board.printBoard(k,j);
        //     }
        //    System.out.println();
        // }
        // System.out.println("  a b c d e f g h");
    }
}