public class Rook extends Piece{
    public Rook(Board board, Coordinate coordinate, Type type){
        super(type.getType(), board.getCellAt(coordinate));
    }

    @Override
    public Coordinate[] getNextMovements() {
        return getNextMovementsAsRook(this);

    }

    public static Coordinate[] getNextMovementsAsRook(Piece piece){
        Coordinate[] coordinates = new Coordinate[0];
        Coordinate initialPosition = piece.getCell().getCoordinate();
        Coordinate coordinate;
        Board board = piece.getCell().getBoard();

        //Up
        coordinate = initialPosition;
        do {
            coordinate = coordinate.up();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //Down
        coordinate = initialPosition;
        do {
            coordinate = coordinate.down();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //Right
        coordinate = initialPosition;
        do {
            coordinate = coordinate.right();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //Left
        coordinate = initialPosition;
        do {
            coordinate = coordinate.left();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);

        return coordinates;
    }



    public enum Type {
        BLACK(Piece.Type.BLACK_ROOK),
        WHITE(Piece.Type.WHITE_ROOK);

        private Piece.Type type;

        Type(Piece.Type type) {
            this.type = type;
        }

        public Piece.Type getType() {
            return type;
        }
    }
}
