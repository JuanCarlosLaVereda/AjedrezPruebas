public class King extends Piece{
    public King(Board board, Coordinate coordinate, Type type){
        super(type.getType(), board.getCellAt(coordinate));
    }

    @Override
    public Coordinate[] getNextMovements() {
        Coordinate[] coordinates = new Coordinate[0];
        Coordinate initialPosition = getCell().getCoordinate();
        Coordinate coordinate;

        //up
        coordinate = initialPosition.up();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }
        coordinate = initialPosition.up().right();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }
        coordinate = initialPosition.up().left();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }
        coordinate = initialPosition.down();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }
        coordinate = initialPosition.down().right();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }
        coordinate = initialPosition.down().left();
        if (canAddToNextMovements(coordinate)){
            Tool.add(coordinate, coordinates);
        }

        return coordinates;
    }

    public enum Type{
        BLACK(Piece.Type.BLACK_KING),
        WHITE(Piece.Type.WHITE_KING);

        private Piece.Type type;
        Type(Piece.Type type){
            this.type=type;
        }

        public Piece.Type getType() {
            return type;
        }
    }

}
