package nl.lemkes.demo.java.streams;

import nl.lemkes.demo.java.streams.infrastructure.Harbor;

public class Exercise2 {

  private Exercise2() {}

  /**
   * Get the total amount of all cars;
   *
   * @param harbor
   * @return The total amount of all cars;
   */
  public static Integer getTotalAmountOfAllCarsOfHarbor(final Harbor harbor) {
    return harbor.parkingAreas().stream()
        .map(parkingArea -> parkingArea.cars().size())
        .reduce(0, Integer::sum);
  }
}
