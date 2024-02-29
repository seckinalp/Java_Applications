import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Facility {

  public int numberOfRooms;
  public ArrayList<Room> rooms;

  public Facility(String txtName) throws FileNotFoundException {
    rooms = new ArrayList<>();
    importFacility(txtName);
  }

  public void importFacility(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner sc = new Scanner(file);
    numberOfRooms = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < numberOfRooms; i++) {
      String temp1 = sc.nextLine();
      String name = temp1.substring(0, 4);
      int numberst = Integer.parseInt(temp1.substring(5));
      Room temp = new Room(name, numberst);
      rooms.add(temp);
    }

    while (sc.hasNextLine()) {
      String temp = sc.nextLine();
      String room1 = temp.substring(0, 4);
      String room2 = temp.substring(5);
      addConnection(room1, room2);
    }
    sc.close();
  }

  public void addConnection(String roomOne, String roomTwo) {
    findRoom(roomOne).connectedRooms.add(findRoom(roomTwo));
    findRoom(roomTwo).connectedRooms.add(findRoom(roomOne));
  }

  public Room findRoom(String roomName) {
    for (int i = 0; i < rooms.size(); i++) {
      if (rooms.get(i).roomName.equals(roomName)) {
        return rooms.get(i);
      }
    }
    return null;
  }

  public void securityAttack(String roomName, int attackLevel) {
    if (findRoom(roomName).breached == false) {
      if (findRoom(roomName).securityLevel < attackLevel) {
        findRoom(roomName).breached = true;

        for (int i = 0; i < findRoom(roomName).connectedRooms.size(); i++) {
          securityAttack(
            findRoom(roomName).connectedRooms.get(i).roomName,
            attackLevel
          );
        }
      }
    }
  }

  public void fakeSecurityAttack(String roomName, int attackLevel) {
    if (findRoom(roomName).breached == false) {
      if (findRoom(roomName).securityLevel2 < attackLevel) {
        findRoom(roomName).breached = true;
        for (int i = 0; i < findRoom(roomName).connectedRooms.size(); i++) {
          securityAttack(
            findRoom(roomName).connectedRooms.get(i).roomName,
            attackLevel
          );
        }
      }
    }
  }

  public void reset() {
    for (int i = 0; i < rooms.size(); i++) {
      if (rooms.get(i).breached == true) {
        System.out.println(rooms.get(i).roomName + " is Breached...");
        rooms.get(i).breached = false;
        rooms.get(i).securityLevel += 1;
      }
    }
  }

  public void fakeReset() {
    for (int i = 0; i < rooms.size(); i++) {
      if (rooms.get(i).breached == true) {
        rooms.get(i).breached = false;
        rooms.get(i).securityLevel2 += 1;
      }
    }
  }

  public void simulateAttacks(int numberOfTries) {
    for (int i = 1; i <= numberOfTries; i++) {
      int random = (int) (Math.random() * rooms.size());
      fakeSecurityAttack(rooms.get(random).roomName, i);
      fakeReset();
    }
    System.out.println("The following rooms have security change: ");
    int check = 1;
    for (int i = 0; i < rooms.size(); i++) {
      if (rooms.get(i).securityLevel != rooms.get(i).securityLevel2) {
        check = 0;
        System.out.println(
          rooms.get(i).roomName +
          ":  " +
          rooms.get(i).securityLevel +
          " to " +
          rooms.get(i).securityLevel2
        );
      }
    }
    if (check == 1) {
      System.out.println("No rooms have been breached.");
    }
  }

  public void printAllStatus() {
    for (int i = 0; i < rooms.size(); i++) {
      System.out.println(
        rooms.get(i).roomName + ": " + rooms.get(i).securityLevel
      );
    }
  }
}
