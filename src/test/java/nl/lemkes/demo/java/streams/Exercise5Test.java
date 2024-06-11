package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import org.junit.jupiter.api.Test;

class Exercise5Test {

  @Test
  void exercise5Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final var damageReportRecord = Exercise5.getLatestDamageReportRecordOfTheHarbor(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(damageReportRecord);
  }
}
