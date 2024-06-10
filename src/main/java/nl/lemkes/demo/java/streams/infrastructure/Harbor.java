package nl.lemkes.demo.java.streams.infrastructure;

import java.util.List;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.util.RandomUtil;

public record Harbor(List<ParkingArea> parkingAreas) {

  public ParkingArea getParkingAreaByName(final String parkingAreaName) {
    return parkingAreas.stream()
        .filter(parkingArea -> parkingArea.name().equals(parkingAreaName))
        .findFirst()
        .orElseThrow(
            () ->
                new IllegalArgumentException(
                    "There is no ParkingArea with name %s".formatted(parkingAreaName)));
  }

  public void park(final List<Car> cars) {
    cars.stream().forEach(this::park);
  }

  public void park(final Car car) {
    final int i = RandomUtil.nextInt(parkingAreas.size());
    park(i, car);
  }

  public void park(final int parkingArea, final Car car) {
    if (!parkingAreas.get(parkingArea).park(car)) {
      park(parkingArea + 1, car);
    }
  }
}
