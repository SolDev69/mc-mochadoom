package mochadoom;
import java.io.IOException;

public class Main {
  public static void main(String... args) {
    try {
      Engine.main(new String[]{"-iwad", "./DOOM.WAD"});
    } catch (IOException e) {
      System.out.println("Error loading DOOM.WAD!");
      e.printStackTrace();
    }
  }
}
