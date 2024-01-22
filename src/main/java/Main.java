import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Board tablero = new Board();
        Knight c1= new Knight(tablero,new Coordinate('E',4), Knight.Type.BLACK);
        King r2=new King(tablero,new Coordinate('D',2), King.Type.WHITE);
        Bishop b1 = new Bishop(tablero, new Coordinate('F',2),Bishop.Type.BLACK);
        Bishop b2 = new Bishop(tablero, new Coordinate('E',8),Bishop.Type.WHITE);
        Queen q1 = new Queen(tablero, new Coordinate('D',5), Queen.Type.WHITE);
        Pawn p1 = new Pawn(tablero, new Coordinate('B', 7), Pawn.Type.WHITE);
        Pawn p2 = new Pawn(tablero, new Coordinate('C', 6), Pawn.Type.BLACK);
        Pawn p3 = new Pawn(tablero, new Coordinate('C', 2), Pawn.Type.BLACK);
        Pawn p4 = new Pawn(tablero, new Coordinate('B', 3), Pawn.Type.BLACK);
        Pawn p5 = new Pawn(tablero, new Coordinate('D', 3), Pawn.Type.WHITE);



        tablero.highligh(p1.getNextMovements());
        tablero.highligh(p3.getNextMovements());

        System.out.println(tablero);

    }
}
