public class Position {

    // Encapsulation
    private int row;    
    private int column;
    
    // Constructors
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    // ToString
    @Override
    public String toString() {
        return row + ", " + column;
    }
    
}
