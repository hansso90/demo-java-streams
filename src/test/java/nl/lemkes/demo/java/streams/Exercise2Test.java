package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import org.junit.jupiter.api.Test;

class Exercise2Test {

  @Test
  void exercise2Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final var totalAmount = Exercise2.getTotalAmountOfAllCarsOfHarbor(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(totalAmount);
  }
}
