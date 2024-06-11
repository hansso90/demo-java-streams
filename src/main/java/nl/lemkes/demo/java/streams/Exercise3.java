package nl.lemkes.demo.java.streams;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Color;

public class Exercise3 {

  private Exercise3() {}

  /**
   * Get total Blue cars at all parking lot
   *
   * @param harbor
   * @return Total amount of blue cars
   */
  public static Long getTotalBlueCarsAtAllParking(final Harbor harbor) {
    return harbor.parkingAreas().stream()
        .flatMap(parkingArea -> parkingArea.cars().stream())
        .filter(car -> Color.BLUE.equals(car.color()))
        .count();
  }
}
