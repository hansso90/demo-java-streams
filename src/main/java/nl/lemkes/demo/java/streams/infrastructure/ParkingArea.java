package nl.lemkes.demo.java.streams.infrastructure;

import java.util.List;
import nl.lemkes.demo.java.streams.traffic.Car;

public record ParkingArea(String name, long spots, List<Car> cars) {

  public boolean park(final Car car) {
    if (spots <= cars.size()) {
      return false;
    }
    System.out.println("Car parked at " + name + " : " + car);
    cars.add(car);
    return true;
  }
}
