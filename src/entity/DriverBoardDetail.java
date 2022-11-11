package entity;

public class DriverBoardDetail {
    private Line line;
    private int numberofTurns;

    public DriverBoardDetail(Line line, int numberofTurns) {
        this.line = line;
        this.numberofTurns = numberofTurns;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public int getNumberofTurns() {
        return numberofTurns;
    }

    public void setNumberofTurns(int numberofTurns) {
        this.numberofTurns = numberofTurns;
    }

    @Override
    public String toString() {
        return "DriverBoardDetail{" +
                "line=" + line +
                ", numberofTurns=" + numberofTurns +
                '}';
    }
}
