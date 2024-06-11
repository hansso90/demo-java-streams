package nl.lemkes.demo.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import org.junit.jupiter.api.Test;

class Exercise1Test {

  @Test
  void exercise1Test() {

    final Harbor simpleHarbor = SimpleHarborGenerator.getSimpleHarbor();

    final List<Car> allBlueCarsOfParkingA = Exercise1.getAllBlueCarsOfParkingA(simpleHarbor);

    System.out.println("-----------------------------------");
    System.out.println(allBlueCarsOfParkingA);
  }
}
