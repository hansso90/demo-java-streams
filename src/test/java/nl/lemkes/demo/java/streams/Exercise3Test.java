package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import org.junit.jupiter.api.Test;

class Exercise3Test {

  @Test
  void exercise3Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final var totalAmount = Exercise3.getTotalBlueCarsAtAllParking(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(totalAmount);
  }
}
