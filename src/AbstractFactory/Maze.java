package AbstractFactory;

import java.util.HashMap;

public class Maze {
    public Maze() {};

    public void addRoom(Room room) {
        rooms.put(room.getRoomNumber(), room);
    };

    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }

    private HashMap<Integer, Room> rooms = new HashMap<Integer, Room>();
}
