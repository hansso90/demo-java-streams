package nl.lemkes.demo.java.streams;

import static nl.lemkes.demo.java.streams.Main.PARKING_NAME_A;

import java.util.List;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.Color;

public class Exercise1 {

  private Exercise1() {}

  /**
   * Get from Parking A all the blue Cars
   *
   * @param harbor
   * @return Cars that are Blue
   */
  public static List<Car> getAllBlueCarsOfParkingA(final Harbor harbor) {
    return harbor.getParkingAreaByName(PARKING_NAME_A).cars().stream()
        .filter(car -> Color.BLUE.equals(car.color()))
        .toList();
  }
}
