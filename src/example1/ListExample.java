package example1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
//  public static final example1.Thing[] VALUES = {new example1.Thing("Bag"), new example1.Thing("Pen")};
//  public static final int HOURS_PER_DAY = 24;
//  private static final int HOURS_PER_DAY = 24;

  private static final Thing[] PRIVATE_VALUES = {new Thing("Bag"), new Thing("Pen")};
  public static final List<Thing> VALUES =
      Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
