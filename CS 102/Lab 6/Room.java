import java.util.ArrayList;

/**
 * Room
 */
public class Room {

  public String roomName;
  public int securityLevel;
  public int securityLevel2;
  public ArrayList<Room> connectedRooms;
  public boolean breached = false;

  public Room(String roomName, int securityLevel) {
    this.roomName = roomName;
    this.securityLevel = securityLevel;
    this.securityLevel2 = securityLevel;
    connectedRooms = new ArrayList<>();
  }

  public String toString() {
    return roomName;
  }
}
