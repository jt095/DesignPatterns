package AbstractFactory;

public abstract class MazeFactory {
    public MazeFactory() {};
    public abstract Maze makeMaze();
    public abstract Wall makeWall();
    public abstract Room makeRoom(int n);
    public abstract Door makeDoor(Room room1, Room room2);
}
