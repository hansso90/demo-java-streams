package nl.lemkes.demo.java.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.infrastructure.ParkingArea;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.Color;

public class Exercise6 {

  public record ParkingAreaStatisticsAdvanced(
      String name, long spotsLeft, long spots, long spotUsed, Map<Color, Long> CarColorCounts) {}

  public static List<ParkingAreaStatisticsAdvanced> getParkingAreaAdvancedStatisticsOfParkingArea(
      final Harbor harbor) {
    return harbor.parkingAreas().stream()
        .map(Exercise6::createParkingAreaStatisticsAdvanced)
        .toList();
  }

  private static ParkingAreaStatisticsAdvanced createParkingAreaStatisticsAdvanced(
      final ParkingArea parkingArea) {
    return new ParkingAreaStatisticsAdvanced(
        parkingArea.name(),
        parkingArea.spots() - parkingArea.cars().size(),
        parkingArea.spots(),
        parkingArea.cars().size(),
        getAmountsOfColorsOnParkingArea(parkingArea));
  }

  private static Map<Color, Long> getAmountsOfColorsOnParkingArea(final ParkingArea parkingArea) {
    return parkingArea.cars().stream()
        .collect(Collectors.groupingBy(Car::color, Collectors.counting()));
  }
}
