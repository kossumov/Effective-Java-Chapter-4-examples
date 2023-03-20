import example1.ListExample;
import example1.Thing;
import example2.Time;
import example4.InstrumentedHashSet;
import java.util.List;

public class Main {

  public static void main(String[] args) {
  }

  private static void example1FinalStaticArray() {
    ListExample listExample = new ListExample();

    System.out.println(listExample.VALUES.get(0));
    listExample.VALUES.set(0, new Thing("Pencil"));
    System.out.println(listExample.VALUES.get(0));

    // System.out.println(listExample.VALUES[0]);
    // listExample.VALUES[0] = new example1.Thing("Pencil");
    // System.out.println(listExample.VALUES[0]);


    // listExample.HOURS_PER_DAY = 7;
  }

  private static void example2Invariants() {
    Time time = new Time(12, 23);
  }

  private static void example4Inheritance() {
    InstrumentedHashSet<String> s = new InstrumentedHashSet<>() ;
    s.addAll(List.of("Snap", "Crackle", "Pop"));
    System.out.println(s.getAddCount());

    // POSSIBLE SOLUTION 1
    // Solution to not override addAll
    // However, we will depend on superclass

    // POSSIBLE SOLUTION 2
    // We can rewrite addAll to iterate through collection
    // However, it's rewriting the method implementation which is time-consuming

    // POSSIBLE SOLUTION 3
    // Add new methods with new names
    // However, it is possible that superclass add these methods in the future (перекрытие)
  }
}