package AbstractFactory;

import java.util.NoSuchElementException;

public class Door extends MapSite{
    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideFrom(Room room) {
        if (room == room1) return room2;
        else if (room == room2) return room1;
        else throw new NoSuchElementException("Provided room is not attached to this door");
    }

    @Override
    public void Enter() {};

    private Room room1;
    private Room room2;
    private boolean isOpen;
}
