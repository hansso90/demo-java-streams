package nl.lemkes.demo.java.streams;

import java.util.Map;
import java.util.stream.Collectors;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.Color;

public class Exercise4 {

  private Exercise4() {}

  /**
   * Get the amount of cars for every color
   *
   * @param harbor
   * @return Amount of cars of each color
   */
  public static Map<Color, Long> getAmountsOfColorsOnHarbor(final Harbor harbor) {
    return harbor.parkingAreas().stream()
        .flatMap(parkingArea -> parkingArea.cars().stream())
        .collect(Collectors.groupingBy(Car::color, Collectors.counting()));
  }
}
