package nl.lemkes.demo.java.streams;

import java.util.List;
import java.util.Map;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Color;

public class Exercise6 {

  public record ParkingAreaStatisticsAdvanced(
      String name, long spotsLeft, long spots, long spotUsed, Map<Color, Long> CarColorCounts) {}

  /**
   * Create a new object out of harbor what contains: <br>
   * - name <br>
   * - spots Left on parking <br>
   * - spots <br>
   * - spotsUsed <br>
   * - Map<Color, Long> amount of cars by color <br>
   *
   * @param harbor
   * @return List of ParkingAreaStatisticsAdvanced
   */
  public static List<ParkingAreaStatisticsAdvanced> getParkingAreaAdvancedStatisticsOfParkingArea(
      final Harbor harbor) {
    return List.of();
  }
}
