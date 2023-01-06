import java.util.HashSet;
import java.util.Set;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("===================================");
    //aki eu istanciei um set usando o implementaçao HashSet<> que e a implementaçao mais rapida
    Set<String> set = new HashSet<>();
    set.add("TV");
    set.add("Tablet");
    set.add("Notebook");

    System.out.println(set.contains("Notebook"));
    for (String p : set) {
      System.out.println(p);
    }

    System.out.println("===================================");
  }
}
