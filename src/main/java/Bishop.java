public class Bishop extends Piece {
    public Bishop(Board board, Coordinate coordinate, Type type) {
        super(type.getType(), board.getCellAt(coordinate));
    }

    @Override
    public Coordinate[] getNextMovements() {
        return getNextMovementsAsBishop(this);

    }

    public static Coordinate[] getNextMovementsAsBishop(Piece piece){
        Coordinate[] coordinates = new Coordinate[0];
        Coordinate initialPosition = piece.getCell().getCoordinate();
        Coordinate coordinate;
        Board board = piece.getCell().getBoard();

        //UpRight
        coordinate = initialPosition;
        do {
            coordinate = coordinate.diagonalUpRight();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //UpLeft
        coordinate = initialPosition;
        do {
            coordinate = coordinate.diagonalUpLeft();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //DownRight
        coordinate = initialPosition;
        do {
            coordinate = coordinate.diagonalDownRight();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);
        //DownLeft
        coordinate = initialPosition;
        do {
            coordinate = coordinate.diagonalDownLeft();
            if (piece.canAddToNextMovements(coordinate)){
                coordinates = Tool.add(coordinate,coordinates);
            }
        } while (board.contains(coordinate) && board.getCellAt(coordinate).getPiece()==null);

        return coordinates;
    }

    public enum Type {
        BLACK(Piece.Type.BLACK_BISHOP),
        WHITE(Piece.Type.WHITE_BISHOP);

        private Piece.Type type;

        Type(Piece.Type type) {
            this.type = type;
        }

        public Piece.Type getType() {
            return type;
        }
    }
}
