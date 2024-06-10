package nl.lemkes.demo.java.streams.traffic;

import java.util.List;
import java.util.UUID;
import java.util.stream.LongStream;
import nl.lemkes.demo.java.streams.util.RandomUtil;

public class TrafficGenerator {

  public static List<Car> generateTraffic(final long minCars, final long maxCars) {
    final long cars = RandomUtil.nextLong(minCars, maxCars);
    return LongStream.range(0, cars).mapToObj(TrafficGenerator::generateCar).toList();
  }

  private static Car generateCar(final long id) {
    return new Car(id, Color.getRandomColor(), UUID.randomUUID(), hasDamage());
  }

  private static List<DamageReportRecord> hasDamage() {
    if (RandomUtil.nextInt(100) % 7 == 0) {
      return List.of(
          new DamageReportRecord(RandomUtil.randomLocalDate(), DamageType.getRandomDamage()));
    }
    return null;
  }
}
