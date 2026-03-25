package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    private final Road road;
    private int position;
    
    // Field for task 2.
    private final Records records;
    // Task 2 Fix: 6 Strings ne badle ek j object (Data Clump Fixed)
    private final FroggerID id;

    public Frogger(Road road, int position, Records records, FroggerID id) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.id = id;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!isValid(nextPosition) || isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    // Task 1 Fix: Road mathi logic call karvu (Feature Envy Fixed)
    public boolean isOccupied(int position) {
        return this.road.isOccupied(position);
    }
    
    public boolean isValid(int position) {
        return this.road.isValid(position);
    }

    /**
     * Records Frogger to the list of records.
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
      // Task 2 Fix: Akho ID object moklavo (Long Parameter List Fixed)
      return records.addRecord(id);
    }
}