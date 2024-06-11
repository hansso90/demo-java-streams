package nl.lemkes.demo.java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExplainer {

  public static void main(final String[] args) {
    unsafeParallel();

    safeParallel();

    safeParallelWithCollection();
  }

  /** Unsafe use of parallel stream */
  public static void unsafeParallel() {
    final List<Integer> list = new ArrayList<>();

    // This parallel stream modifies a shared list without synchronization
    IntStream.range(0, 1000).parallel().forEach(list::add);

    // The size of the list might not be 1000 due to race conditions
    System.out.println("Thread unsafe list size: " + list.size());
  }

  /** safe use of parallel stream */
  public static void safeParallel() {
    final List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    // This parallel stream modifies a synchronized list
    IntStream.range(0, 1000).parallel().forEach(list::add);

    // The size of the list will now be 1000
    System.out.println("Thread safe List size: " + list.size());
  }

  /** safe use of parallel stream */
  public static void safeParallelWithCollection() {

    // This parallel stream modifies a shared list without synchronization
    final List<Integer> list = IntStream.range(0, 1000).parallel().boxed().toList();

    // The size of the list might not be 1000 due to race conditions
    System.out.println("Thread safe List size (using collector): " + list.size());
  }
}
