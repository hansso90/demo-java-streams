package nl.lemkes.demo.java.streams;

import java.util.Comparator;
import java.util.Optional;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.DamageReportRecord;

public class Exercise5 {

  /**
   * Get last entry of a damage car use methode {@link Car#getLatestDamageReport()}
   *
   * @param harbor
   * @return Amount of cars of each color
   */
  public static DamageReportRecord getLatestDamageReportRecordOfTheHarbor(final Harbor harbor) {
    return harbor.parkingAreas().stream()
        .flatMap(parkingArea -> parkingArea.cars().stream())
        .map(Car::getLatestDamageReport)
        .filter(Optional::isPresent)
        .map(Optional::get)
        .max(Comparator.comparing(DamageReportRecord::date))
        .orElse(null);
  }
}
