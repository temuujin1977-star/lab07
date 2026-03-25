package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    // Task 1: Road pote j "Information Expert" che, tethi logic ahi hovu joie
    public boolean isOccupied(int position) {
        return occupied[position];
    }

    public boolean isValid(int position) {
        return position >= 0 && position < occupied.length;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }
}