package frogger;

public class Frogger {
    private final Road road; 
    private int position;
    private final Records records;
    
    // ЗАСВАР: 6 салангид String-ийг нэг объект болгон нэгтгэв
    private final FroggerID id;

    public Frogger(Road road, int position, Records records, FroggerID id) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.id = id;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself() {
        // ЗАСВАР: Урт параметрийн жагсаалтын оронд объектыг дамжуулна
        return records.addRecord(id);
    }
}