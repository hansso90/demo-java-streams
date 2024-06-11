package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import org.junit.jupiter.api.Test;

class Exercise6Test {

  @Test
  void exercise6Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final List<Exercise6.ParkingAreaStatisticsAdvanced> statistics =
        Exercise6.getParkingAreaAdvancedStatisticsOfParkingArea(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(statistics);
  }
}
