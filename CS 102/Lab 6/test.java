import java.io.FileNotFoundException;

public class test {

  public static void main(String[] args) throws FileNotFoundException {
    Facility x = new Facility("sample_input.txt");
    x.securityAttack("cmpt", 11);
    x.reset();
    x.printAllStatus();
  }
}
