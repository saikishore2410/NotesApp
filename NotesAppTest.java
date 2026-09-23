import java.nio.file.*;
public class NotesAppTest {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a) throws Exception {
    Path p=Paths.get("notes.txt"); Files.deleteIfExists(p);
    NotesApp.writeNote("first");
    NotesApp.writeNote("second");
    String s=Files.readString(p);
    check(s.contains("first") && s.contains("second"),"notes persisted");
    Files.deleteIfExists(p);
    System.out.println("Notes tests passed");
  }
}