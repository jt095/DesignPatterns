package AbstractFactory;

public class Room extends MapSite{
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    };

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void Enter() {

    }

    public MapSite getSide(Direction direction) {
        switch (direction) {
            case NORTH -> {
                return sides[0];
            }
            case EAST -> {
                return sides[1];
            }
            case SOUTH -> {
                return sides[2];
            }
            case WEST -> {
                return sides[3];
            }
            default -> {
                return sides[0];
            }
        }
    };

    public void setSide(Direction direction, MapSite site) {
        switch (direction) {
            case NORTH -> {
               sides[0] = site;
            }
            case EAST -> {
               sides[1] = site;
            }
            case SOUTH -> {
               sides[2] = site;
            }
            case WEST -> {
               sides[3] = site;
            }
            default -> {
               sides[0] = site;
            }
        }
    }

    private final int roomNumber;
    private MapSite[] sides = new MapSite[4];
}
