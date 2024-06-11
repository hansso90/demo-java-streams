package nl.lemkes.demo.java.streams;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.tuple.Triple;

public class MultiValueWithinStreamExplainer {

  /**
   * Triple example, usecase when you need three elements except two of a object
   *
   * <p>With two -> Pair<br>
   * With three -> Triple<br>
   * with more -> create an object;<br>
   *
   * @param args
   */
  public static void main(final String[] args) {
    final List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    final List<Integer> ages = Arrays.asList(25, 30, 35);
    final List<String> cities = Arrays.asList("New York", "Los Angeles", "Chicago");

    // Apache Commons
    final List<String> triples =
        names.stream()
            .map(
                name ->
                    Triple.of(name, ages.get(names.indexOf(name)), cities.get(names.indexOf(name))))
            .map(
                triple ->
                    "Name: "
                        + triple.getLeft()
                        + ", Age: "
                        + triple.getMiddle()
                        + ", City: "
                        + triple.getRight())
            .toList();

    // Print the list of Triple objects
    triples.forEach(string -> System.out.println(string));
  }
}
