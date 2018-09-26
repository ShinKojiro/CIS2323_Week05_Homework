public class ChessPiece extends ChessBoard{
    private int vPos;
    private int hPos;
    private String pieceColor;
    private int pieceNumber;
    private String pieceType;
    private String pieceName;
    private String piecePosition;
    private char vPosChar;

    public void setPosition(int x, int y){
        hPos = x;
        vPos = y;
        switch(hPos){
            case 1:
            vPosChar = 'a';
            break;
            case 2:
            vPosChar = 'b';
            break;
            case 3:
            vPosChar = 'c';
            break;
            case 4:
            vPosChar = 'd';
            break;
            case 5:
            vPosChar = 'e';
            break;
            case 6:
            vPosChar = 'f';
            break;
            case 7:
            vPosChar = 'g';
            break;
            case 8:
            vPosChar = 'h';
            break;
        }
    }
    public String getPosition(){
        String piecePosition = (vPosChar + "" + vPos);
        return piecePosition;
    }
    public int getPosition(int x, int y){
        return (hPos + vPos);
    }
    public void setColor(String color){
        pieceColor = color;
    }
    public String getColor(){
        return pieceColor;
    }
    public void setPieceNumber(int nb){
        pieceNumber = nb;
        switch(pieceNumber){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            //pieceType = ("Pawn" + " " + (pieceNumber + 1) + "");
            pieceType = ("P");
            break;
            case 8:
            case 15:
            pieceType = ("R");
            break;
            case 9:
            case 14:
            pieceType = ("K");
            break;
            case 10:
            case 13:
            pieceType = ("B");
            break;
            case 11:
            pieceType = ("O");
            break;
            case 12:
            pieceType = ("Q");
            break;
        }
    }
    public String getPieceNumber(){
        return pieceType;
    }

    public String printInfo(){
        return /*"Placing " + getColor() + " " +*/ getPieceNumber() + " at " + getPosition();
    }
}

