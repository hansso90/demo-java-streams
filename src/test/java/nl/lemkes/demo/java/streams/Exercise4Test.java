package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import org.junit.jupiter.api.Test;

class Exercise4Test {

  @Test
  void exercise4Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final var mapAmountOfColorsByCar = Exercise4.getAmountsOfColorsOnHarbor(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(mapAmountOfColorsByCar);
  }
}
